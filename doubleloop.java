public class doubleloop {
    public static void main(String a[]) {

    int i = 1;

    while (i <= 4) {

        int j = 1;

        System.out.println("Hi " + i);

        while (j <= 3) {
            System.out.println("Hello " + j);
            j++;
        }

        i++;
    }

    System.out.println("Bye " + i);
}
}
