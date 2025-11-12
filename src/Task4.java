public class Task4 {

        public static void main(String[] args) {
            int [] dataPoints = {20,30, 40, 50,60};
            int sum = 0;
            for(int value : dataPoints) {
                sum += value;
            }
            double average = (double) sum / dataPoints.length;
            System.out.println("The sum of the random array dataPoints is: " + sum);
            System.out.println("The average of the random array dataPoints is: " + average);


        }
    }


