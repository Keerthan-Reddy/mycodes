
class Volume {
    final double PI= 3.142; //final to define constants double getVolume(double r)
    double getVolume(double r){
    return(4.0/3 * PI * r*r*r);
    }
    void getVolume(double r , double h)
    {
    System.out.print("The volume of Cylinder is ");
    double res = PI*r*r*h; System.out.println(res);
    }
    double getVolume(int r , int h)
    {
        return(1/3.0 * PI *r*r*h);
    }}
    public class volume
    {
    public static void main(String args[]) {
    Volume v1 = new Volume();
    System.out.println("The volume of Sphere is " + v1.getVolume(3.67)); 
    v1.getVolume(5.6,8.9);
    System.out.println("The volume of Cone is " +v1.getVolume(8,10));
    } }