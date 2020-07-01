package service;

// Type your code
public class AstroCalculator
{
	public String findSign(String s) {
		int l=s.length();
		int j=0;
		int date=Integer.parseInt(s.substring(0,2));
		int month=Integer.parseInt(s.substring(3,5));
		if(month==1)
		{
			if(date<20)
				return "Capricorn";
			else
				return "Aquarius";
		}
		else if(month==2)
		{
			if(date<19)
				return "Aquarius";
			else
				return "Pisces";
		}
		else if(month==3)
		{
			if(date<21)
				return "Pisces";
			else
				return "Aries";
		}
		else if(month==4)
		{
			if(date<20)
				return "Aries";
			else
				return "Taurus";
		}
		else if(month==5)
		{
			if(date<21)
				return "Taurus";
			else
				return "Gemini";
		}
		else if(month==6)
		{
			if(date<21)
				return "Gemini";
			else
				return "Cancer";
		}
		else if(month==7)
		{
			if(date<23)
				return "Cancer";
			else
				return "Leo";
		}
		else if(month==8)
		{
			if(date<23)
				return "Leo";
			else
				return "Virgo";
		}
		else if(month==9)
		{
			if(date<23)
				return "Virgo";
			else
				return "Libra";
		}
		else if(month==10)
		{
			if(date<23)
				return "Libra";
			else
				return "Scorpio";
		}
		else if(month==11)
		{
			if(date<22)
				return "Scorpio";
			else
				return "Sagittarius";
		}
		else
		{
			if(date<22)
				return "Sagittarius";
			else
				return "Capricorn";
		}
	}
}