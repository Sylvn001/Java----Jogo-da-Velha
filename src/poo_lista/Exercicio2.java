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
public class Exercicio2 {
    public static void main(String[] args) {
        CodigoPostal c1 = new CodigoPostal();
        CodigoPostal c2 = new CodigoPostal(19026,858,"Marina Menegasso Artoni");
        CodigoPostal c3 = new CodigoPostal(19026, "Marina Menegasso Artoni");
        
        c1.mostra();
        c2.mostra();
        c3.mostra();
    }
}
