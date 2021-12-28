package armies;

import BaseStats.Unit;

public class Archer extends Unit{
	public Archer(boolean HeroBoost, boolean CastleBoost) {
		this.UnitType = "archer";
		this.Damage = 40;
		this.Skill = 20;
		if(HeroBoost) {
			Damage = ((Damage*40)/100) + Damage;
		}
		if(CastleBoost) {
			Skill = (Skill*20)/100 + Skill;
		}
	}
}
