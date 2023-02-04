import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter looping count");
        int loop=s.nextInt();

        System.out.println("Enter number");
        int num=s.nextInt();


        for(int count=1;count<=loop;count++){
            System.out.println(num+"*"+count+"="+num*count);

        }


    }

}

