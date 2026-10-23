public class Zverinec {
    public static void main(String[] args) {

        Fenix z = new Fenix();
        z.jmeno = "Michal";

        System.out.println(z.info());

        Pejsek f = new Pejsek();
        f.jmeno = "Pankrác";
        f.barvaVoditka = "modra";

        System.out.println(f.info());

        Kocicka g = new Kocicka();
        g.jmeno = "Hovnivál";
        System.out.println(g.info());
    }
}
