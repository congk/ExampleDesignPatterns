 package maze.builder;

import maze.Direction;
import maze.Door;
import maze.Maze;
import maze.Room;
import maze.Wall;

/**
 * 创建一个简单的迷宫实现，这是一个ConcreteBuilder，继承自抽象接口MazeBuilder
 */
public class StandardMazeBuilder extends MazeBuilder {

	private static StandardMazeBuilder _instance = null;
	
	public static StandardMazeBuilder getInstance() {
		return _instance == null ? (_instance = new StandardMazeBuilder()) : _instance;
	}
	
	private Maze _currentMaze = null;

	@Override
	public void buildMaze() {
		_currentMaze = new Maze();
	}

	@Override
	public void buildRoom(int n) {
		if(_currentMaze != null) {
			Room room = new Room(n);
			_currentMaze.addRoom(room);
			
			room.setSide(Direction.North, new Wall());
			room.setSide(Direction.South, new Wall());
			room.setSide(Direction.East, new Wall());
			room.setSide(Direction.West, new Wall());
		}
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		if(_currentMaze != null) {
			Room r1 = _currentMaze.getRoomByNo(roomFrom);
			Room r2 = _currentMaze.getRoomByNo(roomTo);
			Door d = new Door(r1, r2);
			
			r1.setSide(commonWall(r1, r2), d);
			r2.setSide(commonWall(r2, r1), d);
		}
	}

	@Override
	public Maze getMaze() {
		// TODO Auto-generated method stub
		return _currentMaze;
	}
	
	//确定r1房间中用来进入r2的门的方位
	private Direction commonWall(Room r1, Room r2) {
		return null;
	}
}
