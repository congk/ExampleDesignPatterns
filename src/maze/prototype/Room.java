package maze.prototype;

import maze.Direction;
import maze.MapSite;

public class Room extends MapSite {
	
	private int no;
	
	public Room(){	
	}
	
	public Room(Room room) {
		no = room.no;
	}
	
	public void initialize(int n) {
		no = n;
	}
	
	public Room clone() {
		return new Room(this);
	}
	
	public void setSide(Direction direction, MapSite site){
		
	}
	
	public MapSite getSide(Direction direction){
		return null;
	}

	@Override
	public void enter() {
		
	}
	
}
