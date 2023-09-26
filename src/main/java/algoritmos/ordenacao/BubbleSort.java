package algoritmos.ordenacao;



public class BubbleSort {

    public int[] ordenarEntrada(int[] entrada) {
        for(int i = 0; i < entrada.length; i++){


            for(int j = 0; j < entrada.length -1; j++){
                if(entrada[j] > entrada[j + 1]){
                    int temp1 = entrada[j +1];
                    int temp2 = entrada[j];

                    entrada[j + 1] = temp2;
                    entrada[j] = temp1;
                }
            }
        }
        return entrada;
    }
}
