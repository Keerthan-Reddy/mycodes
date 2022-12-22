import java.util.*; public class dictanory {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of City Strings"); int n = sc.nextInt();
    String s[] = new String[n]; System.out.println("\n\n Enter the City names");
    for(int i=0; i< n;i++) s[i] = sc.next();
    System.out.println("\n\n The cities before sorting are"); for(int i=0; i< s.length;i++)
    System.out.println(s[i]); 
    sc.close();
    for(int i= 0; i < s.length; i++)
    {
    for(int j = i + 1; j < s.length; j++)
    {
    if( s[i].compareTo(s[j]) > 0 )
    { String tmp = s[i];
    s[i] = s[j]; s[j] = tmp;
    }
    } }
    System.out.println("\n\n The citiesAfter Sorting are"); 
    for(int i=0; i< s.length;i++){
        System.out.println(s[i]);
    }
    } }