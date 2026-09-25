import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Postup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cislo = 1;
        int poradi = 1;
        List<Integer> arr = new ArrayList<Integer>();

        arr.add(cislo);
        poradi = 2;

        while(poradi <= 7){
            if ((cislo - poradi) <= 0){
                if (arr.contains(cislo + poradi)){
                    cislo = cislo + poradi;
                    arr.add(cislo);
                    poradi++;

                }
                cislo = cislo + poradi;
                poradi++;
                arr.add(cislo);



            }else{
                cislo = poradi - cislo;
                poradi++;
                arr.add(cislo);
            }
            System.out.println("Cislo: " + cislo);
            System.out.println("Poradi: " + poradi);


        }




    }
}
