package exercises;

/*
alunno:Sisti Simone
Classe:4FI
data:28/10/2021
oggetto: creazione classe media
*/
class TreNumeri {

	// attributi della classe
	double num1;
	double num2;
	double num3;
	
	
	// costruttore
	TreNumeri(double num1, double num2, double num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	// metodi
	double minimo(){
		
		if(num1<num2 && num1<num3){
			return num1;
		}
		
		if(num3<num1 && num3<num2){
			return num3;
		}
		
		return num2;
	}
	
	double massimo(){
		
		if(num1>num2 && num1>num3){
			return num1;
		}
		
		if(num3>num1 && num3>num2){
			return num3;
		}
		
		return num2;
	}
	
	double media(){
		double s;
		s=(num1+num2+num3)/3;
		return s;
	}
	
	public String toString(){
		String res;
		res="i 3 numeri sono: "
				+num1+" "+num2+" "+num3+
				"\nil minore tra i tre e': "+minimo()+"\nil maggiore tra i tre e': "+massimo()+
				"\nla media tra i tre e': "
				+media();
		return res;
		
	}
	
}
