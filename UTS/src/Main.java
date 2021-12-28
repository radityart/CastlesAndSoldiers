import java.util.*;
import BaseStats.*;
import castles.*;
import armies.*;
import heroes.*;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	static String[] FirstName = {"Urs", "Reamonn", "Duran", "Bernard", "Valerian", "Julienne", "Jean", "Celestia", "Kamryn", "Dore"};
	static String[] LastName = {"Dudley", "Emsworth", "Bentham", "Gladstone", "Crawford", "Hamet", "Branson", "Hastings", "Sutton", "Cromwell"};
	static Random rand = new Random();
	public static void main(String[] args) {
		List<Player> players = new ArrayList<>();
		players.add(new Player("Player One", new ArcherCastle()));
		players.add(new Player("Player Two", new CavalryCastle()));
		players.add(new Player("Player Three", new InfantryCastle()));
		players.add(new Player("Player Four", new SiegeCastle()));
		for(int i = 0;i < 4;i++) {
			if(players.get(i).castle.CastleType == "archer") {
				players.get(i).castle.armies.add(new Archer(true, true));
				players.get(i).castle.armies.add(new Infantry(false, false));
				players.get(i).castle.armies.add(new Cavalry(false, false));
				players.get(i).castle.armies.add(new Siege(false, false));
				for(int j = 0; j<6; j++) {
					players.get(i).heroes.add(new ArcherHero(FirstName[rand.nextInt(10)] + " " + LastName[rand.nextInt(10)],50));
				}
			}
			else if(players.get(i).castle.CastleType == "infantry") {
				players.get(i).castle.armies.add(new Archer(false, false));
				players.get(i).castle.armies.add(new Infantry(true, true));
				players.get(i).castle.armies.add(new Cavalry(false, false));
				players.get(i).castle.armies.add(new Siege(false, false));
				for(int j = 0; j<6; j++) {
					players.get(i).heroes.add(new InfantryHero(FirstName[rand.nextInt(10)] + " " + LastName[rand.nextInt(10)],50));
				}
			}
			else if(players.get(i).castle.CastleType == "cavalry") {
				players.get(i).castle.armies.add(new Archer(false, false));
				players.get(i).castle.armies.add(new Infantry(false, false));
				players.get(i).castle.armies.add(new Cavalry(true, true));
				players.get(i).castle.armies.add(new Siege(false, false));
				for(int j = 0; j<6; j++) {
					players.get(i).heroes.add(new CavalryHero(FirstName[rand.nextInt(10)] + " " + LastName[rand.nextInt(10)],50));
				}
			}
			else if(players.get(i).castle.CastleType == "siege") {
				players.get(i).castle.armies.add(new Archer(false, false));
				players.get(i).castle.armies.add(new Infantry(false, false));
				players.get(i).castle.armies.add(new Cavalry(false, false));
				players.get(i).castle.armies.add(new Siege(true, true));
				for(int j = 0; j<6; j++) {
					players.get(i).heroes.add(new SiegeHero(FirstName[rand.nextInt(10)] + " " + LastName[rand.nextInt(10)],50));
				}
			}
		}
		System.out.println("Player Stats: \n");
		for(Player player : players) {
			System.out.println("===================================");
			System.out.println(player.name);
			System.out.println("Armies:");
			for(Unit unit : player.castle.armies) {
				System.out.println(unit.UnitType + " (Damage : " + unit.Damage + ") "+ " (Skill : " + unit.Skill + ") ");
			}
			System.out.println("Heroes:");
			for(Hero hero : player.heroes) {
				System.out.println(hero.name + "(" + hero.UnitType + ") "+ "Lv." + hero.HeroLvl);
			}
			System.out.println("===================================");
		}
		
	}

}
