import java.util.Random;

public class Calculation {

    public static void main(String[] args) {
        final int LENGTH = 7;
        int[] myArray;

        Random rd = new Random();

        for (int i = 1; i < LENGTH; i++) {
                System.out.println(rd.nextInt());
            }

        int[] tenNumArray;
            tenNumArray = new int[10];
            // for loop creates 1 t 10 and adds to the tenNumArray
            for (int i = 0; i < tenNumArray.length; i++) {
                tenNumArray[i] = i + 1;
                System.out.println(tenNumArray[i]);
            }

        int[] evenArray;
            evenArray = new int [5];

        int index = 0; // counter for even array
            for (int i = 0; i < tenNumArray.length; i++) {
                if (tenNumArray[i] % 2 == 0) {
                    evenArray[index] = tenNumArray[i];
                    index++;
                }
            }

        int k = 0; // counter for while loop
        while (k < evenArray.length) {
            System.out.println(evenArray[k]);
            k++;
        }

            }

}

