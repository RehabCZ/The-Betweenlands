package thebetweenlands.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelTarBeast extends ModelBase {
	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer Head;
	ModelRenderer earL1;
	ModelRenderer earL2;
	ModelRenderer earR1;
	ModelRenderer earR2;
	ModelRenderer chin;
	ModelRenderer tarFace1;
	ModelRenderer tarFace2;
	ModelRenderer tarFace3;
	ModelRenderer tarFace4;
	ModelRenderer tarFace5;
	ModelRenderer face1;
	ModelRenderer face2;
	ModelRenderer face3;
	ModelRenderer face4;
	ModelRenderer face5;
	ModelRenderer face6;
	ModelRenderer face7;
	ModelRenderer face8;
	ModelRenderer face9;
	ModelRenderer face10;
	ModelRenderer face11;
	ModelRenderer face12;
	ModelRenderer rightleg;
	ModelRenderer tarRLFront1;
	ModelRenderer tarRLFront2;
	ModelRenderer tarRLFront3;
	ModelRenderer tarRLFront4;
	ModelRenderer tarRLFront5;
	ModelRenderer tarRLSide1;
	ModelRenderer tarRLSide2;
	ModelRenderer tarRLSide3;
	ModelRenderer tarRLSide4;
	ModelRenderer tarRLSide5;
	ModelRenderer tarRLBack1;
	ModelRenderer tarRLBack2;
	ModelRenderer tarRLBack3;
	ModelRenderer leftleg;
	ModelRenderer tarLLFront1;
	ModelRenderer tarLLFront2;
	ModelRenderer tarLLFront3;
	ModelRenderer tarLLFront4;
	ModelRenderer tarLLFront5;
	ModelRenderer tarLLFront6;
	ModelRenderer tarLLSide1;
	ModelRenderer tarLLSide2;
	ModelRenderer tarLLSide3;
	ModelRenderer tarLLSide4;
	ModelRenderer tarLLSide5;
	ModelRenderer tarLLBack1;
	ModelRenderer tarLLBack2;
	ModelRenderer tarLLBack3;
	ModelRenderer tarLLBack4;
	ModelRenderer tarLLBack5;
	ModelRenderer tarBody1;
	ModelRenderer tarBody2;
	ModelRenderer tarBody3;
	ModelRenderer tarBody4;
	ModelRenderer tarBody5;
	ModelRenderer tarBody6;
	ModelRenderer tarBody7;
	ModelRenderer tarBody8;
	ModelRenderer tarBody9;
	ModelRenderer tarBody10;
	ModelRenderer tarBody11;
	ModelRenderer tarBody12;
	ModelRenderer tarBody13;
	ModelRenderer tarBody14;
	ModelRenderer tarBody15;
	ModelRenderer tarBody16;
	ModelRenderer tarBody17;
	ModelRenderer tarBody18;
	ModelRenderer tarBody19;
	ModelRenderer tarBody20;
	ModelRenderer tarBody21;
	ModelRenderer tarBody22;
	ModelRenderer tarBody23;
	ModelRenderer tarBody24;
	ModelRenderer tarBody25;
	ModelRenderer tarBody26;
	ModelRenderer tarBody27;
	ModelRenderer tarBody28;
  
	public ModelTarBeast() {
		textureWidth = 128;
		textureHeight = 128;

		body1 = new ModelRenderer(this, 0, 108);
		body1.addBox(-8F, 0F, -2F, 16, 11, 9);
		body1.setRotationPoint(0F, -17F, -2F);
		setRotation(body1, 0F, 0F, 0F);
		body2 = new ModelRenderer(this, 0, 90);
		body2.addBox(-7F, 11F, -1F, 14, 11, 7);
		body2.setRotationPoint(0F, -17F, -2F);
		setRotation(body2, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 50, 101);
		rightarm.addBox(-4F, -2F, -2F, 4, 23, 4);
		rightarm.setRotationPoint(-7F, -11F, 0F);
		setRotation(rightarm, 0F, 0F, 0F);
		leftarm = new ModelRenderer(this, 50, 101);
		leftarm.addBox(0F, -2F, -2F, 4, 23, 4);
		leftarm.setRotationPoint(7F, -11F, 0F);
		setRotation(leftarm, 0F, 0F, 0F);
		Head = new ModelRenderer(this, 92, 113);
		Head.addBox(-4F, -6F, -7F, 8, 8, 7);
		Head.setRotationPoint(0F, -9F, -3F);
		setRotation(Head, 0F, 0F, 0F);
		earL1 = new ModelRenderer(this, 50, 97);
		earL1.addBox(2.5F, -5.5F, -5F, 2, 2, 2);
		earL1.setRotationPoint(0F, -9F, -3F);
		setRotation(earL1, 0F, 0F, 0.2617994F);
		earL2 = new ModelRenderer(this, 50, 95);
		earL2.addBox(4.5F, -5.5F, -11F, 1, 1, 1);
		earL2.setRotationPoint(0F, -9F, 3F);
		setRotation(earL2, 0F, 0F, 0.2617994F);
		earR1 = new ModelRenderer(this, 50, 97);
		earR1.addBox(-4.5F, -5.5F, -5F, 2, 2, 2);
		earR1.setRotationPoint(0F, -9F, -3F);
		setRotation(earR1, 0F, 0F, -0.2617994F);
		earR2 = new ModelRenderer(this, 50, 95);
		earR2.addBox(-5.5F, -5.5F, -5F, 1, 1, 1);
		earR2.setRotationPoint(0F, -9F, -3F);
		setRotation(earR2, 0F, 0F, -0.2617994F);
		chin = new ModelRenderer(this, 110, 109);
		chin.addBox(-3F, 2F, -7F, 6, 2, 2);
		chin.setRotationPoint(0F, -9F, -3F);
		setRotation(chin, 0F, 0F, 0F);
		tarFace1 = new ModelRenderer(this, 0, 57);
		tarFace1.addBox(-3F, 4F, -7F, 2, 2, 2);
		tarFace1.setRotationPoint(0F, -9F, -3F);
		setRotation(tarFace1, 0F, 0F, 0F);
		tarFace2 = new ModelRenderer(this, 8, 57);
		tarFace2.addBox(-3F, 6F, -6F, 1, 1, 1);
		tarFace2.setRotationPoint(0F, -9F, -3F);
		setRotation(tarFace2, 0F, 0F, 0F);
		tarFace3 = new ModelRenderer(this, 102, 88);
		tarFace3.addBox(-4F, 2F, -3F, 2, 3, 2);
		tarFace3.setRotationPoint(0F, -9F, -3F);
		setRotation(tarFace3, 0F, 0F, 0F);
		tarFace4 = new ModelRenderer(this, 124, 68);
		tarFace4.addBox(-4F, 5F, -3F, 1, 1, 1);
		tarFace4.setRotationPoint(0F, -9F, -3F);
		setRotation(tarFace4, 0F, 0F, 0F);
		tarFace5 = new ModelRenderer(this, 124, 100);
		tarFace5.addBox(-3F, 2F, -6F, 1, 5, 1);
		tarFace5.setRotationPoint(6F, -9F, -3F);
		setRotation(tarFace5, 0F, 0F, 0F);
		face1 = new ModelRenderer(this, 92, 110);
		face1.addBox(-4F, -6F, -8F, 8, 2, 1);
		face1.setRotationPoint(0F, -9F, -3F);
		setRotation(face1, 0F, 0F, 0F);
		face2 = new ModelRenderer(this, 92, 103);
		face2.addBox(-4F, -4F, -8F, 1, 6, 1);
		face2.setRotationPoint(0F, -9F, -3F);
		setRotation(face2, 0F, 0F, 0F);
		face3 = new ModelRenderer(this, 96, 103);
		face3.addBox(3F, -4F, -8F, 1, 6, 1);
		face3.setRotationPoint(0F, -9F, -3F);
		setRotation(face3, 0F, 0F, 0F);
		face4 = new ModelRenderer(this, 104, 106);
		face4.addBox(-1F, -4F, -8F, 2, 3, 1);
		face4.setRotationPoint(0F, -9F, -3F);
		setRotation(face4, 0F, 0F, 0F);
		face5 = new ModelRenderer(this, 92, 101);
		face5.addBox(-3F, -2F, -7.9F, 3, 1, 1);
		face5.setRotationPoint(0F, -9F, -3F);
		setRotation(face5, 0F, 0F, -0.2268928F);
		face6 = new ModelRenderer(this, 92, 99);
		face6.addBox(0F, -2F, -7.9F, 3, 1, 1);
		face6.setRotationPoint(0F, -9F, -3F);
		setRotation(face6, 0F, 0F, 0.2268928F);
		face7 = new ModelRenderer(this, 100, 99);
		face7.addBox(-3F, 0F, -8F, 1, 4, 1);
		face7.setRotationPoint(0F, -9F, -3F);
		setRotation(face7, 0F, 0F, 0F);
		face8 = new ModelRenderer(this, 104, 99);
		face8.addBox(2F, 0F, -8F, 1, 4, 1);
		face8.setRotationPoint(0F, -9F, -3F);
		setRotation(face8, 0F, 0F, 0F);
		face9 = new ModelRenderer(this, 112, 100);
		face9.addBox(1F, 0F, -7.9F, 1, 3, 1);
		face9.setRotationPoint(0F, -9F, -3F);
		setRotation(face9, 0F, 0F, -0.3665191F);
		face10 = new ModelRenderer(this, 108, 100);
		face10.addBox(-2F, 0F, -7.9F, 1, 3, 1);
		face10.setRotationPoint(0F, -9F, -3F);
		setRotation(face10, 0F, 0F, 0.3665191F);
		face11 = new ModelRenderer(this, 92, 95);
		face11.addBox(-2F, 3F, -8F, 4, 1, 1);
		face11.setRotationPoint(0F, -9F, -3F);
		setRotation(face11, 0F, 0F, 0F);
		face12 = new ModelRenderer(this, 92, 97);
		face12.addBox(-3F, -1F, -8F, 6, 1, 1);
		face12.setRotationPoint(0F, -9F, -3F);
		setRotation(face12, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 66, 102);
		rightleg.addBox(-2F, 0F, -2F, 6, 19, 7);
		rightleg.setRotationPoint(-4F, 5F, -1F);
		setRotation(rightleg, 0F, 0F, 0F);
		tarRLFront1 = new ModelRenderer(this, 16, 64);
		tarRLFront1.addBox(0F, 4F, -3F, 4, 6, 1);
		tarRLFront1.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLFront1, 0F, 0F, 0F);
		tarRLFront2 = new ModelRenderer(this, 26, 61);
		tarRLFront2.addBox(1F, 10F, -3F, 1, 8, 1);
		tarRLFront2.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLFront2, 0F, 0F, 0F);
		tarRLFront3 = new ModelRenderer(this, 36, 54);
		tarRLFront3.addBox(-1F, 6F, -3F, 1, 8, 1);
		tarRLFront3.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLFront3, 0F, 0F, 0F);
		tarRLFront4 = new ModelRenderer(this, 40, 54);
		tarRLFront4.addBox(-1F, 14F, -3F, 2, 5, 1);
		tarRLFront4.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLFront4, 0F, 0F, 0F);
		tarRLFront5 = new ModelRenderer(this, 80, 62);
		tarRLFront5.addBox(-2F, 0F, -3F, 2, 6, 1);
		tarRLFront5.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLFront5, 0F, 0F, 0F);
		tarRLSide1 = new ModelRenderer(this, 30, 54);
		tarRLSide1.addBox(-3F, 0F, 3F, 1, 14, 2);
		tarRLSide1.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLSide1, 0F, 0F, 0F);
		tarRLSide2 = new ModelRenderer(this, 94, 54);
		tarRLSide2.addBox(-3F, 8F, 0F, 1, 9, 2);
		tarRLSide2.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLSide2, 0F, 0F, 0F);
		tarRLSide3 = new ModelRenderer(this, 84, 69);
		tarRLSide3.addBox(-3F, 1F, -1F, 1, 7, 4);
		tarRLSide3.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLSide3, 0F, 0F, 0F);
		tarRLSide4 = new ModelRenderer(this, 94, 68);
		tarRLSide4.addBox(-3F, 8F, 2F, 1, 11, 1);
		tarRLSide4.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLSide4, 0F, 0F, 0F);
		tarRLSide5 = new ModelRenderer(this, 86, 54);
		tarRLSide5.addBox(-3F, 5F, -2F, 1, 11, 1);
		tarRLSide5.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLSide5, 0F, 0F, 0F);
		tarRLBack1 = new ModelRenderer(this, 100, 54);
		tarRLBack1.addBox(0F, 0F, 5F, 4, 9, 1);
		tarRLBack1.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLBack1, 0F, 0F, 0F);
		tarRLBack2 = new ModelRenderer(this, 110, 54);
		tarRLBack2.addBox(-2F, 4F, 5F, 2, 7, 1);
		tarRLBack2.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLBack2, 0F, 0F, 0F);
		tarRLBack3 = new ModelRenderer(this, 80, 69);
		tarRLBack3.addBox(0F, 10F, 5F, 1, 9, 1);
		tarRLBack3.setRotationPoint(-4F, 5F, -1F);
		setRotation(tarRLBack3, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 66, 102);
		leftleg.addBox(-4F, 0F, -2F, 6, 19, 7);
		leftleg.setRotationPoint(4F, 5F, -1F);
		setRotation(leftleg, 0F, 0F, 0F);
		tarLLFront1 = new ModelRenderer(this, 46, 54);
		tarLLFront1.addBox(-1F, 1F, -3F, 3, 6, 1);
		tarLLFront1.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLFront1, 0F, 0F, 0F);
		tarLLFront2 = new ModelRenderer(this, 36, 63);
		tarLLFront2.addBox(-4F, 0F, -3F, 1, 7, 1);
		tarLLFront2.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLFront2, 0F, 0F, 0F);
		tarLLFront3 = new ModelRenderer(this, 46, 61);
		tarLLFront3.addBox(-4F, 13F, -3F, 3, 6, 1);
		tarLLFront3.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLFront3, 0F, 0F, 0F);
		tarLLFront4 = new ModelRenderer(this, 54, 54);
		tarLLFront4.addBox(-3F, 5F, -3F, 1, 8, 1);
		tarLLFront4.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLFront4, 0F, 0F, 0F);
		tarLLFront5 = new ModelRenderer(this, 46, 68);
		tarLLFront5.addBox(-2F, 7F, -3F, 2, 4, 1);
		tarLLFront5.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLFront5, 0F, 0F, 0F);
		tarLLFront6 = new ModelRenderer(this, 26, 61);
		tarLLFront6.addBox(0F, 7F, -3F, 1, 12, 1);
		tarLLFront6.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLFront6, 0F, 0F, 0F);
		tarLLSide1 = new ModelRenderer(this, 42, 60);
		tarLLSide1.addBox(2F, 0F, 4F, 1, 13, 1);
		tarLLSide1.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLSide1, 0F, 0F, 0F);
		tarLLSide2 = new ModelRenderer(this, 68, 64);
		tarLLSide2.addBox(2F, 2F, -2F, 1, 9, 3);
		tarLLSide2.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLSide2, 0F, 0F, 0F);
		tarLLSide3 = new ModelRenderer(this, 76, 69);
		tarLLSide3.addBox(2F, 12F, 0F, 1, 7, 1);
		tarLLSide3.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLSide3, 0F, 0F, 0F);
		tarLLSide4 = new ModelRenderer(this, 80, 54);
		tarLLSide4.addBox(2F, 11F, -2F, 1, 7, 1);
		tarLLSide4.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLSide4, 0F, 0F, 0F);
		tarLLSide5 = new ModelRenderer(this, 100, 64);
		tarLLSide5.addBox(2F, 8F, 1F, 1, 9, 2);
		tarLLSide5.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLSide5, 0F, 0F, 0F);
		tarLLBack1 = new ModelRenderer(this, 76, 58);
		tarLLBack1.addBox(-1F, 8F, 5F, 1, 10, 1);
		tarLLBack1.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLBack1, 0F, 0F, 0F);
		tarLLBack2 = new ModelRenderer(this, 106, 64);
		tarLLBack2.addBox(0F, 0F, 5F, 2, 11, 1);
		tarLLBack2.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLBack2, 0F, 0F, 0F);
		tarLLBack3 = new ModelRenderer(this, 116, 63);
		tarLLBack3.addBox(-3F, 0F, 5F, 3, 6, 1);
		tarLLBack3.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLBack3, 0F, 0F, 0F);
		tarLLBack4 = new ModelRenderer(this, 112, 62);
		tarLLBack4.addBox(-2F, 6F, 5F, 1, 8, 1);
		tarLLBack4.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLBack4, 0F, 0F, 0F);
		tarLLBack5 = new ModelRenderer(this, 116, 54);
		tarLLBack5.addBox(-4F, 11F, 5F, 2, 8, 1);
		tarLLBack5.setRotationPoint(4F, 5F, -1F);
		setRotation(tarLLBack5, 0F, 0F, 0F);
		tarBody1 = new ModelRenderer(this, 0, 54);
		tarBody1.addBox(-8F, 0F, -3F, 11, 2, 1);
		tarBody1.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody1, 0F, 0F, 0F);
		tarBody2 = new ModelRenderer(this, 24, 54);
		tarBody2.addBox(-6F, 16F, 6F, 2, 6, 1);
		tarBody2.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody2, 0F, 0F, 0F);
		tarBody3 = new ModelRenderer(this, 0, 61);
		tarBody3.addBox(-7F, 2F, -3F, 2, 10, 1);
		tarBody3.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody3, 0F, 0F, 0F);
		tarBody4 = new ModelRenderer(this, 14, 57);
		tarBody4.addBox(1F, 11F, -2F, 4, 6, 1);
		tarBody4.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody4, 0F, 0F, 0F);
		tarBody5 = new ModelRenderer(this, 6, 61);
		tarBody5.addBox(7F, 0F, -3F, 1, 14, 1);
		tarBody5.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody5, 0F, 0F, 0F);
		tarBody6 = new ModelRenderer(this, 10, 59);
		tarBody6.addBox(-1F, 14F, -2F, 1, 5, 1);
		tarBody6.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody6, 0F, 0F, 0F);
		tarBody7 = new ModelRenderer(this, 10, 65);
		tarBody7.addBox(4F, 17F, -2F, 2, 6, 1);
		tarBody7.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody7, 0F, 0F, 0F);
		tarBody8 = new ModelRenderer(this, 58, 54);
		tarBody8.addBox(0F, 17F, -2F, 3, 4, 1);
		tarBody8.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody8, 0F, 0F, 0F);
		tarBody9 = new ModelRenderer(this, 58, 59);
		tarBody9.addBox(4F, 0F, -3F, 3, 4, 1);
		tarBody9.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody9, 0F, 0F, 0F);
		tarBody10 = new ModelRenderer(this, 54, 64);
		tarBody10.addBox(4F, 4F, -3F, 2, 9, 1);
		tarBody10.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody10, 0F, 0F, 0F);
		tarBody11 = new ModelRenderer(this, 66, 54);
		tarBody11.addBox(-6F, 11F, -2F, 6, 3, 1);
		tarBody11.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody11, 0F, 0F, 0F);
		tarBody12 = new ModelRenderer(this, 66, 58);
		tarBody12.addBox(-4F, 19F, -2F, 2, 5, 1);
		tarBody12.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody12, 0F, 0F, 0F);
		tarBody13 = new ModelRenderer(this, 60, 64);
		tarBody13.addBox(-8F, 2F, -3F, 1, 5, 1);
		tarBody13.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody13, 0F, 0F, 0F);
		tarBody14 = new ModelRenderer(this, 108, 76);
		tarBody14.addBox(-4F, 11F, 6F, 3, 7, 1);
		tarBody14.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody14, 0F, 0F, 0F);
		tarBody15 = new ModelRenderer(this, 112, 71);
		tarBody15.addBox(-6F, 11F, 6F, 1, 3, 1);
		tarBody15.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody15, 0F, 0F, 0F);
		tarBody16 = new ModelRenderer(this, 102, 84);
		tarBody16.addBox(-2F, 0F, 7F, 10, 3, 1);
		tarBody16.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody16, 0F, 0F, 0F);
		tarBody17 = new ModelRenderer(this, 74, 77);
		tarBody17.addBox(6F, 3F, 7F, 2, 6, 1);
		tarBody17.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody17, 0F, 0F, 0F);
		tarBody18 = new ModelRenderer(this, 110, 88);
		tarBody18.addBox(-6F, 0F, 7F, 3, 3, 1);
		tarBody18.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody18, 0F, 0F, 0F);
		tarBody19 = new ModelRenderer(this, 124, 79);
		tarBody19.addBox(7F, 9F, 7F, 1, 7, 1);
		tarBody19.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody19, 0F, 0F, 0F);
		tarBody20 = new ModelRenderer(this, 116, 70);
		tarBody20.addBox(0F, 3F, 7F, 5, 8, 1);
		tarBody20.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody20, 0F, 0F, 0F);
		tarBody21 = new ModelRenderer(this, 122, 88);
		tarBody21.addBox(-8F, 1F, 7F, 2, 11, 1);
		tarBody21.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody21, 0F, 0F, 0F);
		tarBody22 = new ModelRenderer(this, 112, 92);
		tarBody22.addBox(-4F, 3F, 7F, 2, 2, 1);
		tarBody22.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody22, 0F, 0F, 0F);
		tarBody23 = new ModelRenderer(this, 118, 88);
		tarBody23.addBox(-4F, 5F, 7F, 1, 8, 1);
		tarBody23.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody23, 0F, 0F, 0F);
		tarBody24 = new ModelRenderer(this, 10, 72);
		tarBody24.addBox(-5F, 14F, -2F, 3, 5, 1);
		tarBody24.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody24, 0F, 0F, 0F);
		tarBody25 = new ModelRenderer(this, 122, 54);
		tarBody25.addBox(3F, 14F, 6F, 2, 4, 1);
		tarBody25.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody25, 0F, 0F, 0F);
		tarBody26 = new ModelRenderer(this, 100, 75);
		tarBody26.addBox(-6F, 16F, 6F, 2, 6, 1);
		tarBody26.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody26, 0F, 0F, 0F);
		tarBody27 = new ModelRenderer(this, 94, 80);
		tarBody27.addBox(-1F, 14F, 6F, 2, 7, 1);
		tarBody27.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody27, 0F, 0F, 0F);
		tarBody28 = new ModelRenderer(this, 124, 59);
		tarBody28.addBox(2F, 14F, 6F, 1, 8, 1);
		tarBody28.setRotationPoint(0F, -17F, -2F);
		setRotation(tarBody28, 0F, 0F, 0F);
	}
  
	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAngle, float entityTickTime, float rotationYaw, float rotationPitch, float unitPixel) {
		super.render(entity, limbSwing, limbSwingAngle, entityTickTime, rotationYaw, rotationPitch, unitPixel);
		setRotationAngles(limbSwing, limbSwingAngle, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
		body1.render(unitPixel);
		body2.render(unitPixel);
		rightarm.render(unitPixel);
		leftarm.render(unitPixel);
		Head.render(unitPixel);
		earL1.render(unitPixel);
		earL2.render(unitPixel);
		earR1.render(unitPixel);
		earR2.render(unitPixel);
		chin.render(unitPixel);
		tarFace1.render(unitPixel);
		tarFace2.render(unitPixel);
		tarFace3.render(unitPixel);
		tarFace4.render(unitPixel);
		tarFace5.render(unitPixel);
		face1.render(unitPixel);
		face2.render(unitPixel);
		face3.render(unitPixel);
		face4.render(unitPixel);
		face5.render(unitPixel);
		face6.render(unitPixel);
		face7.render(unitPixel);
		face8.render(unitPixel);
		face9.render(unitPixel);
		face10.render(unitPixel);
		face11.render(unitPixel);
		face12.render(unitPixel);
		rightleg.render(unitPixel);
		tarRLFront1.render(unitPixel);
		tarRLFront2.render(unitPixel);
		tarRLFront3.render(unitPixel);
		tarRLFront4.render(unitPixel);
		tarRLFront5.render(unitPixel);
		tarRLSide1.render(unitPixel);
		tarRLSide2.render(unitPixel);
		tarRLSide3.render(unitPixel);
		tarRLSide4.render(unitPixel);
		tarRLSide5.render(unitPixel);
		tarRLBack1.render(unitPixel);
		tarRLBack2.render(unitPixel);
		tarRLBack3.render(unitPixel);
		leftleg.render(unitPixel);
		tarLLFront1.render(unitPixel);
		tarLLFront2.render(unitPixel);
		tarLLFront3.render(unitPixel);
		tarLLFront4.render(unitPixel);
		tarLLFront5.render(unitPixel);
		tarLLFront6.render(unitPixel);
		tarLLSide1.render(unitPixel);
		tarLLSide2.render(unitPixel);
		tarLLSide3.render(unitPixel);
		tarLLSide4.render(unitPixel);
		tarLLSide5.render(unitPixel);
		tarLLBack1.render(unitPixel);
		tarLLBack2.render(unitPixel);
		tarLLBack3.render(unitPixel);
		tarLLBack4.render(unitPixel);
		tarLLBack5.render(unitPixel);
		tarBody1.render(unitPixel);
		tarBody2.render(unitPixel);
		tarBody3.render(unitPixel);
		tarBody4.render(unitPixel);
		tarBody5.render(unitPixel);
		tarBody6.render(unitPixel);
		tarBody7.render(unitPixel);
		tarBody8.render(unitPixel);
		tarBody9.render(unitPixel);
		tarBody10.render(unitPixel);
		tarBody11.render(unitPixel);
		tarBody12.render(unitPixel);
		tarBody13.render(unitPixel);
		tarBody14.render(unitPixel);
		tarBody15.render(unitPixel);
		tarBody16.render(unitPixel);
		tarBody17.render(unitPixel);
		tarBody18.render(unitPixel);
		tarBody19.render(unitPixel);
		tarBody20.render(unitPixel);
		tarBody21.render(unitPixel);
		tarBody22.render(unitPixel);
		tarBody23.render(unitPixel);
		tarBody24.render(unitPixel);
		tarBody25.render(unitPixel);
		tarBody26.render(unitPixel);
		tarBody27.render(unitPixel);
		tarBody28.render(unitPixel);
	}
  
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
  
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAngle, float entityTickTime, float rotationYaw, float rotationPitch, float unitPixel, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAngle, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);

		earL1.rotateAngleX = earL2.rotateAngleX = earR1.rotateAngleX = earR2.rotateAngleX = chin.rotateAngleX = tarFace1.rotateAngleX = tarFace2.rotateAngleX = tarFace3.rotateAngleX = tarFace4.rotateAngleX = tarFace5.rotateAngleX = face1.rotateAngleX = face2.rotateAngleX = face3.rotateAngleX = face4.rotateAngleX = face5.rotateAngleX = face6.rotateAngleX = face7.rotateAngleX = face8.rotateAngleX = face9.rotateAngleX = face10.rotateAngleX = face11.rotateAngleX = face12.rotateAngleX = Head.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
		earL1.rotateAngleY = earL2.rotateAngleY = earR1.rotateAngleY = earR2.rotateAngleY = chin.rotateAngleY = tarFace1.rotateAngleY = tarFace2.rotateAngleY = tarFace3.rotateAngleY = tarFace4.rotateAngleY = tarFace5.rotateAngleY = face1.rotateAngleY = face2.rotateAngleY = face3.rotateAngleY = face4.rotateAngleY = face5.rotateAngleY = face6.rotateAngleY = face7.rotateAngleY = face8.rotateAngleY = face9.rotateAngleY = face10.rotateAngleY = face11.rotateAngleY = face12.rotateAngleY = Head.rotateAngleY = rotationYaw / (180F / (float) Math.PI);

		rightarm.rotateAngleX = -MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAngle * 0.5F;
		leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAngle * 0.5F;

		tarRLFront1.rotateAngleX = tarRLFront2.rotateAngleX = tarRLFront3.rotateAngleX = tarRLFront4.rotateAngleX = tarRLFront5.rotateAngleX = tarRLSide1.rotateAngleX = tarRLSide2.rotateAngleX = tarRLSide3.rotateAngleX = tarRLSide4.rotateAngleX = tarRLSide5.rotateAngleX = tarRLBack1.rotateAngleX = tarRLBack2.rotateAngleX = tarRLBack3.rotateAngleX = rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAngle;
		tarLLFront1.rotateAngleX = tarLLFront2.rotateAngleX = tarLLFront3.rotateAngleX = tarLLFront4.rotateAngleX = tarLLFront5.rotateAngleX = tarLLFront6.rotateAngleX = tarLLSide1.rotateAngleX = tarLLSide2.rotateAngleX = tarLLSide3.rotateAngleX = tarLLSide4.rotateAngleX = tarLLSide5.rotateAngleX = tarLLBack1.rotateAngleX = tarLLBack2.rotateAngleX = tarLLBack3.rotateAngleX = tarLLBack4.rotateAngleX = tarLLBack5.rotateAngleX = leftleg.rotateAngleX = -MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAngle;
	}

}
