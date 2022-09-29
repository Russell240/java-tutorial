public class castingTutorial {
    public static void main (String[] args )
    {
        wideCast();
        narrowingCast();
    }

    public static void wideCast()
    {
        int myInt =9; 
        double MyDouble = myInt;
        System.out.println(myInt);
        System.out.println(MyDouble);
    }

    public static  void narrowingCast()
    {
        double myDouble = 9.78d;
        int myInt= (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);
     }

    
}
