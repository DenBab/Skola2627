public class Kniha {

    boolean vypujcena = false;
    String nazev;
    String autor;
    String jmenoVyp = " nikdo";
    int pocetStran;


    public Kniha(String nazev, String autor, int pocetStran) {
        this.nazev = nazev;
        this.autor = autor;
        this.pocetStran = pocetStran;

    }

    public void vypujcit(String kdoMa){


        if (vypujcena == true){
            System.out.println("Hej kamo, lowkey, ne.");
        }else{
            System.out.println("Nice, ty plantážníku.");
            vypujcena = true;
            jmenoVyp = kdoMa;
        }
    }

    public void vratit(){
        if (vypujcena == true){
            System.out.println("Knihovni pani: Hezky ty.");
            vypujcena = false;
        }else{
            System.out.println("NE");
        }
    }

    public String toString(){
        String out = "Nazev: " + nazev + ";  Autor: " + autor + ";  Pocet stran: " + pocetStran;
        if (vypujcena == true){
            out = out + " je vypujcena: " + jmenoVyp;
        }else{
            out = out + " neni vypujcena";
        }
        return out;
    }

    public static void main(String[] args) {

        Kniha kniha = new Kniha("Rychlé šípy", "Jaroslav Foglar", 110);

        System.out.println(kniha);
        kniha.vypujcit("Pavel");
        System.out.println(kniha);
        kniha.vypujcit("Michal");
        System.out.println(kniha);
        kniha.vratit();
        System.out.println(kniha);
        kniha.vratit();



    }
}