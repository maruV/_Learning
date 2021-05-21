import stackpackage.*;

public class VishalMaruProgV
{
	public static void main(String[] args) 
	{
		String Q1 = "10 320 +";
		String Q2 = "40 5 *";
		String Q3 = "40 10 /";
		String Q4 = "98 45 -";
		
		postFixEvaluator(Q1);
		postFixEvaluator(Q2);
		postFixEvaluator(Q3);
		postFixEvaluator(Q4);
	}
	
	public static void postFixEvaluator(String PostFixQ)
	{
		GoodStack numStack = new GoodStack();
		String Operand = "";
		int retVal;				// variables to use in
		int tempVal1;			// solving the 
		int tempVal2;			// postfix questions
		int pFnum;
		
		for (int i = 0; i < PostFixQ.length(); i++)		// loop goes through the 
		{									// string(question) and
			char tempChar = PostFixQ.charAt(i);		// evaluates depending on
											// whether the character is
			if (tempChar == '*')					// operand or operator
			{
				tempVal1 = (Integer) numStack.pop();	// takes the first two numbers on the stack
				tempVal2 = (Integer) numStack.peek();	// and operates according to the operator
												// in every if loop
				retVal = tempVal1 * tempVal2;
				
				numStack.push(retVal);
			}
			else if (tempChar == '/')
			{
				tempVal1 = (Integer) numStack.pop();
				tempVal2 = (Integer) numStack.peek();
				
				retVal = tempVal2 / tempVal1;
				
				numStack.push(retVal);
			}
			else if (tempChar == '-')
			{
				tempVal1 = (Integer) numStack.pop();
				tempVal2 = (Integer) numStack.peek();
				
				retVal = tempVal2 - tempVal1;
				
				numStack.push(retVal);
			}
			else if (tempChar == '+')
			{
				tempVal1 = (Integer) numStack.pop();
				tempVal2 = (Integer) numStack.peek();
				
				retVal = tempVal1 + tempVal2;
				
				numStack.push(retVal);
			}
			else if (tempChar == ' ')
			{
				pFnum = Integer.parseInt(Operand);		// converts the number from string to int
				numStack.push(pFnum);				// pushes the int into the stack
				Operand = "";						// clears the operand
			}
			else
			{
				Operand += tempChar;		// adds the other digits to the number
			}
			
		}
		
		System.out.println("The result for '" + PostFixQ + "' is " + numStack.pop()); // prints the solution
	}
	
}