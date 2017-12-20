package ooplab4;

public class TestMethods {
    //    global variable
    private static int number = 10;

    //    Methods
//    type 1
    public static void A() {
            System.out.println("Hello A");
        }  //A
        // type 2
    public static void B(int x,int y) {
         System.out.println("Hell B "+(x+y));
    }//B
// type 3

    public static int c (int x, int y){
       System.out.println("Hello C");
       return x+y;
    }//C

    public static void main(String[] args) {
        System.out.println("Hello Main");
        A ();
        B(x: 5, y: 10);
//        manage return value
        int num = C(x: 5, y: 10);
        System.out.println(num);
        System.out.println(C(x: 5 , y: 10));

    }//main
}//class

