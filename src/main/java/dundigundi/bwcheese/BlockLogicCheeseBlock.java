package dundigundi.bwcheese;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicCake;
import net.minecraft.core.block.BlockLogicEdible;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.primitives.AABBd;
import org.joml.primitives.AABBdc;

public class BlockLogicCheeseBlock extends BlockLogicEdible {
	public BlockLogicCheeseBlock(@NotNull Block<?> block) {
		super(block, 4, () -> Items.FOOD_CAKE);
	}

	public @NotNull AABBdc getBoundsFromState(@NotNull WorldSource source, @NotNull TilePosc tilePos) {
		int data = source.getBlockData(tilePos);
		float gap = 0.0625F;
		float width = (float)(1 + data * 2) / 16.0F;
		float height = 0.5F;
		return new AABBd((double)width, (double)0.0F, (double)0.0625F, (double)0.9375F, (double)0.5F, (double)0.9375F);
	}

	@Override
	public int getHealAmount(@NotNull World world, @NotNull TilePosc tilePosc) {
		return 0;
	}
}
