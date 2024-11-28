import java.util.Scanner;
public class it24102810Lab5Q1
 {
    public static void main(String [] args)
    {
        Scanner ferdi=new Scanner(System.in);
        int no1,no2,no3,smno1,lno1;

        System.out.print("enter the first intiger");
        no1=ferdi.nextInt();

        System.out.print("enter the secound intiger");
        no2=ferdi.nextInt();

        System.out.print("enter the third intiger");
        no3=ferdi.nextInt();
        System.out.println("user entered numbers are: "+no1+" " +no2+" " +no3);


        smno1 = Math.min(Math.min(no1, no2), no3);
        lno1 = Math.max(Math.max(no1, no2), no3);

        System.out.println("The Smallest number is: " + smno1);
        System.out.println("The Largest number is: " + lno1);





    }
}