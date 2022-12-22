
import java.util.*; 
public class triplet
{
public static int countTriple(String str)
{
int len = str.length();
int count = 0;
for (int i = 0; i < len-2; i++)
{
char tmp = str.charAt(i);
if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
 count++;
}
return count;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String");
String str = sc.next(); 
sc.close();
int res = countTriple( str );
System.out.println("The result is " +res); }
}
