import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your exam marks : ");
        int mark=scan.nextInt();

        if(mark>=80){
            System.out.println("Distinction");

        }

        else if(mark>=65){
            System.out.println("Credit");

        }

        else if(mark>=40){
            System.out.println("Pass");

        }
        else{
            System.out.println("Fail");
        }
    }
}
