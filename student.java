class Student {
    int rollno;
    double avg; 
    String name, dept;
    Student() {}
    Student(int x) {
    rollno = x;
    }
    Student(int x , String y) {
    this(x);
    name=y; }
    Student(int x , String y , double z ){
        this(x,y);
        avg=z; }
    
     Student(int x , String y , double z , String p ) {
        this(x,y,z);
        dept=p; }
        public void display(){
        System.out.println("The Student Data is"); 
        System.out.println(rollno + " , " +name +"," +avg + " ," +dept);
    }
    }
    public class student{
        public static void main(String args[]) {
            Student s1 = new Student(501, "Ramesh" );
            s1.avg = 87.5; 
            s1.dept = "CSE";
            s1.display();
            Student s2 = new Student(502, "Suresh" , 78.5 , "ECE");
            s2.display();
        }
    }
            