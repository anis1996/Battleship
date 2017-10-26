
public class Coordinate{
    private int X;
    private int Y;

    public Coordinate (int x, int y){
        this.X=x;
        this.Y=y;
    }

    public void addToX(int i){
        this.X += i;
    }

    public void addToY(int i){
        this.Y += i;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return (false);
        }

        if (!Coordinate.class.isAssignableFrom(obj.getClass())) {
            return (false);
        }

        final Coordinate other = (Coordinate) obj;

        if (this.getX() != other.getX()) {
            return (false);
        }

        if (this.getY() != other.getY()) {
            return (false);
        }

        return (true);
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