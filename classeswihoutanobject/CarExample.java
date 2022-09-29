package classeswihoutanobject;
import java.util.Scanner;

public class CarExample {
    public void fullThrottle()
    {
        System.out.println("The car is going very fast  ");
    }

    public void speed(int maxSpeed )
    {
        System.out.println("Max speed is : "+ maxSpeed );
    }

    public void horsepower()
    {
       
        Scanner myObj = new Scanner(System.in);
        int hp = myObj.nextInt();
        System.out.println("Enter horsepower of the car");
        System.out.println("The number of horsepower of the car is :" + hp);
    }

    public static void main (String args[])
    {
        CarExample myCar = new CarExample();
        myCar.fullThrottle();
        myCar.speed(200);
        myCar.horsepower();
    }
}
