import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Opakovani4926 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int pocetCisel = 0;
//        boolean cisloNula = false;
//        int celeCislo = 0;
//        double daneCislo = 0;
//        double prumer;
//
//        while (cisloNula == false){
//            daneCislo = sc.nextInt();
//
//            if (daneCislo == 0){
//                cisloNula = true;
//
//            }else{
//                celeCislo = daneCislo + celeCislo;
//                pocetCisel = pocetCisel + 1;
//
//            }
//        }
//        prumer = celeCislo / pocetCisel;
//        System.out.println(prumer);

Scanner sc = new Scanner(System.in);
List<Integer> arr = new ArrayList<Integer>();

        boolean cisloNula = false;
        int daneCislo = 0;
        int pocetArray = 0;
        int median = 0;
        double medianFinale;

        while (cisloNula == false) {
            daneCislo = sc.nextInt();
            if (daneCislo == 0) {
                cisloNula = true;
            } else {
                arr.add(daneCislo);
                pocetArray = pocetArray + 1;
            }
        }
        median = pocetArray / 2;
        if (pocetArray % 2 == 0){
            medianFinale = (arr.get(median) + arr.get((median - 1)));
            medianFinale = medianFinale / 2 ;
        }else{
            medianFinale = arr.get(median);
        }

        System.out.println(medianFinale);



    }
}
