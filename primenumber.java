import java.util.*;
public class primenumber{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in); 
System.out.println("Enter a number to start -m "); 
int m = sc.nextInt();
System.out.println("Enter a number to end -n "); 
int n = sc.nextInt();
int i,num;
System.out.println("prime numbers from " + m + " to "+n+"are:");

for (i = m; i <= n; i++) {
int count=0;
for(num =1; num<=i; num++){
if(i%num==0){
count = count + 1; 
}
}
if (count ==2){
System.out.println(i);
}
}
}
}
