package pl.SagittariusPL.Moj_program2;

public  class Pozycja
{

	String nazwaTowaru;
	
	int ileSztuk;
	
	double cena;

	
	
	
		
	public Pozycja(String a, int b, double c)
	{
		nazwaTowaru=a;
		ileSztuk=b;
		cena=c;
	}
	
	public double obliczWartosc()
	{
		
		double war=ileSztuk*cena;
		return war;
		
	}

	
	double obliczWartoscZRabatem()
	{
		double p;
		obliczWartosc();
		p=obliczWartosc();
		
		if(ileSztuk>=5&& ileSztuk<=10)
		{
			p=p*0.95;
			
		}
		
		else if(ileSztuk>=10&& ileSztuk<=20)
		{
			p=p*0.9;
			
		}
		
		
		else if(ileSztuk>20)
		{
			p=p*0.85;
			
		}
		return p;
	}
	public String toString()
	{
		
		
		return String.format("%-20s %-10s %-4s %-10s", nazwaTowaru,cena+" z³ ",ileSztuk+" szt. ",obliczWartoscZRabatem()+" z³ ");
		
		
	}
	
	

	
}