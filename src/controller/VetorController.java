package controller;

public class VetorController {
	
	public VetorController () {
		super();
	}
	
	public int FuncaoPar (int [] vetor, int tamanho, int soma) {
		// condição dada pelo termino de indices do tamanho do vetor
		if (tamanho<0) {
			return soma; 
		}else {
			//verificando se o numero do vetor é par e se for somando +1 a soma
			if(vetor[tamanho]%2==0) {
			soma = soma +1; 
			}
			return FuncaoPar(vetor, tamanho - 1, soma);
		}
	}
}
