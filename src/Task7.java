public class Task7 {
    public static void main(String[] args) {

        int userValue = 1;

        int count = 0;
        int i = 0;
        int[] dataPoint = new int[100];
        while (i < dataPoint.length) {
            count++;
            System.out.println("The value " + userValue + " was found " + count + " times.");

            int j = 0;
            while (j < dataPoint.length) {
                j++;
            }
            i++;
        }

    }
}



