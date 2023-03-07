/*
Desafio
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ( int ) ou de ponto flutuante ( float ou double ). Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class DIO {
	
	public static void main(String[] args) throws IOException {
    		Scanner leitor = new Scanner(System.in);
    		int cont = 0;
    		ArrayList<Double> lista = new ArrayList<Double>();

    		for (int x = 0; x < 6; x++) {
      		String numeroS = leitor.next();
      		double numeroD = Double.parseDouble(numeroS);
      		if (numeroD > 0) {
        			cont++;
        			lista.add(numeroD);
      		}
    		}
    
    		double sum = 0;
    		for (int i = 0; i < lista.size(); i++){
      		sum = sum + lista.get(i);
    		}

    		double media = sum / lista.size();
    		System.out.println(cont + " valores positivos");
    		System.out.println(String.format("%.1f", media));
  	}
}