package poo_lista;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Tabuleiro jogo = new Tabuleiro();
        jogo.exibe();
        int l, c, j;
        String x, y;
        System.out.println("Jogador 1 - Circulo (1)");
        System.out.println("Jogador 2 - X (2)");
        String op = "";
        do{
            do 
            {

               System.out.println("Digite as cordenadas!");
               System.out.println("Jogador 1: ");
               j=1;
               x =( JOptionPane.showInputDialog(null, "Jogador 1: Digite a linha: ") );
               l = Integer.parseInt(x);
               y = JOptionPane.showInputDialog(null, "Jogador 1: Digite a coluna: ");
               c = Integer.parseInt(y);

               while(jogo.partida(l,c,j) == -1)
               {
                    System.out.println("Jogador 1: ");
                    j=1;
                    x =( JOptionPane.showInputDialog(null, "Jogador 1: Digite a linha: ") );
                    l = Integer.parseInt(x);
                    y = JOptionPane.showInputDialog(null, "Jogador 1: Digite a coluna: ");
                    c = Integer.parseInt(y);
               }
               jogo.verifica();
               if(jogo.isFim() != true)
               {   
                    System.out.println("Jogador 2:");  
                    x =( JOptionPane.showInputDialog(null, "Jogador 2: Digite a linha: ") );
                    l = Integer.parseInt(x);
                    y = JOptionPane.showInputDialog(null, "Jogador 3: Digite a coluna: ");
                    c = Integer.parseInt(y);
                    j = 2;   

                   while(jogo.partida(l, c, j) == -1)
                    {
                        System.out.println("Jogador 2:");  
                        x =( JOptionPane.showInputDialog(null, "Jogador 2: Digite a linha: ") );
                        l = Integer.parseInt(x);
                        y = JOptionPane.showInputDialog(null, "Jogador 3: Digite a coluna: ");
                        c = Integer.parseInt(y);
                        j = 2;      
                    }
                    jogo.verifica();
               }


            }while(jogo.isFim() != true);
            jogo.placar();
        System.out.println("Deseja Continuar? S/N");
        op = leitura.nextLine();
        jogo.limpar();
    }while(op != "N");
}
}
