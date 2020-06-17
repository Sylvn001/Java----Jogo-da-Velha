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
public class Exercicio3 {
    public static void main(String[] args) {
        Veiculo uno = new Veiculo("uno" , 40 , 16);
        uno.abastecer(20);
        System.out.println("Tanque atual: " + uno.getQtdCombustivel());
        uno.percorrer(150);
        System.out.println("Odometro: " +uno.getOdometro());
        System.out.println("Tanque atual: " + uno.getQtdCombustivel());
        
        System.out.println("O carro pode percorrer: " + uno.getAutonomia() + " KM com a qtd de litros restante");
    }
}
