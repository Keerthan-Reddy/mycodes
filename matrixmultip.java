import java.util.*;
public class matrixmultip
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("EnterthesizeofMatrixA -m*n"); 
int m = sc.nextInt();
int n = sc.nextInt();
System.out.println("Enter the size of Matrix B - p * q"); 
int p = sc.nextInt();
int q = sc.nextInt(); 
if(n!=p)
{
System.out.println("Multiplication cannot be performed"); 
System.exit(0);
}
int a[][] = new int[m][n]; 
int b[][] = new int[p][q]; 
int c[][] = new int[m][q];
System.out.println("Enter the elements of Matrix-A"); 
for(int i =0; i<m;i++)
for(int j=0;j<n;j++) 
a[i][j] = sc.nextInt();
System.out.println("Enter the elements of Matrix-B"); 
for(int i =0; i<p;i++)
for(int j=0;j<q;j++) 
b[i][j] = sc.nextInt();
sc.close();
for(int i =0 ; i<m ;i++) {
for(int j=0;j<q;j++)
{
    c[i][j]=0;
for(int k=0;k<p;k++){

c[i][j] = c[i][j] + a[i][k]*b[k][j]; }
}
}

System.out.println("The Product Matrix-C is");
for(int i =0; i<m;i++) {
for(int j=0;j<q;j++) System.out.print(" " + c[i][j]);
System.out.println();
} } }
