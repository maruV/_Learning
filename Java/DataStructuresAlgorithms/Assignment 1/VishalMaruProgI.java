import java.io.*;

public class VishalMaruProgI
{
	public static void main(String[] args) throws IOException
	{
		FileReader piFR = null;
		
		BufferedReader bufferedReader = null;
		
		int mCount = 0;
		
		int Pos = 0;
		
		try
		{
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter your birth date in the form of mmddyy : ");
			
			String bDate = bufferedReader.readLine();
			
			BirthDate userBday = new BirthDate(bDate);
			
			piFR = new FileReader("pidigits.txt");
			
			bufferedReader = new BufferedReader(piFR);
			
			int sTr;
			
			if (userBday.isValidBD())
			{
				while ((sTr = bufferedReader.read()) != -1)
				{
					char C = (char) sTr;
					
					if (Character.isDigit(C))
					{	
						if (mCount == 0 && C == userBday.getMonth1(bDate) )
						{
							mCount++;
							Pos++;
						}
						else if (mCount == 1 && C == userBday.getMonth2(bDate) )
						{
							mCount++;
							Pos++;					
						}
						else if (mCount == 2 && C == userBday.getDay1(bDate) )
						{
							mCount++;
							Pos++;					
						}
						else if (mCount == 3 && C == userBday.getDay2(bDate) )
						{
							mCount++;
							Pos++;					
						}
						else if (mCount == 4 && C == userBday.getYear1(bDate) )
						{
							mCount++;
							Pos++;					
						}
						else if (mCount == 5 && C == userBday.getYear2(bDate) )
						{
							mCount++;
							Pos++;
							
						}
						else if (mCount == 6)
						{
							System.out.println("Your birthday " + bDate + " was found at character position " + Pos + " in pidigits.txt");
							System.out.println("The number of comparisons so far is: " + Pos);
							mCount = 0;
						}
						else
						{
							mCount = 0;
							Pos++;
						}
					}
				}
			}
			else
			{
				System.out.println("The Birth date you entered is not correct.");
			}
			
			System.out.println("The total number of comparisons in reading this file is: " + Pos);
		}
		
 		catch (IOException e)
  		{
  			System.out.println("There is an IO error.");
  		}
  		
 
		finally
		{
			piFR.close();
		}
	}
}