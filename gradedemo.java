import java.util.*; 
public class gradedemo {
   public static void main(String[] args)
   {
   Scanner sc = new Scanner(System.in); 
   System.out.println("Enter the Marks in 4 Subjects"); 
   int m1= sc.nextInt();
   int m2= sc.nextInt();
   double m3= sc.nextDouble();
   double m4= sc.nextDouble();
   double avg = (m1+m2+m3+m4)/4.0; 
   System.out.println("The average of student is " +avg);
   if(avg >= 70){
   System.out.println("Distinction");}
   else if (avg >=60 && avg <70){
   System.out.println("First Class"); }
   else if (avg >=50 && avg < 60){
   System.out.println("Second Class");} 
   else if (avg >=40 && avg < 50){
   System.out.println("Second Class"); }
   else{
   System.out.println("Fail");}

   }
}