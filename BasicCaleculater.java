import java.util.Scanner;


public class BasicCaleculater {

	public static void main(String[] args) {
		// Create the operation choices to the user input
       Scanner input=new Scanner(System.in);
       
       System.out.println("Select operation:");
       System.out.println("1.Addition");
       System.out.println("2.Subtraction");
       System.out.println("3.Multiplication");
       System.out.println("4.Division");
       
       //prompt user to enter their choice of operation
       System.out.println("Enter choice(1/2/3/4):");
       int choice=input.nextInt();
       
       //prompt user to enter the first number
       System.out.println("Enter first number:");
       double num1=input.nextDouble();
      
       //prompt user to enter the second number
       System.out.println("Enter second number:");
       double num2=input.nextDouble();
       
       //perform the operation based on user choice
       switch(choice) {
       case 1:
    	   
    	   //Addition
    	   System.out.println("Result:" + (num1 + num2));
         
    	   break;
       case 2:
           
    	   //Subtraction
    	   System.out.println("Result:" + (num1*num2));
       
    	   break;
        case 3:
           
        	//Multiplication
        	System.out.println("Result:" +(num1/num2));
       
        	break;
       case 4:
    	   
    	   
    	   //Division with zero check
    	   if(num2==0) {
    		  
    		   System.out.println("cannot divided by zero!");
    	   }
    	   else {

    		   System.out.println("Result:" +(num1/num2));
    	   }
         
    	   break;
          default:
        	  //Handle invalid choices
      
        	 System.out.println("Invalid input");
       }
       
       //Close the Scanner object
       input.close();
	}

}
