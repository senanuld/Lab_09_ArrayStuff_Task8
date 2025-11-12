import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] dataPoint = new int[100];
        Random rand = new Random();
        for (int i = 0; i < dataPoint.length; i++) {
            dataPoint[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoint.length; i++) {
            System.out.print(dataPoint[i] + " ");
            if (i < dataPoint.length - 1) {
                System.out.print("| ");

            }
            int sum = 0;
            for (int value : dataPoint) {
                sum += value;
            }
            double average = sum / 100;
            System.out.print("The sum of the random array dataPoint is " + sum);
            System.out.print(" and the average of the random array dataPoint is " + average);










        }
    }
}