package armies;

import BaseStats.Unit;

public class Cavalry extends Unit{
	public Cavalry(boolean HeroBoost, boolean CastleBoost) {
		this.UnitType = "cavalry";
		this.Damage = 30;
		this.Skill = 30;
		if(HeroBoost) {
			Damage = (Damage*40)/100 + Damage;
		}
		if(CastleBoost) {
			Skill = (Skill*20)/100 + Skill;
		}
	}
}
