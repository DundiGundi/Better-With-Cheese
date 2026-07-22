package dundigundi.bwcheese;

import net.minecraft.client.render.EntityRendererDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelAxisAligned;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.generic.BlockModelGenericWool;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicWool;
import net.minecraft.core.block.Blocks;
import org.useless.dragonfly.models.block.mojang.StaticBlockModelMojang;

public class BWCheeseModels {
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		BlockModelDispatcher.getInstance().addDispatch(BWCheeseBlocks.CHEESE_BLOCK, new BlockModelCheeseBlock<>(BWCheeseBlocks.CHEESE_BLOCK));

		BWCheese.LOGGER.info("Block Models initialized.");
	}

	public void initItemModels(ItemModelDispatcher dispatcher) {

	}

	public void initEntityModels(EntityRendererDispatcher dispatcher) {

	}

	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {
		//dispatcher.assignRenderer(TileEntityCupboard.class, new TileEntityRendererCupboard<>());
	}
}
