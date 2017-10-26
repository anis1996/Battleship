import java.util.ArrayList;
import java.util.Collections;
// import java.util.Iterator;

public class PlayerData {

	private String name;
	private ArrayList<Ship> ships;
	private ArrayList<Coordinate> shots;

	/**
	 * Player data constructor
	 * @param  name [Player name /number]
	 */
	public PlayerData(String name) {
		// @TODO: check if name is needed
		this.name = name;
		ships = new ArrayList<Ship>();
		shots = new ArrayList<Coordinate>();

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
	public void addShip(Coordinate c)
	{
		ships.add(new Ship(c, 3));
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
	public Ship getShip(Coordinate c)
	{
		Ship s = null;

		for (int i = 0; i < ships.size(); i++ ) {
			for (int j = 0; j < ships.get(i).coords.size(); j++ ) {
				if (ships.get(i).coords.get(j).equals(c)) {
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
	public boolean isHit(Coordinate c){
		for (int i = 0; i < ships.size(); i++ ) {
			for (int j = 0; j < ships.get(i).coords.size(); j++ ) {
				if (ships.get(i).coords.get(j).equals(c)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * [isThereShip description]
	 * @param  x [description]
	 * @param  y [description]
	 * @return   [description]
	 */
	public boolean isThereShip(Coordinate c){
		return this.isHit(c);
	}

	public void addShot(int x, int y){
		this.shots.add(new Coordinate(x,y));
	}

	public ArrayList<Coordinate> getShots(){
		return shots;
	}

	public Coordinate getShot(int i){
		return this.shots.get(i);
	}

	public Coordinate getShot(int x, int y){
		Coordinate s = null;

		for (int i = 0; i < shots.size(); i++) {
			if (this.shots.get(i).getX() == x && this.shots.get(i).getY() == y) {

				s = this.shots.get(i);
			}
		}
		return s;
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
			size = 0;
			count = 0;
			orientation = "h";
		}

		/**
		 * Constructor with coordinates and size
		 * @param  x [x coordinate of ship]
	 	 * @param  y [y coordinate of ship]
		 * @param  s [size of ship]
		 * @return   [Object of type Ship]
		 */
		public Ship(Coordinate c, int s) {
			size = s;
			orientation = "h";
			coords = new ArrayList<Coordinate>();
			Collections.addAll(coords, c, new Coordinate(c.getX() + 1, c.getY()), new Coordinate(c.getX() + 2, c.getY()));
		}

		/**
		 * Constructor with coordinates, size and orientation
		 * @param  x [x coordinate of ship]
	 	 * @param  y [y coordinate of ship]
		 * @param  s [size of ship]
		 * @param  o [orientation of ship]
		 * @return   [Object of type Ship]
		 */
		public Ship(Coordinate c, int s, String o) {
			size = s;
			orientation = o;
			coords = new ArrayList<Coordinate>();
			Collections.addAll(coords, c, new Coordinate(c.getX() + 1, c.getY()), new Coordinate(c.getX() + 2, c.getY()));
		}

		/**
		 * Checks for hit on ship at specified coordinates
		 * @param  x [x coordinate of ship]
	 	 * @param  y [y coordinate of ship]
	 	 * @param  countUp [count increase if needed]
		 * @return   [if ship is hit or not]
		 */
		public boolean isHit(int x, int y, boolean countUp){
			for (int i = 0; i < coords.size(); i++ ) {
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

	}
}
