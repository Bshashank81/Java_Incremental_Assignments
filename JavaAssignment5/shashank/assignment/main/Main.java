package shashank.assignment.main;

import shashank.assignment.data.InstanceAndLocalVariables;
import shashank.assignment.singleton.NonStaticVariableInStaticMethod;

public class Main {
	public static void main(String args[])
	{
		InstanceAndLocalVariables ialv = new InstanceAndLocalVariables();
		ialv.printInstanceVariables();
		ialv.printLocalVariables();
		
		NonStaticVariableInStaticMethod nobj = NonStaticVariableInStaticMethod.initializeNonStaticVariable("grapes");
		nobj.printInstanceVariable();
	}
}
