package maze.prototype;

import maze.MapSite;

public class Wall extends MapSite{

	public Wall() {
		
	}
	
	public Wall(Wall wall) {
		
	}
	
	public Wall clone() {
		return new Wall(this);
	}
	
	@Override
	public void enter() {
		
	}

}
