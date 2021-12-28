package BaseStats;

import java.util.ArrayList;
import java.util.List;

public class Player {
	public String name;
	public Castle castle;
	public List<Hero> heroes = new ArrayList<>();
	public Player(String name, Castle castle) {
		this.name = name;
		this.castle = castle;
	}
}
