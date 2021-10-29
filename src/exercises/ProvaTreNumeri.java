package exercises;
/*
alunno:Sisti Simone
Classe:4FI
data:28/10/2021
oggetto: creazione classe media
*/
class ProvaTreNumeri {
	
	public static void main(String[] args){
		TreNumeri treNumeri;
		treNumeri=new TreNumeri(7,9,16);
		System.out.println("La media dei tre numeri : "+treNumeri.media());
		System.out.println("Il minore dei tre numeri : "+treNumeri.minimo());
	}
	
}