public class Task5 {
        public static void main(String[] args) {

            int[] dataPoints = new int[100];
            int userValue = 100;

            int count = 1;
            for (int i = 0; i < dataPoints.length; i++) {
                if (dataPoints[i] == userValue) {
                }
                count++;
                System.out.println("The value " + userValue + " was found " + count + " times.");

                for (int j = 0; j < dataPoints.length; j++) {
                }
                if (dataPoints[i] == userValue) {
                    break;


                }
                System.out.println("The value " + userValue + " was found " + count + " times.");
                System.out.println("The value " + userValue + " was not found " + count + " times.");

                int min = dataPoints[0];
                int max = dataPoints[dataPoints.length - 1];
                for (int j = 1; j < dataPoints.length; j++) {
                    if (dataPoints[j] < min) {}
                    if (dataPoints[j] > max) {}
                    min = dataPoints[j];

                    System.out.println("Minimum value in the array is " + min);
                    System.out.println("Maximum value in the array is " + max);
                    System.out.println("Average value in the array is " + dataPoints[dataPoints.length - 1]);

                    int sum = 0;
                    for (int value : dataPoints) {
                        sum += value;
                    }



                }












            }
        }
    }
