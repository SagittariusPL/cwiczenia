package pl.SagittariusPL.Moj_program2;

public class Zamowienie
{
	int ileDanych=0;
	int maksRozmiar;
	Pozycja[] pozycje= new Pozycja[maksRozmiar];
	
	
    
	
	public int maksRozmiar()
			{
				return maksRozmiar=10;
			}
	public int ilePozycji(int maksRozmiar)
	{
		return maksRozmiar;
	}
	
	public void dodajPozycje(Pozycja p)
	{
		pozycje[ileDanych]=p;
		ileDanych=ileDanych+1;
	}
	
	double obliczWartosc()
	{
		double suma=0;
		for(int i=0; i<ileDanych; i++)
		{
			pozycje[i].obliczWartosc();
			suma=suma+ pozycje[i].obliczWartosc();
					
		}
		return suma;
	}
	
	
	 
		 
	 
}
