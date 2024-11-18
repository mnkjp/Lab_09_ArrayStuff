import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static double getAverage(int values[])
    {
        System.out.println(" Average of dataPoints is: " + getAverage(values));
        return 0;
    }

    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        int userInput = SafeInput.getRangedInt(in, "New Random Number:", 1, 100);


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                System.out.println("The value " + userInput + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }



        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                count++;
            }
        }


        if (count > 0) {
            System.out.println("The number " + userInput + " was found " + count + " time(s) in the array.");
        } else {
            System.out.println("The number " + userInput + " was not found in the array.");
        }


        int sum = 0;
        double average;


        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
            sum += dataPoints[i];
        }


        average = (double) sum / dataPoints.length;


        System.out.println(" The sum of the random array dataPoints is: " + sum);
        System.out.println(" The average of the random array dataPoints is: " + average);

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }
}