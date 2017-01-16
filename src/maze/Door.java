package maze;

public class Door extends MapSite {
	
	public Door(Room r1, Room r2){
		
	}

	public Room otherSideFrom(Room room){
		return null;
	}
	
	public boolean isOpened(){
		return false;
	}
	
	@Override
	void enter() {
		
	}
}
