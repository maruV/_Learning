public class BirthDate
{
	private String iBDate;
	
	public BirthDate(String iBDate)
	{
		this.iBDate = iBDate;
	}
	
	public char getDay1(String iBDate)
	{
		char d1 = iBDate.charAt(0);
		return d1;
	}
	
	public char getDay2(String iBDate)
	{
		char d2 = iBDate.charAt(1);
		return d2;
	}
	
	public char getMonth1(String iBDate)
	{
		char m1 = iBDate.charAt(2);
		return m1;
	}
	
	public char getMonth2(String iBDate)
	{
		char m2 = iBDate.charAt(3);
		return m2;
	}
	
	public char getYear1(String iBDate)
	{
		char y1 = iBDate.charAt(4);
		return y1;
	}
	
	public char getYear2(String iBDate)
	{
		char y2 = iBDate.charAt(5);
		return y2;
	}
	
	public boolean isValidLength()
	{
		if (iBDate.length() == 6)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isLeapYear()
	{
		int year = Integer.parseInt(iBDate.substring(4));
		
		if (year % 4 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isValidMonth()
	{
		int month = Integer.parseInt(iBDate.substring(0, 2));
		
		if (01 <= month && month <= 12)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isValidDate()
	{
		int date = Integer.parseInt(iBDate.substring(2, 4));
		int month = Integer.parseInt(iBDate.substring(0, 2));
		
		if ((isLeapYear() && month == 2) && (01 <= date && date < 30))
		{
			return true;
		}
		else if (((isLeapYear() == false) && month == 2) && (01 <= date &&  date < 29))
		{
			return true;
		}
		else if ((month == 4 || month == 6 || month == 9 || month == 11) && (01 <= date &&  date < 31))
		{
			return true;
		}
		else if ((month == 01 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (01 <= date && date < 32))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isValidBD()
	{
		if (isValidLength() && isValidMonth() && isValidDate())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}