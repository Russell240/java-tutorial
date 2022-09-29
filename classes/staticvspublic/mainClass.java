package classes.staticvspublic;

public class mainClass {
    static void myStaticMethod()
    {
        System.out.println("Static Methods can be called without accesing ");
    }

    public void myPublicMethod()
    {
        System.out.println("Public Methods must be called by creating objects ");
    }

    public static void main (String [] args )
    {
        myStaticMethod();
        mainClass myobj = new mainClass();
        myobj.myPublicMethod();
    }
}
