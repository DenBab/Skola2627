public class Kruh {
    private Bod2D stred;
    private double r;



    public double getR(){
        return r;
    }

    public Kruh(Bod2D stred, double r){
        this.stred = stred;
        this.r = r;


    }

    public String toString(){
        return "Kruh ma x "+ stred.getX() + " a y je "+ stred.getY() + " a polomer je " + r + ".";
    }
}
