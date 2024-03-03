package application;

public class Math {

	private String arg1;
	private String arg2;
	private String result;
	
	private String operator;
	
	public Math()
	{
		arg1 = "0";
		arg2 = "0";
	}
	
	public String extendNum(String ext)
	{
		if(result!=null)
		{
			clearNums();
			arg1 = ext;
			return arg1;
		}
		else if(operator==null)
		{
			if(arg1.equals("0"))
			{
				arg1 = ext;
				return arg1;
			}
			arg1 = arg1+ext;
			return arg1;
		}
		else
		{
			if(arg2.equals("0"))
			{
				arg2 = ext;
				return arg2;
			}
			arg2 = arg2+ext;
			return arg2;
		}
	}
	
	public String clearNums()
	{
		arg1 = "0";
		arg2 = "0";
		operator = null;
		result = null;
		return arg1;
	}
	
	public String clearEntry()
	{
		if(operator == null)
		{
			arg1 = "0";
			return arg1;
		}
		else
		{
			arg2 = "0";
			return arg2;
		}
	}
	
	public String backspace()
	{
		if(operator == null)
		{
			if(arg1.length()==1)
			{
				arg1 = "0";
				return arg1;
			}
			arg1 = arg1.substring(0,arg1.length()-1);
			return arg1;
		}
		else
		{
			if(arg2.length()==1)
			{
				arg2 = "0";
				return arg2;
			}
			arg2 = arg2.substring(0,arg2.length()-1);
			return arg2;
		}
	}
	
	public String negative()
	{
		if(operator==null)
		{
			if(arg1.substring(0,1).equals("-")) 
			{
				arg1 = arg1.substring(1);
			}
			else
			{
				arg1 = "-" + arg1;
			}
			return arg1;
		}
		else
		{
			if(arg2.substring(0,1).equals("-"))
			{
				arg2 = arg2.substring(1);
			}
			else
			{
				arg2 = "-" + arg2;
			}
			return arg2;
		}
	}
	
	public String add()
	{
		operator = "+";
		if(result!=null) result = null;
		return arg1;
	}
	
	public String subtract()
	{
		operator = "-";
		if(result!=null) result = null;
		return arg1;
	}
	
	public String multiply()
	{
		operator = "*";
		if(result!=null) result = null;
		return arg1;
	}
	
	public String divide()
	{
		operator = "/";
		if(result!=null) result = null;
		return arg1;
	}
	
	public String decimal()
	{
		return extendNum(".");
	}
	
	public String equal()
	{
		try {
			double first = Double.parseDouble(arg1);
			double second = Double.parseDouble(arg2);
			if(operator == null )
			{
				result = arg1;
			}
			else if(operator.equals("+"))
			{
				result = Double.toString(first+second);
			}
			else if(operator.equals("-"))
			{
				result = Double.toString(first-second);
			}
			else if(operator.equals("/"))
			{
				result = Double.toString(first/second);
			}
			else if(operator.equals("*"))
			{
				result = Double.toString(first*second);
			}
			else
			{
				result = arg1;
			}
			return result;
		}
		catch(ArithmeticException e)
		{
			return "Invalid Result";
		}
		finally
		{
			arg1 = result;
			arg2 = "0";
			operator = null;
		}
	}
	
}
