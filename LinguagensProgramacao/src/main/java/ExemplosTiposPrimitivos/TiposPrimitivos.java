package ExemplosTiposPrimitivos;

import java.io.IOException;

public class TiposPrimitivos {
    public TiposPrimitivos() {
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Hello World");

        char ch;
        ch = 'X';
        System.out.println("Ch contains " + ch);
        ch++; //incrementa ch
        System.out.println("ch is now " + ch);
        ch = 90; //dá a ch o valor Z
        System.out.println("ch is now " + ch);

        System.out.println("\n**********************************************************************\n");

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte " + tipoByte);
        System.out.println("Valor do tipoShort " + tipoShort);
        System.out.println("Valor do tipoChar " + tipoChar);
        System.out.println("Valor do tipoFloat " + tipoFloat);
        System.out.println("Valor do tipoDouble " + tipoDouble);
        System.out.println("Valor do tipoInt " + tipoInt);
        System.out.println("Valor do tipoLong " + tipoLong);
        System.out.println("Valor do tipoBooleano " + tipoBooleano);


        System.out.println("\n**********************************************************************\n");


//demonstra valores booleanos.
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        System.out.println("\n**********************************************************************\n");


//um valor booleano pode controlar a função if.
        if (b) System.out.println("This is executed");
        b = false;
        if (b) System.out.println("This is not executed");


        System.out.println("\n**********************************************************************\n");


//o resultado de um operador relacional é um valor booleano.
        System.out.println("10 > 9 is " + (10 > 9));

        int count = 10; //dá a cout um valor inicial igual a 10.
        char chr = 'X'; //inicializa char com a letra X.
        float f = 1.2F; //f é inicializada com 1,2.

//        int x, y = 8, z = 19, w;   -> y e z tem inicializações.
        // System.out.println(x + y + z + w);


        System.out.println("\n**********************************************************************\n");


//demonstra a incialização dinâmica.
        double radius = 4, height = 5;
        //inicializa o volume dinamicamente.
        double volume = 3.1416 * radius * height;
        System.out.println("\nVolume is " + volume);


        System.out.println("\n**********************************************************************\n");


//demonstra escopo de bloco.
        int m; // conhecida pelo código dentro de main()
        m = 10;
        if (m == 10) { //inicia o escopo
            int n = 20; //conhecida apenas nesse bloco
            //tanto m quanto n são conhecidas aqui.
            System.out.println(
                    String.format("m and n: %d, %d", m, n)
            );
            m = n * 2;
        }
//n = 100; Erro! n não é conhecida aquí
// m ainda é conhecida aqui.
        System.out.printf("m is " + m);


        System.out.println("\n**********************************************************************\n");


//demonstra tempo de vida de uma variável
        for (int i = 0; i < 3; i++) {
            int j = -1; //y será inicializada sempre que entrarmos no bloco
            System.out.println("j is " + j); //essa linha sempre exibe -1
            j = 100;
            System.out.println("j is now: " + j);
        }


        System.out.println("\n**********************************************************************\n");


//demonstra o operador %
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 1.0 / 3.0;
        drem = 10.0 % 3.0;
        System.out.println(
                String.format("\n Result and remainder of 10/3: %d, %d", iresult, irem)
        );
        System.out.println(
                String.format("Result and remainder of 10.0/3.0: %d %d", dresult, drem)
        );


        System.out.println("\n**********************************************************************\n");


//demonstra operadores relacionais e lógicos.
        int i, j;
        boolean b1, b2;
        i = 10;
        j = 11;
        if (i < j) System.out.println("\ni < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("i == j");
        if (i >= j) System.out.println("i >= j");
        if (i > j) System.out.println("i > j");

        b1 = true;
        b2 = false;
        if (b1 & b2)
            System.out.println("this won't execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if (b1 | b2) System.out.println("b1 | b2 is true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 is true");


        System.out.println("\n**********************************************************************\n");

// Demonstra os operadores de um curto-circuito.
        int n, d, g;
        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + "is a factor of " + n);
        }
        d = 0; // configura d com zero
//já que d é igual a zero, o segundo operando não é avaliado.
        if (d != 0 && ((n % d) == 0)) {
            System.out.println(d + "is factor of " + n);
        }
        System.out.println("Passou\n");
        /* Tente a mesma coisa sem isso causará um erro de divisão por zero */
        if (d != 0 & (n % d) == 0) {
            System.out.printf(d + "is a factor of " + n);
        }
        System.out.println("Não Passou \n");


        System.out.println("\n**********************************************************************\n");


//Letras maiúsculas.
        char chh;
        for (int t = 0; t < 10; t++) {
            chh = (char) ('a' + t);
            System.out.print(chh);
            //Essa instrução desativa o 6o bit.
            chh = (char) ((int) chh & 65503); // agora chh é maiúscula
            System.out.print(chh + " ");
        }

        System.out.println("\n**********************************************************************\n");

// pré incremento (++x):
        int x = 5;
        int resultado = ++x; //pré-incremento: incrementa x antes de usá-lo em qualquer operação.
        System.out.println("\nx: " + x); // output: x: 6
        System.out.println("Resultado: " + resultado); //Output resultado: 6


        System.out.println("\n**********************************************************************\n");

//pós incremento (x++)
        x = 5;
        resultado = x++; //pós incremento: usa o valor atual de x  depois incrementa
        System.out.println("\n x: " + x);// output: x:6 (incrementado após a atribuição)
        System.out.println("resultado " + resultado); //output: resultado: 5 (valor antes do incremento)


        System.out.println("\n**********************************************************************\n");

//lê um caractere do teclado.
        char chx;
        System.out.println("\n Press a key followed by ENTER: ");
        chx = (char) System.in.read(); //obtém um char
        System.out.println("your Key is: " + chx);


        System.out.println("\n**********************************************************************\n");

//advinhe a letra do jogo.

        char chxy, answer = 'A';
        System.out.println("\n I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it: ");
        chxy = (char) System.in.read(); //lê um char no teclado
        if (chxy == answer) System.out.printf("** Right **");
        else System.out.println("...Sorry, you're Wrong.");

        System.out.println("\n**********************************************************************\n");

//operador ternário
        int numero = 10;
//usando o operador ternário para verificar se o número é par ou ímpar
        String result = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("o numero " + numero + " é " + result + ".");


        System.out.println("\n**********************************************************************\n");

//declaração de enum
        enum DiaDaSemana {
            SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO;
        }
//uso do enum
        DiaDaSemana dia = DiaDaSemana.QUARTA;

//Exemplo de uso do switch-case com enum
        switch (dia) {
            case SEGUNDA:
            case TERÇA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                System.out.println("Dia de trabalho");
                break;
            case SÁBADO:
            case DOMINGO:
                System.out.println("Final de Semana");
                break;
        }

        System.out.println("\n**********************************************************************\n");


//Exibe as raízes quadras de 1 a 99 e o erro de arredonadmento.
double num, scroot, rerr;
for(num = 1.0; num < 100.0; num++) {
    scroot = Math.sqrt(num);
    System.out.println("Square root of " + num + " is " + scroot);
    //calcula o erro de arredondamento
    rerr = num - (scroot * scroot);
    System.out.println("Rouding error is " + rerr);
    System.out.println();

        }

        System.out.println("\n**********************************************************************\n");


//Executa o laço até um S ser digitado.
        System.out.println("Press S to stop.");
        for(i=0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" +i);


        System.out.println("\n**********************************************************************\n");


//Partes de for podem estar vazias.
for(i = 0; i<10; ){
    System.out.println("Pass #" +i);
    i++; //incrementa a variável de controle de laço
}

        System.out.println("\n**********************************************************************\n");


//O corpo de um laço pode estar vazio.
        int sum = 0;
        //soma os números até 5
        for(i = 1; i <= 5; sum += i++);
        System.out.println("Sum is " + sum);
    }
}


