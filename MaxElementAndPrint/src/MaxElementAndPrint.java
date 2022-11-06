import java.util.Arrays;
import java.util.Scanner;

public class MaxElementAndPrint {
    public static void main(String[] args) {

        // Dimension of array and get it
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimension of array: ");
        N = scanner.nextInt();

        // Declaration array of numbers
        int[] arrayOfNumbers = new int[N];
        int i=0;
        int var=0;
        System.out.println("Enter element of array[range from 5 to 10]: ");
        while(i<N){
            System.out.println(i+1+". element: ");
            int retVal=scanner.nextInt();
            if(retVal>5 && retVal<=10){
                arrayOfNumbers[i]=retVal;
                if(arrayOfNumbers[i]>var)
                    var=arrayOfNumbers[i];
                i++;
            }else{
                System.out.println("Element isn't in range! Enter again [range from 5 to 10]: ");
            }
        }
        System.out.println("\nMax element is: " + var);

    }
}

