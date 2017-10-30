package vote;



	public class NotEligibleToVoteException extends Exception{
		//An exception (or exceptional event) is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handle
			//Declaring variable int age

			int age;
		//initializing  the int data type
			// making a constructor

			  public  NotEligibleToVoteException(int age){
		//this refers to current object
				  

				  this.age =age;

				}

		      public String toString(){
		//This method returns the string itself.
		    	  return "Your age is "+age+" You must be 18+";

			}

		      

		}
