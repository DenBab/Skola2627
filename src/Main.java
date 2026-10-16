public class Main {
    public static void main(String[] args) {

        Bod2D a = new Bod2D(5, 15);
        Bod2D b = new Bod2D(25, 10);

        double r1 = a.vzdalenost(b);
        double r2 = b.vzdalenost(a);

        Kruh c = new Kruh (a, r1);
        Kruh d = new Kruh (b, r2);


        System.out.println(a.toString());
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}