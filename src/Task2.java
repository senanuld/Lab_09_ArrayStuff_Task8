import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] data = new int[100];
        Random rand = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
            if (i < data.length - 1) {
                System.out.println(data[i + 1]);



            }
        }
    }
}

