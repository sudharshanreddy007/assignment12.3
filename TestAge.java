package vote;

import java.util.Scanner;

//Created a class named TestAge

public class TestAge {

	//We made a method named test it should take age as parameter 

	//we have also added a  throw statement it throws exception named NotEligibleToVoteException

	public void test(int age)throws NotEligibleToVoteException{

		// Started the try block

		try{

			//implemented the if statement

			if(age>18){

				//print statement

				System.out.println("eligible");

				//implemented else statement

			}else{

				//throw statement

				throw new NotEligibleToVoteException(age);

				

			}

			

	

		}

		// catch statement it catches the exception

		catch(Exception e){

			// print sediment

			System.out.println("Exeption---->"+e);

		}

	}



//This is our main class it contain the main method

public static void main( String[]args){

	// creates scanner object for input from console

	Scanner sc =new Scanner(System.in);

	// print statement it asks user to input the age

	System.out.println("Enter the age of voter");

	// Declaring a variable  age 

	 int age=sc.nextInt();

	 //Making object of test class

	TestAge ta= new TestAge();

	//Implementing try block

	try {

		ta.test(age);

		// implementing the catch block

	} catch (NotEligibleToVoteException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		e.toString();
//if is not within the condition then it will shows the exception and print the condtion
	}

	 

}

}