/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_lista;

/**
 *
 * @author junio
 */
public class Tabuleiro {
    private int [][] tabela ;
    private boolean fim;
    private int jogador1;
    private int jogador2;
    
    public Tabuleiro(){
         tabela = new int[3][3];
         
        for(int l=0; l<this.tabela.length ; l++)
        {
            for(int c=0 ; c<this.tabela.length; c++)
            {
                this.tabela[l][c] = 0;
            }
        }
         fim = false;
    }

    public void setTabela(int[][] tabela) {
        this.tabela = tabela;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }
    

    public int[][] getTabela() {
        return tabela;
    }

    public boolean isFim() {
        return fim;
    }
    
    public void exibe()
    {
        for(int l=0; l<this.tabela.length ; l++)
        {
            for(int c=0 ; c<this.tabela.length; c++)
            {
                System.out.print( this.tabela[l][c]  + " ");
            }
            System.out.println("");
        }
    }
    public void limpar()
    {
        for(int l=0; l<this.tabela.length ; l++)
        {
            for(int c=0 ; c<this.tabela.length; c++)
            {
                this.tabela[l][c] = 0;
            }
        }
        setFim(false);
    }
    public int partida(int l, int c, int j)
    {
        if(l >= 0 && l <=2 && c >=0 && c <=2 )
        {
            if(tabela[l][c] == 0)
            {
                 tabela[l][c] = j; 
                 this.exibe();
                 return 0;
            }
            else
                System.out.println("Posicao ja ocupada");
  
        }
        else
            System.out.println("Posicao invalida!");
        return -1;
    }

    public void verifica()
    {
        int cont0=0;
        int cont1 = 0, cont2 = 0;
        int c, l;
        for(l =0; l<3; l++ )
        {
           if(tabela[l][l] == 1)
               cont1++;
           else 
               if (tabela[l][l] == 2)
                cont2++;
        }
        
        if(cont1 == 3)
        {
            System.out.println("Jogador 1 Venceu");
            jogador1++;
            setFim(true);
        }
        else if(cont2 == 3){
            System.out.println("Jogador 2 Venceu");
            jogador2++;
            setFim(true);
        }
        
        for( l = 0; l<3; l++)
        {
            cont1 =0; 
            cont2 =0;
            for( c = 0; c<3; c++)
            {
                if(tabela[l][c] == 2)
                    cont2++;
                else if(tabela[l][c] == 1)
                    cont1++;
            }
              
            if(cont1 == 3)
            {
                System.out.println("Jogador 1 Venceu");
                jogador1++;
                setFim(true);
            }
            else if(cont2 == 3){
                System.out.println("Jogador 2 Venceu");
                jogador2++;
                setFim(true);
            }
        }
        
           for( c = 0; c<3; c++)
        {
            cont1 =0; 
            cont2 =0;
            for( l = 0; l<3; l++)
            {
                if(tabela[l][c] == 2)
                    cont2++;
                else if(tabela[l][c] == 1)
                    cont1++;
            }
              
            if(cont1 == 3)
            {
                System.out.println("Jogador 1 Venceu");
                jogador1++;
                setFim(true);
            }
            else if(cont2 == 3){
                System.out.println("Jogador 2 Venceu");
                jogador2++;
                setFim(true);
            }
        }
           
        cont1=0;
        cont2=0;
        for(l=0; l<3; l++)
        {
            if(tabela[l][2 - l] == 1)
                cont1++;
            else if (tabela[l][2 - l] == 2)
                cont2++;
        }
        if(cont1 == 3)
        {
            System.out.println("Jogador 1 Venceu");
            jogador1++;
            setFim(true);
        }
        else {
            if(cont2 == 3){
                System.out.println("Jogador 2 Venceu");
                jogador2++;
                setFim(true);
            }
            else{ 
                for(l=0; l<3; l++)
                {
                    for(c=0; c<3; c++)
                    {
                        if(tabela[l][c] == 0)
                              cont0++;
                    }
                }
                if(cont0 == 0 ){
                    System.out.println("Empate");
                    setFim(true);
                }
            }
        }
    }
    
    public void placar()
    {
        System.out.println("------------- Placar ---------------");
        System.out.println("Jogador 1: " + this.jogador1 + " X Jogador 2: " +this.jogador2);
    }
}
