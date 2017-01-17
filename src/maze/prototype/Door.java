package maze.prototype;

import maze.MapSite;
//使用原型模式重新实现Door
public class Door extends MapSite {
	
	private Room room_1;
	private Room room_2;
	
	public Door(){
	}
	
	//原型模式需要一个拷贝构造器用于克隆
	public Door(Door door) {
		room_1 = door.room_1;
		room_2 = door.room_2;
	}
	
	//初始化方法
	public void initialize(Room r1, Room r2) {
		room_1 = r1;
		room_2 = r2;
	}
	
	//支持Clone操作
	public Door clone() {
		return new Door(this);
	}
	
	public Room otherSideFrom(Room room){
		return null;
	}
	
	public boolean isOpened(){
		return false;
	}
	
	@Override
	public void enter() {
		
	}
}
