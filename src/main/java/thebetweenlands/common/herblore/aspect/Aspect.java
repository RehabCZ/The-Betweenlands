package thebetweenlands.common.herblore.aspect;

import net.minecraft.nbt.NBTTagCompound;
import thebetweenlands.common.herblore.aspect.type.IAspectType;
import thebetweenlands.common.registries.AspectRegistry;

public final class Aspect implements Comparable<Aspect> {
	/**
	 * The type of this aspect
	 */
	public final IAspectType type;

	/**
	 * The amount of this aspect
	 */
	public final int amount;

	Aspect(IAspectType aspect, int amount) {
		if(aspect == null) throw new RuntimeException("Aspect can't be null");
		this.type = aspect;
		this.amount = amount;
	}
	
	public float getDisplayAmount() {
		return this.amount / 100.0F;
	}

	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setString("aspect", this.type.getName());
		nbt.setInteger("amount", this.amount);
		return nbt;
	}

	public static Aspect readFromNBT(NBTTagCompound nbt) {
		String aspectName = nbt.getString("aspect");
		int amount = nbt.getInteger("amount");
		IAspectType aspectType = AspectRegistry.getAspectTypeFromName(aspectName);
		if(aspectType != null) {
			return new Aspect(aspectType, amount);
		}
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(this.amount);
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aspect other = (Aspect) obj;
		if (Float.floatToIntBits(this.amount) != Float.floatToIntBits(other.amount))
			return false;
		if (this.type == null) {
			if (other.type != null)
				return false;
		} else if (!this.type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public int compareTo(Aspect other) {
		return this.type.getName().compareTo(other.type.getName());
	}
}
