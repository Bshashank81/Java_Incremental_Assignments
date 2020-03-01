package shashank.assignment.singleton;

public class NonStaticVariableInStaticMethod 
{
	String str;
	public static NonStaticVariableInStaticMethod initializeNonStaticVariable(String word)
	{
		/**
		 * The below statement gives error because the non static variable
		 * is initialized in the static method.
		 * This error is resolved if the non static variable is 
		 * is initialized in the non static method.
		 **/
		str=word;
		NonStaticVariableInStaticMethod nsvism = new NonStaticVariableInStaticMethod();
		return nsvism;	
	}
	
	public void printInstanceVariable()
	{
		System.out.println("The value of the instance variable is "+str);
	}
	
	
}
