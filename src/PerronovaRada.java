public class PerronovaRada {
    public static void main(String[] args) {

        long a = 3;
        long b = 0;
        long c = 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        for (int i = 0; i <= 94; i++) {
            long d = a + b;

            System.out.println(d);
            a = b;
            b = c;
            c = d;
        }

    }
}
