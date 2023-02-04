import java.util.Arrays;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = { 1, 2, 3, 4, 5};
        System.out.print("Array : ");
        System.out.println(Arrays.toString(num));

        System.out.println("DELETE ONE NUMBRER 1 TO 5");
        int number = s.nextInt();
        int delete = number;
        int length = num.length;
        for (int i = 0; i < length; i++) {
            if(num[i] == delete) {
                for (int j = i; j < length - 1; j++) {
                    num[j] = num[j + 1];
                }
                length--;
                i--;
            }
            }
            System.out.println("ARRAY DELETING VALUE" + delete + " --> ");
            for (int j = 0; j < length; j++) {
                System.out.println(num[j]+"");
            }

        }
            }




