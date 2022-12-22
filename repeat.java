
import java.util.*; 
public class repeat
{
public static String repeatEnd(String str, int n) {
int len = str.length(); 
String res = "";
for (int i = 0; i < n; i++) {
res = res+str.substring(len - n, len); }
return res; 
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
System.out.println("Enter a String"); 
String str = sc.next();
System.out.println("Enter the number of Chars"); 
int n = sc.nextInt();
sc.close();
String res = repeatEnd( str , n); 
System.out.println("The result is " +res);
}
}