/*
Desafio
Jorginho é professor do primário de uma determinada escola. Ele tem 100000 alunos e precisa criar um programa que verifica quantos espaços em branco e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!

Entrada
A entrada será uma frase no formato de string. 

Saída
A saída deverá retornar quantos espaços em branco e quantas vogais existem na determinada string, conforme exemplo abaixo:
*/


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
     		Scanner sc = new Scanner(System.in);
     		String str = sc.nextLine();
     		String[] strSplit = str.split(" ");
     		int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
     
     		for (String item : strSplit) {
        		item = item.toLowerCase();
        
        		for (int i = 0; i < item.length(); i++){
          			char c = item.charAt(i);
          			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            			quantVogais++;
          			}
        		}
     		}
     		System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
  	}
}