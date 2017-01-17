package maze.prototype;

import maze.Direction;

public class MazeGame {
	
	public MazeGame() {
		//使用原型模式重新实现MazePrototypeFactory，MazePrototypeFactory是一个抽象工厂模式的应用
		MazePrototypeFactory factory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(), new Door());
		Maze maze = createMaze(factory);
	}
	
	/**
	 * 硬编码的方式创建迷宫
	 * @return
	 */
	private Maze createMaze(MazePrototypeFactory factory){
		
		Maze maze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door door = factory.makeDoor(r1, r2);
		
		maze.addRoom(r1);
		maze.addRoom(r2);
		
		r1.setSide(Direction.North, factory.makeWall());
		r1.setSide(Direction.South, factory.makeWall());
		r1.setSide(Direction.East, door);
		r1.setSide(Direction.West, factory.makeWall());
		
		r2.setSide(Direction.North, factory.makeWall());
		r2.setSide(Direction.South, factory.makeWall());
		r2.setSide(Direction.West, door);
		r2.setSide(Direction.East, factory.makeWall());
		
		return maze;
	}
	
}
