import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Median {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();

        int daneCislo = 1;
        int median = 0;
        double medianFinale;

        while (daneCislo != 0) {
            daneCislo = sc.nextInt();

            if (daneCislo != 0) {
                arr.add(daneCislo);
            }
        }
        Collections.sort(arr);

        median = (arr.size()) / 2;
        System.out.println("The median is: " + median);

        if (arr.size() % 2 == 0){
            medianFinale = (arr.get(median) + arr.get((median - 1)));
            medianFinale = medianFinale / 2 ;
        }else{
            medianFinale = arr.get(median);
        }

        System.out.println(medianFinale);

    }
}




