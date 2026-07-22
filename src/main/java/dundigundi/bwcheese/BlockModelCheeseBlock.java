package dundigundi.bwcheese;

import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.generic.BlockModelGeneric;
import net.minecraft.client.render.tessellator.TessellatorGeneral;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.WorldSource;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.useless.dragonfly.DisplayPos;
import org.useless.dragonfly.models.block.StaticBlockModel;

public class BlockModelCheeseBlock<T extends BlockLogic> extends BlockModelGeneric<T> {
	//public final StaticBlockModel[] models = new StaticBlockModel[4];

	public BlockModelCheeseBlock(@NotNull Block<T> block) {
		super(block, BlockModelDispatcher.loadDataModel("bwcheese:block/cheese_block").asModel());

		/*for(int i = 0; i < this.models.length; ++i) {
			this.models[i] = BlockModelDispatcher.loadDataModel("minecraft:block/cake/" + i).asModel();
		}*/
	}

	/*public @NotNull StaticBlockModel getModelFromData(int data) {
		return this.models[data % this.models.length];
	}*/
}
