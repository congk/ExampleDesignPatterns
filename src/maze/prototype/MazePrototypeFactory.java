package maze.prototype;

//用一个原型为参数的构造器来扩展MazeFactory
public class MazePrototypeFactory {
	
	private Maze _prototypeMaze;
	private Wall _prototypeWall;
	private Room _prototypeRoom;
	private Door _prototypeDoor;
	
	public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
		_prototypeMaze = maze;
		_prototypeWall = wall;
		_prototypeRoom = room;
		_prototypeDoor = door;
	}

	public Maze makeMaze() {
		return _prototypeMaze.clone();
	}

	public Room makeRoom(int n) {
		Room room = _prototypeRoom.clone();
		room.initialize(n);
		return room;
	}

	public Wall makeWall() {
		return _prototypeWall.clone();
	}

	public Door makeDoor(Room r1, Room r2) {
		Door door = _prototypeDoor.clone();
		door.initialize(r1, r2);
		return door;
	}
}