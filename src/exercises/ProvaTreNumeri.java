package exercises;
/*
alunno:Sisti Simone
Classe:4FI
data:28/10/2021
oggetto: creazione classe media
*/
class ProvaTreNumeri {
	
	public static void main(String[] args){
		
		TreNumeri media=new TreNumeri(7,9,16);
		System.out.println("La media dei tre numeri : "+media.m());
		System.out.println("Il minore dei tre numeri : "+media.minimo());

	}
	
}