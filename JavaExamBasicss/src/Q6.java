import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("ENTER FRUIT");
        String fruit = s.next();


            switch (fruit) {
                case "Mango":
                    System.out.println("This friut is Mango");
                    break;
                case "Tomato":
                    System.out.println("This fruit is Tomato");

                    break;
                case "Apple":
                    System.out.println("This fruit is Apple");
                    break;
                case "Orange":
                    System.out.println("This fruit is Orange");
                    break;
                case "Banana":
                    System.out.println("This fruit is Banana");
                    break;
                case "Potato":
                    System.out.println("This fruit is Potato");
                    break;
                case "Kiwi":
                    System.out.println("This fruit is Kiwi");
                    break;
                default:
                    System.out.println("Invalid FRUIT");
            }
        }

    }

