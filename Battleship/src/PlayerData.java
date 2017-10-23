import java.util.ArrayList;

public class PlayerData {

	private String name;
	private int[][] grid;
	public ArrayList<ship> ships;
	
	public PlayerData(String name) {
		this.name = name;
		grid = new int[10][10];
	}
	
	public void add(int x , int y)
	{
		ships.add(new ship(x,y));
	}
	
	public int get(int x, int y)
	{
		return grid[x][y];
	}
	
	public class ship {
		int X;
		int Y;
		int X1;
		int X2;

		public ship(int x, int y) {
			X = x;
			Y = y;
			X1 = x + 1;
			X2 = x + 2;
			grid[x][y] = 1;
			grid[X1][y] = 1;
			grid[X2][y] = 1;
		}
		
		public boolean hitSink(int x, int y)
		{
			if((X == x || X1 == x || X2 == x) && Y == y)
			{
				grid[x][y] = 2;
				return true;
			}
			 return false;
		}

		public boolean isSunk() {
			if (grid[X][Y] == 2 && grid[X1][Y] == 2 && grid[X2][Y] == 2) {
				return true;
			}
			return false;
		}

	}

}
