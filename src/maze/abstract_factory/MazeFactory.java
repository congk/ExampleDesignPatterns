package maze.abstract_factory;

import maze.Door;
import maze.Maze;
import maze.Room;
import maze.Wall;

public class MazeFactory {

	private static MazeFactory _instance = null;
	
	public static MazeFactory getInstance() {
		return _instance != null ? _instance : (_instance = new MazeFactory());
	}
	
	public Maze makeMaze(){
		return new Maze();
	}
	
	public Room makeRoom(int n){
		return new Room(n);
	}
	
	public Wall makeWall(){
		return new Wall();
	}
	
	public Door makeDoor(Room r1, Room r2){
		return new Door(r1, r2);
	}
}
