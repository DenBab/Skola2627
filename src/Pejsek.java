public class Pejsek extends Savec{
    String barvaVoditka;

    public String jakyJsemDruh(){
        return "pejsek";
    }

    public int dejKolikKoji(){
        return 15;
    }

    public String dejDalsiInfo(){
        return dejDalsiInfo() + "Barva Voditka: " + barvaVoditka + "\n";
    }

}
