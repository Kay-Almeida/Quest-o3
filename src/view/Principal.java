package view;

import controller.VetorController;

public class Principal {
	
		public static void main(String[] args) {
		
			VetorController vt = new VetorController(); 
	
			int [] vetor = {1, 4, 3, 19, 22, 40, 59, 12, 90, 87, 44, 55, 66, 88};
			int tamanho = vetor.length - 1; 
			int soma = 0 ; 
			boolean condição = true; 
			
			for(int i = 0; i <= tamanho; i++) {
			if (vetor [i]<=0) {
			System.out.println("Valide a entrada!. Há números menores ou iguais a 0.");	
			condição =  false; 
			  }
	    	}
			
			if(condição==true) {
			int resultado = vt.FuncaoPar(vetor, tamanho, soma);
			System.out.println("Existem "+ resultado+ " números pares no vetor");
			}
		}

}