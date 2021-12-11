package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] frutas = new String[5];

        System.out.println("Digite o nome de 5 frutas para serem adicionadas no seu carrinho de compras");
        for (int i=0; i < frutas.length; i++){
            frutas[i] = scan.next();
        };

        System.out.println("***** CARRINHO DE COMPRAS *****");
        for (int i=0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }
    }
}