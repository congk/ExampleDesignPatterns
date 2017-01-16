package maze.builder;

import maze.Maze;

/**
 * Builder模式下封装迷宫的创建流程，并隐藏了builder过程中使用的相关组件类
 */
public class MazeGame {

	public MazeGame() {
		//MazeBuilder本身并不创建迷宫，它的主要目的仅仅是为创建迷宫定义一个接口，MazeBuilder的子类来做实际的创建工作
		Maze maze = createMaze(StandardMazeBuilder.getInstance());
		Maze maze2 = createComplexMaze(StandardMazeBuilder.getInstance());
	}

	private Maze createMaze(MazeBuilder builder) {
		//Builder模式中的产品构建是逐步完成的，且构建算法基本是独立可重复的，这里与AbstractFactory模式不同
		builder.buildMaze();
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		
		//MazeGame类实例是一个Director，这里实际上可以通过各种获取配置的方式来逐步调用builder的不同方法来逐步完成Maze的组装
		
		//builder需要提供一个产品检索接口，与AbstractFactory不同，AbstractFactory的Product是立即返回的
		return builder.getMaze();
	}
	
	private Maze createComplexMaze(MazeBuilder builder) {
		builder.buildMaze();
		
		//通过重新组合builder的组件构建算法，从而可以获得一个不同的迷宫表示
		builder.buildRoom(1);
		//...
		builder.buildRoom(1001);
		
		builder.buildDoor(985, 906);
		
		return builder.getMaze();
	}
}

