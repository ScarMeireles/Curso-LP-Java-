package LotoFacil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JanelaLF extends JFrame {

    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo simples de Janela");
    //Construtor


    public JanelaLF() {
        this.setTitle("lotoFácil - Interface Gráfica:");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));
        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random gerador = new Random();
                int resultado = gerador.nextInt(101);
                String aposta = JOptionPane.showInputDialog(null,
                        "Digite um número de 0 a 100");                         //Scanner in = new Scanner(System.in)
                int numeroApostado = Integer.parseInt(aposta);
                if(numeroApostado == resultado){
                    JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou 1000 reais.");           //System.out.println
                }
                else{
                    JOptionPane.showMessageDialog(null, "Que pena, você errou! \n O número sorteado era: " + resultado);
                }
            }
        });    //Atribuir a ação do botão 1

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char letrapremiada = 'A';
                String letraApostada = JOptionPane.showInputDialog(null,
                        "Digite uma letra de A a Z");                           //Scanner in = new Scanner(System.in)

                if (Character.isLetter(letraApostada.charAt(0))) {
                    char letraMaiuscula = Character.toUpperCase(letraApostada.charAt(0));

                    if(letraMaiuscula == letrapremiada){
                        JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou 500 reais.");        //System.out.println
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Que pena, você errou! \n A letra sorteada era:  " + letrapremiada);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Aposta inválida.");
                }
            }
        });   //Atribuir a ação do botão 2

        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroPI = JOptionPane.showInputDialog(null,
                        "Digite um numero qualquer");                           //Scanner in = new Scanner(System.in)
                int numero = Integer.parseInt(numeroPI);
                if(numero % 2 == 0){
                    JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou 100 reais.");            //System.out.println
                }
                else{
                    JOptionPane.showMessageDialog(null, "Que pena, você errou! \n O vencedor era par. ");
                }
            }
        });    //Atribuir a ação do botão 3

        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); //Centralizar Janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); //Exibir Janela
    }

    public static void main(String[] args) {
        new JanelaLF();
    }
}
