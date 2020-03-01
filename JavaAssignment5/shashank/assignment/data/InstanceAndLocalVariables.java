package shashank.assignment.data;

public class InstanceAndLocalVariables 
{
	int num;
	char ch;
	
	void printInstanceVariables()
	{
		System.out.println("int value is "+num+"\nchar value is "+ch);
	}
	
	void printLocalVariables()
	{
		int localNumber;
		char localCharacter;
		/**
		 * The below print statement gives error because the local variables are printed without initializing
		 * This error can be resolved if the local variables are initialized.
		**/
		System.out.println("the local variable "
				+ "localNumber is "+localNumber+"\nThe local "
						+ "variable localCharacter is "+localCharacter);
	}
	
}

