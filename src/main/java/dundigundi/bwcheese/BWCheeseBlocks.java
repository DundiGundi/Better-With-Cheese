package dundigundi.bwcheese;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static dundigundi.bwcheese.BWCheese.MOD_ID;

public class BWCheeseBlocks {
	public static Block<BlockLogicCheeseBlock> CHEESE_BLOCK;

	private static int currentGeneratedId;

	private static int generateNextId() {
		return currentGeneratedId++;
	}

	public static void RegisterBlocks() {
		currentGeneratedId = BWCheese.startBlockID;

		CHEESE_BLOCK = new BlockBuilder(MOD_ID)
			.setHardness(2.5f)
			.setResistance(5.0f)
			.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_AXE)
			.setBlockSound(BlockSounds.SAND)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISCELLANEOUS))
			.build("cheese_block", generateNextId(), BlockLogicCheeseBlock::new);
	}
}
