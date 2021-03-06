package programa;

public class HeapSort {
	
	public static void main(String[] args) {
		int[] vetor = {2, 5, 32,54, 12,98, 0, 9, 1};
		
		for (int x: vetor) {
			System.out.print(x + "  ");
		}
		
		heapSort(vetor);
		System.out.println("\n");
		
		for (int x: vetor) {
			System.out.print(x + "  ");
		}
	}
	
	public static void heapSort(int[] vetor){
        int tamanho = vetor.length;
        int i = tamanho / 2, pai, filho, t;
        while (true){
            if (i > 0){
                i--; t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {filho++;}
                if (vetor[filho] > t){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            vetor[pai] = t;
        }
    }
}
