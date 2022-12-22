class Account
 {
int acno;
String name;
double balance;
public void setData(int x , String y , double z) {
acno=x; name=y; balance=z;
}
public double getBal( ) {
return (balance);
}
public void deposit( double amt)
{ 
balance = balance + amt;
}

public void withdraw( double amt) {
balance = balance-amt;
}
public void display() {
System.out.println("The account details are"); 
System.out.println("Account No -> " +acno); 
System.out.println("Account Name -> " +name); 
System.out.println("Account Balance -> " + balance);}
 }

public class account{
public static void main(String[] args) {
Account ac1 = new Account();
ac1.setData(1102 , "Ramesh A" , 345678.75); 
ac1.display();
System.out.println("The balance is " + ac1.getBal());
ac1.deposit(10000);
System.out.println("The balance after deposit " + ac1.getBal());
ac1.withdraw(10000);
System.out.println("The balance after withdraw " + ac1.getBal());

 } }