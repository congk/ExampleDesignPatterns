package maze.builder;

import maze.Maze;

public abstract class MazeBuilder {
	
	public abstract void buildMaze();
	
	public abstract void buildRoom(int n);
	
	public abstract void buildDoor(int roomFrom, int roomTo);
	
	public abstract Maze getMaze();

}
