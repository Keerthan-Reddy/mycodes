import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        int len=s.length();
        boolean flag =true;
        int j=len-1;
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
            }
            j--;
        }
        if(flag==true){
        
        System.out.println("The string " +s + " is Palindrome");}
         else{
        System.out.println("The string " +s + " is Not a Palindrome");
         }
    }
}
