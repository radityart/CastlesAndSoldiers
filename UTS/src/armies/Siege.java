package armies;

import BaseStats.Unit;

public class Siege extends Unit{
	public Siege(boolean HeroBoost, boolean CastleBoost) {
		this.UnitType = "siege";
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
