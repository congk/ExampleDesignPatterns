package maze.builder;

import maze.Maze;

/**
 * 这是一个比较特殊的个builder实现方式，它不创建迷宫，只对已创建的不同种类的构建进行计数
 */
public class CountingMazeBuilder extends MazeBuilder {

	private int _doors;
	private int _rooms;
	
	@Override
	public void buildMaze() {
		_doors = 0;
		_rooms = 0;
	}

	@Override
	public void buildRoom(int n) {
		_rooms ++;
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		_doors ++;
	}

	@Override
	public Maze getMaze() {
		return null;
	}

}
