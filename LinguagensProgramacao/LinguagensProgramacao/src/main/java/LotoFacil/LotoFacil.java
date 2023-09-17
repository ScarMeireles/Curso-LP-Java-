package LotoFacil;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class LotoFacil {
    public static void main(String[] args) throws IOException {

        Integer opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************\n\n");
            Random gerador = new Random();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    Integer aposta1;
                    Integer resultado = gerador.nextInt(101);

                    System.out.println("Digite um número de 0 a 100");
                    aposta1 = sc.nextInt();
                    if (aposta1 < 0 || aposta1 > 100) {
                        System.out.println("Aposta inválida!");
                    } else {
                        if (aposta1 == resultado) {
                            System.out.println("Você ganhou R$ 1.000,00 reais.");
                        } else {
                            System.out.println("Que pena! O número sorteado foi: " + resultado);
                        }
                    }
                    break;


                case 2:
                    Character letrapremiada = 'A';
                    System.out.println("Escolha uma letra de A a Z.");
                    int aposta2 = System.in.read();

                    if (Character.isLetter(aposta2)) {
                        Character letra = (char) aposta2;
                        aposta2 = Character.toUpperCase(letra);
                    } else {
                        System.out.println("Aposta inválida.");
                        break;
                    }

                    if (aposta2 == letrapremiada) {
                        System.out.println("Você ganhou R$ 500,00 reais.");
                    } else {
                        System.out.println("Que pena! A letra sorteada foi: " + letrapremiada);
                    }
                    break;

                case 3:
                    int aposta3;
                    System.out.println("Digite um número qualquer.");
                    aposta3 = sc.nextInt();

                    if(aposta3 %2 == 0){
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    }
                    else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;

            }
        } while (opcao != 0) ;
    }
}