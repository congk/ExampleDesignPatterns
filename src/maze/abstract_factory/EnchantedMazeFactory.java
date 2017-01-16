package maze.abstract_factory;

import maze.Door;
import maze.Room;

/**
 * 用于创建魔法迷宫的工厂
 */
public class EnchantedMazeFactory extends MazeFactory {

	private static EnchantedMazeFactory _instance = null;
	
	public static EnchantedMazeFactory getInstance() {
		return _instance == null ? (_instance = new EnchantedMazeFactory()) : _instance;
	}
	
	@Override
	public Room makeRoom(int n) {
		// TODO Auto-generated method stub
		return new EnchantedRoom(n);
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		// TODO Auto-generated method stub
		return new DoorNeedingSpell(r1, r2);
	}

	protected Spell castSpell() {
		return new Spell();
	}
}

class Spell{
	
}