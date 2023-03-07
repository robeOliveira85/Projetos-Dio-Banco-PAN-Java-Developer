/*
Desafio
Seu Zé está vendendo frutas com a seguinte tabela de preços:

Exemplo 1

Até 5 Kg	Acima de 5 Kg
Morango	R$ 2,50 por Kg	R$ 2,20 por Kg
Maçã	      R$ 1,80 por Kg	R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

Entrada
Como entrada, você recebera a quantidade em kg de morangos e a quantidade em kg de maçãs.

Saída
Será o valor a ser pago pelo cliente, conforme a tabela de preços da quintanda do seu Zé.
*/

import java.util.*;

public class DIO {
    public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
       Double precoMorangos, precoMacas, precoFinal;
       
       if (morangos <= 5){
       	precoMorangos = morangos * 2.5;
       } else{
         	precoMorangos = morangos * 2.2;
       }
       
       if (macas <= 5){
         	precoMacas = macas * 1.8;
       } else{
         	precoMacas = macas * 1.5;
       }
       
       if (macas + morangos > 8 || precoMacas + precoMorangos > 25){
         	precoFinal = precoMacas + precoMorangos;
         	precoFinal = precoFinal - (precoFinal * 0.1);
       } else{
         	precoFinal = precoMacas + precoMorangos;
       }
       
       System.out.println(precoFinal);
       
    }
}