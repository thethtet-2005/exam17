import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = 5;
        int biggest = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("ENTER NUMBER");
            int nums = s.nextInt();
            if (nums > biggest) {
                biggest = nums;
            }
                    }
        System.out.println("Largest number is " + biggest);
    }
}
