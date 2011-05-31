package com.pokemon.mmo;

public class Enums {

	public static MoveKinds getMoveKindFromInt(int i) {
		switch (i) {
		case 1:
			return MoveKinds.STATUS;
		case 2:
			return MoveKinds.PHYSICAL;
		case 3:
			return MoveKinds.SPECIAL;
		default:
			return null;
		}
	}

	public static Types getTypeFromInt(int i) {
		switch (i) {
		case 1:
			return Types.NORMAL;
		case 2:
			return Types.FIGHTING;
		case 3:
			return Types.FLYING;
		case 4:
			return Types.POISON;
		case 5:
			return Types.GROUND;
		case 6:
			return Types.ROCK;
		case 7:
			return Types.BUG;
		case 8:
			return Types.GHOST;
		case 9:
			return Types.STEEL;
		case 10:
			return Types.FIRE;
		case 11:
			return Types.WATER;
		case 12:
			return Types.GRASS;
		case 13:
			return Types.ELECTRIC;
		case 14:
			return Types.PSYCHIC;
		case 15:
			return Types.ICE;
		case 16:
			return Types.DRAGON;
		case 17:
			return Types.DARK;
		default:
			return Types.NONE;
		}
	}

	public static enum Types {
		NONE(-1, "---"), NORMAL(0, "Normal"), FIRE(1, "Fire"), WATER(2, "Water"), ELECTRIC(3, "Electric"), GRASS(4, "Grass"), ICE(5, "Ice"), 
				FIGHTING(6, "Fighting"), POISON(7, "Poison"), GROUND(8, "Ground"), FLYING(9, "Flying"), PSYCHIC(10, "Psychic"), BUG(11, "Bug"), 
				ROCK(12, "Rock"), GHOST(13, "Ghost"), DRAGON(14, "Dragon"), DARK(15, "Dark"), STEEL(16, "Steel");

		public final int id;
		public final String name;

		private Types(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}

	public static enum MoveKinds {
		PHYSICAL, SPECIAL, STATUS
	}

	public static enum Gender {
		GENDERLESS, MALE, FEMALE
	}

	public static enum Moves {
		SCRATCH, EMBER, TACKLE, CHARGE, ME_FIRST, EMPTY
	}

	public static enum Abilities {
		SOLID_ROCK, FILTER, UNAWARE, RIVALRY, RECKLESS, IRON_FIST, TORRENT, BLAZE, OVERGROW, SWARM, TECHNICIAN, THICK_FAT, HEATPROOF, DRY_SKIN, PURE_POWER, HUGE_POWER, FLOWER_GIFT, GUTS, HUSTLE, SLOW_START, SOLAR_POWER, BATTLE_ARMOR, SNIPER
	}

	public static enum Stats {
		HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED
	}

	public static enum Weather {
		NORMAL, SUNNY_DAY, RAIN_DANCE, SANDSTORM, HAIL
	}

	public static enum Status {
		NONE, POISON, TOXIC, BURN, PARALYZE, FREEZE, SLEEP, FAINTED
	}

	public static enum MoveEffectId {
		DAMAGE, AILMENT, NET_GOOD_STATS, HEAL, DAMAGE_WITH_AILMENT, SWAGGER, DAMAGE_AND_RAISE, DAMAGE_AND_LOWER, DAMAGE_AND_HEAL, OHKO, WHOLE_FIELD_EFFECT, FIELD_EFFECT, FORCE_SWITCH, UNIQUE
	}

	public static enum MoveTargetId {
		SPECIFIC_TO_MOVE(1), SELECTED(2), ALLY(3), USERS_FIELD(4), USER_OR_ALLY(
				5), OPPONENTS_FIELD(6), USER(7), RANDOM_OPPONENT(8), ALL_OTHER_POKEMON(
				9), SELECTED_POKEMON(10), ALL_OPPONENTS(11), ENTIRE_FIELD(12);

		public final int id;

		private MoveTargetId(int i) {
			this.id = i;
		}
	}

}
