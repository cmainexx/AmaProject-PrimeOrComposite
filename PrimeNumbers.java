/**
 *
 * @author Maine
 */
import java.util.Scanner;

public class PrimeNumbers {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int selection;


        for (int i=0; i<1000;i++){
            System.out.println("MENU");
            System.out.println("[1] Prime or Composite");
            System.out.println("[2] All Prime Numbers");
            System.out.println("[3] Exit");
            System.out.println("Choose an option ->");
            selection = input.nextInt();
            if(selection==1){
                primeOrComposite(); //calls the PrimeOrComposite class
            }
            if(selection==2){
                allPrimeNumbers(); //calls the AllPrimeNumbers class
            }
            if(selection==3){
                System.exit(0); //terminates the program
            }
            if(selection<1 || selection>3){ // if selection happens to not be either 1, 2 or 3, Error message will show
                System.out.println("Input error. Please select another number.");
            }
        }
    }
    
    static void primeOrComposite(){ // the first selection
        Scanner number = new Scanner(System.in);
        
        System.out.println();//newline
        System.out.println("Enter an Integer: ");//getting an input
        int inputNum1 = number.nextInt(); 
        int i,m=0, flag=0;
        m=inputNum1/2; //all prime numbers can be divided by two but not composite numbers
        
        if(inputNum1==0||inputNum1==1) // 0 OR 1 will show as neither prime nor composite
        {  
            System.out.println(inputNum1+" is neither Prime nor Composite");      
        }
        else if (inputNum1 <= -2) // anything equal to or less than -2 will be a composite number
        {
            System.out.println(inputNum1+" is a composite number");
        }
        else
        {  
            for(i=2;i<=m;i++) // logic for finding out if the input is a composite number
            {      
                if(inputNum1%i==0) //if the remainder is not equal to 0 then it is a compposite number
                {      
                    System.out.println(inputNum1+" is a composite number");      
                    flag=1;
                    break;      
                }      
            }//if not, it is a prime number.       
            if(flag==0)  { System.out.println(inputNum1+" is a prime number"); } 
        }//end of else  
    }
    
    static void allPrimeNumbers(){ //the second selection
        Scanner number = new Scanner(System.in);
        
        System.out.println();//new line
        System.out.println("Enter first Integer: "); //getting the first input
        int inputNum2 = number.nextInt();
        System.out.println("Enter second Integer: ");// getting second input
        int inputNum3 = number.nextInt();
        System.out.println("Prime numbers between "+inputNum2+" and "+inputNum3+" are : ");
	int count;
        //loop for finding and printing all prime numbers between given range
	for(int i = inputNum2 ; i <= inputNum3 ; i++)
	{
            //logic for checking number is prime or not
            count = 0;
            for(int j = 1 ; j <= i ; j++)	
            {
		if(i % j == 0)
		count = count+1;
            }
            if(count == 2)
            System.out.print(i+", ");
            
        }
        System.out.println();//new line
        System.out.println();//new line
    }
}