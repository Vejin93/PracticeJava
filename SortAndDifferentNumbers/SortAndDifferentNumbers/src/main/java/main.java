import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        List<Integer> arrayOfNumber = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            System.out.println("Enter number (N>=6): ");
            N = sc.nextInt();
        } while (N < 6);

        int k = 0;
        do {
            System.out.println("Enter " + (k + 1) + ". element of array: ");
            if (k > 0) {
                Integer retVal = Integer.valueOf(sc.nextInt());
                if (retVal >= arrayOfNumber.get(k - 1)) {
                    arrayOfNumber.add(retVal);
                    k++;
                } else {
                    System.out.println("Enter the element again (must be greater than or equal to the previous one): ");
                }
            } else {
                arrayOfNumber.add(Integer.valueOf(sc.nextInt()));
                k++;
            }
        } while (k < N);

        List<Integer> arrayWithDifferentNumber = new ArrayList<>();
        for (int i = 0; i < arrayOfNumber.size(); i++) {
            int z = 0;
            for (int j = i + 1; j < arrayOfNumber.size(); j++) {
                if (arrayOfNumber.get(i) == arrayOfNumber.get(j))
                    z++;
            }
            if (z == 0) {
                arrayWithDifferentNumber.add(arrayOfNumber.get(i));
            }
        }
        Collections.sort(arrayWithDifferentNumber, Collections.reverseOrder());
        System.out.println(arrayWithDifferentNumber);
    }
}
