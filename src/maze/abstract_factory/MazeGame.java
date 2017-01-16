package maze.abstract_factory;

import maze.Maze;

/**
 * AstractFactory模式下创建迷宫
 * @author coderk
 */
public class MazeGame {

	public MazeGame() {
		//创建普通迷宫
		MazeFactory factory = MazeFactory.getInstance();
		Maze maze = createMaze(factory);
		//创建魔法迷宫
		MazeFactory factory2 = EnchantedMazeFactory.getInstance();
		Maze maze2 = createMaze(factory2);
	}
	
	private Maze createMaze(MazeFactory factory) {
		Maze maze = factory.makeMaze();
		
		return maze;
	}
}


