package thebetweenlands.common.block.plant;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.MutableBlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thebetweenlands.client.tab.BLCreativeTabs;
import thebetweenlands.common.item.tools.ISickleHarvestable;
import thebetweenlands.common.registries.ItemRegistry;

public class BlockMoss extends BlockDirectional implements IShearable, ISickleHarvestable {
	protected static final AxisAlignedBB MOSS_UP_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.2D, 1.0D);
	protected static final AxisAlignedBB MOSS_DOWN_AABB = new AxisAlignedBB(0.0D, 0.8D, 0.0D, 1.0D, 1.0D, 1.0D);
	protected static final AxisAlignedBB MOSS_WEST_AABB = new AxisAlignedBB(0.8D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	protected static final AxisAlignedBB MOSS_EAST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.2D, 1.0D, 1.0D);
	protected static final AxisAlignedBB MOSS_SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.2D);
	protected static final AxisAlignedBB MOSS_NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.8D, 1.0D, 1.0D, 1.0D);

	protected ItemStack sickleHarvestableDrop;
	protected boolean isReplaceable = false;

	public BlockMoss() {
		super(Material.PLANTS);
		this.setHardness(0.6F);
		this.setSoundType(SoundType.PLANT);
		this.setCreativeTab(BLCreativeTabs.PLANTS);
		this.setTickRandomly(true);
	}

	public BlockMoss setSickleDrop(ItemStack drop) {
		this.sickleHarvestableDrop = drop;
		return this;
	}

	public BlockMoss setReplaceable(boolean replaceable) {
		this.isReplaceable = replaceable;
		return this;
	}

	@Override
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
		return this.isReplaceable;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing)state.getValue(FACING)).getIndex();
	}

	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		if (this.canPlaceAt(worldIn, pos, facing)) {
			return this.getDefaultState().withProperty(FACING, facing);
		} else {
			for (EnumFacing enumfacing : EnumFacing.values()) {
				if (worldIn.isSideSolid(pos.offset(enumfacing.getOpposite()), enumfacing, true)) {
					return this.getDefaultState().withProperty(FACING, enumfacing);
				}
			}
			return this.getDefaultState();
		}
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		for (EnumFacing enumfacing : FACING.getAllowedValues()) {
			if (this.canPlaceAt(worldIn, pos, enumfacing)) {
				return true;
			}
		}

		return false;
	}

	private boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing) {
		BlockPos blockPos = pos.offset(facing.getOpposite());
		boolean flag = facing.getAxis().isHorizontal();
		return flag && worldIn.isSideSolid(blockPos, facing, true) || facing.equals(EnumFacing.UP) && this.canPlaceOn(worldIn, blockPos);
	}

	private boolean canPlaceOn(World worldIn, BlockPos pos) {
		IBlockState state = worldIn.getBlockState(pos);
		if (state.isSideSolid(worldIn, pos, EnumFacing.UP)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return null;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 0;
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		return item.getItem() == ItemRegistry.SYRMORITE_SHEARS;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		return ImmutableList.of(new ItemStack(Item.getItemFromBlock(this)));
	}

	@Override
	public boolean isHarvestable(ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	public List<ItemStack> getHarvestableDrops(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		return this.sickleHarvestableDrop != null ? ImmutableList.of(this.sickleHarvestableDrop.copy()) : ImmutableList.of();
	}

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		if (this.checkForDrop(worldIn, pos, state)) {
			EnumFacing facing = (EnumFacing)state.getValue(FACING);
			EnumFacing.Axis axis = facing.getAxis();
			EnumFacing oppositeFacing = facing.getOpposite();
			boolean shouldDrop = false;
			if (axis.isHorizontal() && !worldIn.isSideSolid(pos.offset(oppositeFacing), facing, true)) {
				shouldDrop = true;
			} else if (axis.isVertical() && !this.canPlaceOn(worldIn, pos.offset(oppositeFacing))) {
				shouldDrop = true;
			}
			if (shouldDrop) {
				this.dropBlockAsItem(worldIn, pos, state, 0);
				worldIn.setBlockToAir(pos);
			}
		}
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		this.checkForDrop(worldIn, pos, state);
	}

	protected boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state) {
		if (state.getBlock() == this && this.canPlaceAt(worldIn, pos, (EnumFacing)state.getValue(FACING))) {
			return true;
		} else {
			if (worldIn.getBlockState(pos).getBlock() == this) {
				this.dropBlockAsItem(worldIn, pos, state, 0);
				worldIn.setBlockToAir(pos);
			}
			return false;
		}
	}

	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	}

	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
		return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {FACING});
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		switch ((EnumFacing)state.getValue(FACING)) {
		default:
		case EAST:
			return MOSS_EAST_AABB;
		case WEST:
			return MOSS_WEST_AABB;
		case SOUTH:
			return MOSS_SOUTH_AABB;
		case NORTH:
			return MOSS_NORTH_AABB;
		case UP:
			return MOSS_UP_AABB;
		case DOWN:
			return MOSS_DOWN_AABB;
		}
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		int attempt = 0;
		if (rand.nextInt(80) == 0) {
			if(rand.nextInt(6) == 0) {
				MutableBlockPos checkPos = new MutableBlockPos();
				byte radius = 2;
				int maxNearbyMossBlocks = 6;
				int xx;
				int yy;
				int zz;
				for (xx = pos.getX() - radius; xx <= pos.getX() + radius; ++xx) {
					for (zz = pos.getZ() - radius; zz <= pos.getZ() + radius; ++zz) {
						for (yy = pos.getY() - radius; yy <= pos.getY() + radius; ++yy) {
							if(!world.isAreaLoaded(checkPos.setPos(xx, yy, zz), 0))
								return;
							if (world.getBlockState(checkPos.setPos(xx, yy, zz)).getBlock() == this) {
								--maxNearbyMossBlocks;
								if (maxNearbyMossBlocks <= 0)
									return;
							}
						}
					}
				}
				for (attempt = 0; attempt < 128; attempt++) {
					xx = pos.getX() + rand.nextInt(3) - 1;
					yy = pos.getY() + rand.nextInt(3) - 1;
					zz = pos.getZ() + rand.nextInt(3) - 1;
					int offsetDir = 0;
					if(xx != pos.getX()) offsetDir++;
					if(yy != pos.getY()) offsetDir++;
					if(zz != pos.getZ()) offsetDir++;
					if(offsetDir > 1)
						continue;
					BlockPos offsetPos = new BlockPos(xx, yy, zz);
					if (world.isAirBlock(offsetPos)) {
						EnumFacing facing = EnumFacing.getFront(rand.nextInt(EnumFacing.VALUES.length));
						EnumFacing.Axis axis = facing.getAxis();
						EnumFacing oppositeFacing = facing.getOpposite();
						boolean isInvalid = false;
						if (axis.isHorizontal() && !world.isSideSolid(offsetPos.offset(oppositeFacing), facing, true)) {
							isInvalid = true;
						} else if (axis.isVertical() && !this.canPlaceOn(world, offsetPos.offset(oppositeFacing))) {
							isInvalid = true;
						}
						if (!isInvalid) {
							world.setBlockState(offsetPos, this.getDefaultState().withProperty(BlockMoss.FACING, facing));
							break;
						}
					}
				}
			}
		}
	}
}
