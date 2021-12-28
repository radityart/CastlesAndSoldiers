package heroes;
import BaseStats.Hero;

public class ArcherHero extends Hero {
	public ArcherHero(String name, int HeroLvl) {
		this.name = name;
		this.UnitType = "archer";
		this.Damage = 100;
		this.Skill = 40;
		this.HeroLvl = HeroLvl;
	}
}
