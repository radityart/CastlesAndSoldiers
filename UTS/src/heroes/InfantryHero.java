package heroes;
import BaseStats.Hero;
public class InfantryHero extends Hero {
	public InfantryHero(String name, int HeroLvl) {
		this.name = name;
		this.UnitType = "infantry";
		this.Damage = 40;
		this.Skill = 100;
		this.HeroLvl = HeroLvl;
	}
}
