package heroes;

import BaseStats.Hero;

public class CavalryHero extends Hero {
	public CavalryHero(String name, int HeroLvl) {
		this.name = name;
		this.UnitType = "cavalry";
		this.Damage = 60;
		this.Skill = 60;
		this.HeroLvl = HeroLvl;
	}
}
