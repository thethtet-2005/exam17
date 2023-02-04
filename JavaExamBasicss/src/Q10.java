import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int[] array = {5, 4, 1, 8, 6, 9};

        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
