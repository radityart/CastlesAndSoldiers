package armies;

import BaseStats.Unit;

public class Infantry extends Unit{
	public Infantry(boolean HeroBoost, boolean CastleBoost) {
		this.UnitType = "infantry";
		this.Damage = 20;
		this.Skill = 50;
		if(HeroBoost) {
			Damage = (Damage*40)/100 + Damage;
		}
		if(CastleBoost) {
			Skill = (Skill*20)/100 + Skill;
		}
	}
}
