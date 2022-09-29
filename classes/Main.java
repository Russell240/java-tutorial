package classes;
public class Main {
    int x= 5; 
    int y= 3; 
    final int num= 10;
    String message="hello there";


    public static void main (String[]args )
    {
        Main myObj = new Main();
        System.out.println(myObj.x);
        myObj.x= 40;
        System.out.println("My Object X had changed " + myObj.x)  ;
        System.out.println("T");
        myMethod();
    }

    static  void myMethod(){
        System.out.println("Hello World ");
    }
}
