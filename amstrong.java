import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number"); 
        int n = sc.nextInt();
        sc.close();
        int s=0, r , m;
        m=n; 
        while(n > 0) {
        r = n%10;
        s = s + (r*r*r);
        n = n/10;
        }
        if (s==m)
        System.out.println("The number " +m + " -> is Amstrong");
         else
        System.out.println("The number " +m + " -> is Not Amstrong");
        } }