package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        float numA = ler.nextFloat();
        System.out.println("Informe o segundo número: ");
        float numB = ler.nextFloat();
        Operacoes calcula = new Operacoes();
        float mostrar = calcula.soma(numA, numB);
        System.out.println("A soma deu:" + mostrar);
        mostrar = calcula.subtrai(numA, numB);
        System.out.println("A subtração deu:" + mostrar);
        mostrar = calcula.divide(numA, numB);
        System.out.println("A divisão deu:" + mostrar);
        mostrar = calcula.multiplica(numA, numB);
        System.out.println("A multiplicação deu:" + mostrar);
    }
}
