
class rect{
    private double len,wed;
    public void setdata(double d1,double d2){
        len=d1;
        wed=d2;
    }
    public double perimeter(){
        double res=2*(len+wed);
        return(res);
    }
    public double area(){
    double res=len*wed;
    return(res);
    }
    public void display(){
        System.out.println("the dimentions are len and wed are "+len+" . "+wed);

    }
}



public class rectangle {
    public static void main(String[] args) {
        rect r1=new rect();
        r1.setdata(20, 30);
        r1.area();
        r1.perimeter();
        System.out.println("the area is"+r1.area());

        
    }
}
