public class Bod2D {
    private double x;
    private double y;

    public Bod2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Bod x je " + x + " a y je " + y + ".";
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


    public double vzdalenost (Bod2D soused){
        double rozX = this.x - soused.x;
        double rozY = this.y - soused.y;

        return Math.sqrt((rozX * rozX) + (rozY * rozY));
    }
}