import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class medianudela {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cislo = 1;
        double median;
        int delinec;
        List<Integer> arr = new ArrayList<Integer>();

        while(cislo != 0){

            cislo =  sc.nextInt();

            if (cislo != 0) {
                arr.add(cislo);
            }
        }

        Collections.sort(arr);

        delinec = (arr.size()) / 2;


        if (arr.size() % 2 == 0) {
            median  = (arr.get(delinec) + arr.get(delinec - 1)) / 2.0;

        }else{
            median = arr.get(delinec);
        }


        System.out.println("Median je " + median);
}
}