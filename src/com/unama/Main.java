package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int [] vetor = new int[10];
	    int Maior;

	    for (int i=0; i < vetor.length; i++){
            System.out.println("entre com o numero "+ i+1);
            vetor[i] = sc.nextInt();
        }
	    Maior = 0;
	    for (int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
            if (vetor[i] > Maior){
                Maior = vetor[i];
            }

        } System.out.println("O Numero Maior e:"+Maior);
    }
}
