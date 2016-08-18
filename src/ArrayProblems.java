import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by saurabh on 18/8/16.
 */
public class ArrayProblems {

    static int count;

    public static int hammingDistance(int[] aList, int[] bList)
    {
        if(Arrays.equals(aList, bList))
            return 0;

        else
        {
            for(int i=0; i<aList.length; i++)
            {
                if (aList[i] != bList[i])
                    count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner CONSOLE = new Scanner(System.in);

        int[] aList = new int[10];
        int[] bList = new int[10];

        //take input for first array
        System.out.println("Enter elements of 1st array");
        for (int i = 0; i <5 ; i++) {
            aList[i] = CONSOLE.nextInt();
        }

        //take input for second array
        System.out.println("Enter element of 2nd array");
        for (int j = 0; j <5 ; j++) {
            bList[j] = CONSOLE.nextInt();
        }

        int result = hammingDistance(aList, bList);

        System.out.println("The Hamming Distance is: " + result);
    }
}
