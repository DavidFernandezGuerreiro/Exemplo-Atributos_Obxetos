/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.atributos_obxectos;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploAtributos_Obxectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta obxConta=new Conta("millonetis", "1111111", 100000000); //Siempre en orden Nombre, DNI y saldo.
        System.out.println(obxConta.toString()); // <- eso, coge el valor de arriba, con el toString de Conta.java
        
        Conta obxConta2=new Conta("pobrillo", "12121212", 200);
        System.out.println(obxConta2.toString());
        
        Persoa obxPer=new Persoa("bbbbbbb", "22222222"); 
        Conta conta2=new Conta(obxPer, 5555555555.0);
        System.out.println("conta2 : "+conta2.toString());
        
    }
    
}
