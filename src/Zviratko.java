import java.util.Scanner;

public class Zviratko {
    String jmeno;
    String druh;
    String poddruh;
    int pocetNohou;
    String delaZvuk;

    public static void main(String[] args) {

    }

    public String dejDalsiInfo(){
        return "";
    }


    public String info() {
        String radek0 = "Jmeno: " + jmeno + "\n";
        String radek1 = "Druh: " + jakyJsemDruh() + "\n";
        String radek2 = "Poddruh:" + jakyJsemPodDruh()+ "\n";

        return radek0 + radek1 + radek2 + dejDalsiInfo();
    }

    public String jakyJsemDruh(){
        return "...";
    }

    public String jakyJsemPodDruh(){
        return "...";
    }


}



