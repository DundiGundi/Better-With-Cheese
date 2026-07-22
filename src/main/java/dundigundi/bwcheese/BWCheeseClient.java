package dundigundi.bwcheese;

import net.fabricmc.api.ClientModInitializer;
import turniplabs.halplibe.event.defs.ClientEvents;
import turniplabs.halplibe.util.dependency.Key;

import static dundigundi.bwcheese.BWCheese.MOD_ID;

public class BWCheeseClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BWCheese.LOGGER.info("Binding to client events...");

		ClientEvents.BLOCK_MODEL_RELOAD.listen(Key.of(MOD_ID), (t) -> new BWCheeseModels().initBlockModels(t));
		ClientEvents.ITEM_MODEL_RELOAD.listen(Key.of(MOD_ID), (t) -> new BWCheeseModels().initItemModels(t));
		ClientEvents.TILE_ENTITY_RENDERER_RELOAD.listen(Key.of(MOD_ID), (t) -> new BWCheeseModels().initTileEntityModels(t));
		ClientEvents.ENTITY_RENDERER_RELOAD.listen(Key.of(MOD_ID), (t) -> new BWCheeseModels().initEntityModels(t));
	}
}
