/*
Desafio
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:
Area = XX.X
Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class Teste{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double perimetro;
		double area;
		
		if (A + B > C && A + C > B && B + C > A){
		  	perimetro = A + B + C;
		  	System.out.println("Perimetro = " + perimetro);
		} else{
		  	area = ((A + B) * C)/2;
		  	System.out.println("Area = " + area);
		}
	}	
}