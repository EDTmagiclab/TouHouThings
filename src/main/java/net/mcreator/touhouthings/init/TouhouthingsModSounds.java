
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class TouhouthingsModSounds {
	public static SoundEvent LUNATCPRINCESS = new SoundEvent(new ResourceLocation("touhouthings", "lunatcprincess"));
	public static SoundEvent UNDYINGSMOKE = new SoundEvent(new ResourceLocation("touhouthings", "undyingsmoke"));
	public static SoundEvent HISTORYOFTHEMOON = new SoundEvent(new ResourceLocation("touhouthings", "historyofthemoon"));
	public static SoundEvent MASTERSPARK = new SoundEvent(new ResourceLocation("touhouthings", "masterspark"));
	public static SoundEvent DREAMBATTLE = new SoundEvent(new ResourceLocation("touhouthings", "dreambattle"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("touhouthings", "lunatcprincess"), LUNATCPRINCESS);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("touhouthings", "undyingsmoke"), UNDYINGSMOKE);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("touhouthings", "historyofthemoon"), HISTORYOFTHEMOON);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("touhouthings", "masterspark"), MASTERSPARK);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("touhouthings", "dreambattle"), DREAMBATTLE);
	}
}
