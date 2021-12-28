package heroes;

import BaseStats.Hero;

public class SiegeHero extends Hero {
	public SiegeHero(String name, int HeroLvl) {
		this.name = name;
		this.UnitType = "siege";
		this.Damage = 60;
		this.Skill = 60;
		this.HeroLvl = HeroLvl;
	}
}
