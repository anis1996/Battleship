import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PlayerData {

	private String name;
	public ArrayList<Ship> ships;

	/**
	 * Player data constructor
	 * @param  name [Player name /number]
	 */
	public PlayerData(String name) {
		// @TODO: check if name is needed
		this.name = name;
		ships = new ArrayList<Ship>();
	}

	/**
	 * Number of ships a player has
	 * @return [number of ships]
	 */
	public int shipsCount()
	{
		return ships.size();
	}

	/**
	 * Adds ship to player inventory
	 * @param x [x coordinate of ship]
	 * @param y [y coordinate of ship]
	 */
	public void addShip(int x , int y)
	{
		ships.add(new Ship(x,y, 3));
	}

	/**
	 * Returns ship at requested index
	 * @param  i [index of ship]
	 * @return   [request ship object]
	 */
	public Ship getShip(int i)
	{
		return this.ships.get(i);
	}

	/**
	 * Returns ship at requested coordinates
	 * @param  x [x coordinate of ship]
	 * @param  y [y coordinate of ship]
	 * @return   [requested ship object]
	 */
	public Ship getShip(int x, int y)
	{
		Ship s = null;

		for (int i = 1; i <= (ships.size()-1); i++ ) {
			for (int j = 1; j <= (ships.get(i).coords.size()-1); j++ ) {
				if (ships.get(i).coords.get(j).X == x && ships.get(i).coords.get(j).Y == y) {
					s = ships.get(i);
				}
			}
		}

		return s;
	}

	/**
	 * Checks if any player ship are hit
	 * @param  x [x coordinate of hit]
	 * @param  y [x coordinate of hit]
	 * @return   [if a ship is hit or not]
	 */
	public boolean isHit(int x, int y){
		for (int i = 1; i <= (ships.size()-1); i++ ) {
			for (int j = 1; j <= (ships.get(i).coords.size()-1); j++ ) {
				if (ships.get(i).coords.get(j).X == x && ships.get(i).coords.get(j).Y == y) {
					return true;
				}
			}
		}

		return true;
	}

	/**
	 * Removes all current player ships
	 */
	public void clear(){
		this.ships.clear();
	}

	/**
	 * Ship inner class
	 */
	public class Ship {
		public ArrayList<Coordinate> coords;
		private int size;
		private int count;
		private String orientation;

		/**
		 * Default empty constructor
		 * @return [Object of type Ship]
		 */
		public Ship(){
			size = -1;
			count = -1;
			coords = null;
		}

		/**
		 * Constructor with coordinates and size
		 * @param  x [x coordinate of ship]
	 	 * @param  y [y coordinate of ship]
		 * @param  s [size of ship]
		 * @return   [Object of type Ship]
		 */
		public Ship(int x, int y, int s) {
			size = s;
			orientation = "h";
			coords = new ArrayList<Coordinate>();
			Collections.addAll(coords, new Coordinate(x,y), new Coordinate(x,y+1), new Coordinate(x,y+2));
		}

		/**
		 * Constructor with coordinates, size and orientation
		 * @param  x [x coordinate of ship]
	 	 * @param  y [y coordinate of ship]
		 * @param  s [size of ship]
		 * @param  o [orientation of ship]
		 * @return   [Object of type Ship]
		 */
		public Ship(int x, int y, int s, String o) {
			size = s;
			orientation = o;
			coords = new ArrayList<Coordinate>();
			Collections.addAll(coords, new Coordinate(x,y), new Coordinate(x,y+1), new Coordinate(x,y+2));
		}

		/**
		 * Checks for hit on ship at specified coordinates
		 * @param  x [x coordinate of ship]
	 	 * @param  y [y coordinate of ship]
	 	 * @param  countUp [count increase if needed]
		 * @return   [if ship is hit or not]
		 */
		public boolean isHit(int x, int y, boolean countUp){
			for (int i = 1; i <= (coords.size() -1) ; i++ ) {
				if (coords.get(i).getX() == x && coords.get(i).getY() == y) {
					// @TODO: check if we need to count up or not
					if (countUp) {
						count++;
					}
					return true;
				}
			}
			return false;
		}

		/**
		 * Adds coordinate to ship
		 * @param  x [x coordinate of ship]
	 	 * @param  y [y coordinate of ship]
		 */
		public void addCoord(int x, int y){
			coords.add(new Coordinate(x,y));
		}

		/**
		 * Checks if ship is sunk
		 * @return [if ship is sunk or not]
		 */
		public boolean isSunk() {
			return (count>=size)?true:false;
		}

		/**
		 * Rotate ship from X to Y axis
		 */
		public void rotate(){
			//@TODO: implement rotate
		}

		/**
		 * Setters and Getters
		 */
		public int getCount(){
			return count;
		}

		public String getOrientation(){
			return orientation;
		}

		public int getSize(){
			return size;
		}

		public void setCount( int c){
			// @TODO: add validation
			this.count = c;
		}

		public void setOrientation( String o){
			// @TODO: add validation
			this.orientation = o;
		}

		public void setSize(int s){
			// @TODO: add validation
			this.size = s;
		}

		/**
		 * Coordinates inner class
		 */
		public class Coordinate{
			private int X;
			private int Y;

			public Coordinate (int x, int y){
				this.X=x;
				this.Y=y;
			}

			/**
			 * Setters and Getters
			 */
			public int getX(){
				return X;
			}

			public int getY(){
				return Y;
			}

			public void setX(int x){
				// @TODO: add validation
				this.X = x;
			}

			public void setY(int y){
				// @TODO: add validation
				this.Y = y;
			}
		}

	}

}
