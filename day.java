import java.util.Scanner;

public class day {
    public static void main (String args[]){
        int a= 10;
        int b=12;
        int sum=a+b;
        System.out.println(sum);

        String c="Avesh";
        System.out.println(c);

        // ?now how to enter input by uuser
        Scanner nme = new Scanner (System.in) ;
        String name=nme.nextLine();
        System.out.println(name);
        System.out.println(nme);
    }
}
