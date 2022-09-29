import java.util.Scanner;
public class inputTutorial<bool> {
    public static void main(String [] args)
    {
        Scanner  myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is : "+ userName);
        getUserData();
    }

    public static void getUserData()
    {
        Scanner  myObj = new Scanner(System.in);
        System.out.println("Enter your name , age and salary ");
        String name = myObj.nextLine();

        if(name ==null  || name.isEmpty())
        {
            System.out.println(" Please your name  ");
        }

        int age;
        do{
            System.out.print("Enter a  whole number ");
            while(!myObj.hasNextInt()){
                System.out.println("Thats not a number ");
                myObj.next();
            }
           age= myObj.nextInt();

        } while(age <=0);
        
        double salary ; 
        do {
            System.out.println("Enter your salary ");
            while(!myObj.hasNextDouble()){
                System.out.println("Enter a valid number ");
                myObj.next();
            }
        salary= myObj.nextDouble();
        }
        while (salary <=0 );

      
        System.out.println("Name:  "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: " +salary);
    }

  
}
