public class money {
    public static void main(String[] args) {

        int m = 0;
        int o = 0;
        int n = 0;
        int e = 0;
        int y = 0;
        int s = 0;
        int d = 0;
        int r = 0;

        for(m = 0; m < 10; m++) {
            for (o = 0; o < 10; o++) {
                for (n = 0; n < 10; n++) {
                    for (e = 0; e < 10; e++) {
                        for (y = 0; y < 10; y++) {
                            for (s = 0; s < 10; s++){
                                for (d = 0; d < 10; d++) {
                                    for (r = 0; r < 10; r++) {

                                        if (d != n && d != s && d != r && d != m && d != y && d != o && d != m && s != e && m != o && e != s && r != s && n != s && n != r && n != e && d != e && e != y){



                                            if ((s*1000 + e*100 + n*10 + d) + (m*1000 + o*100 + r*10 + e)
                                                    == (m*10000 + o*1000 + n*100 + e*10 + y)){

//                                                System.out.println((s*1000 + e*100 + n*10 + d));
//                                                System.out.println((m*1000 + o*100 + r*10 + e));
//                                                System.out.println((m*10000 + o*1000 + n*100 + e*10 + y));

                                                System.out.println("SEND: " + (s*1000 + e*100 + n*10 + d));
                                                System.out.println("MORE: " + (m*1000 + o*100 + r*10 + e));
                                                System.out.println("MONEY: " + (m*10000 + o*1000 + n*100 + e*10 + y));


                                            }
                                        }



                                    }
                                }
                            }
                        }
                    }
                }
            }
        }







    }
}
