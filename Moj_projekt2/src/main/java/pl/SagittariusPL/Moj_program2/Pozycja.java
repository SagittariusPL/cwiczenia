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

	public String toString()
	{
		
		
		return String.format("%-20s %-10s %-4s %-10s", nazwaTowaru,cena+" z³ ",ileSztuk+" szt. ",obliczWartosc()+" z³ ");
		
		
	}
	
	

	
}