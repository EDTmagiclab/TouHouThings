
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.mcreator.touhouthings.procedures.NVProcedure;
import net.mcreator.touhouthings.procedures.HatOfKoishProcedure;
import net.mcreator.touhouthings.procedures.Egg2Procedure;
import net.mcreator.touhouthings.procedures.Egg1Procedure;
import net.mcreator.touhouthings.procedures.ColdspoonProcedure;
import net.mcreator.touhouthings.procedures.BbloodProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class TouhouthingsModProcedures {
	public static void load() {
		new Egg1Procedure();
		new NVProcedure();
		new BbloodProcedure();
		new HatOfKoishProcedure();
		new Egg2Procedure();
		new ColdspoonProcedure();
	}
}
