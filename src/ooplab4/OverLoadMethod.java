package ooplab4;
//1. OverLoad method
//2. Overloading method
//3. Method Overload
public class OverLoadMethod {
    public static void A(int x) {
        System.out.println("Hello A"+x);
    }

    public static void A(int x,int y){
        System.out.println("Hello A"+(x+y));
    }

    public static void B() {
        System.out.println("Hello B");
        
    }

    public static void main(String[] args) {
       A(10);
       A(10);
       A(10,20);
       B();
    } //main
}  //class
