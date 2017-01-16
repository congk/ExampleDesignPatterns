package maze;

public class MazeGame {
	
	public MazeGame() {
		Maze maze = createMaze();
	}
	
	/**
	 * 硬编码的方式创建迷宫
	 * @return
	 */
	private Maze createMaze(){
		
		Maze maze = new Maze();
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door door = new Door(r1, r2);
		
		maze.addRoom(r1);
		maze.addRoom(r2);
		
		r1.setSide(Direction.North, new Wall());
		r1.setSide(Direction.South, new Wall());
		r1.setSide(Direction.East, door);
		r1.setSide(Direction.West, new Wall());
		
		r2.setSide(Direction.North, new Wall());
		r2.setSide(Direction.South, new Wall());
		r2.setSide(Direction.West, door);
		r2.setSide(Direction.East, new Wall());
		
		return maze;
	}
	
}
