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
public class Conta { // Clase Conta que engloba a Persoa
    private Persoa titular = new Persoa(); //esto va a Persoa.java y coge el valor nome=null y dni=null
    private double saldo;
    
    public Conta(){ //nos da 0 e nulls
        //a double saldo; el constructor por defecto le da un 0 en memoria.
        
    }
    public Conta (String nom, String dn, double saldo){
        titular.setNome(nom);
        titular.setDni(dn);
        this.saldo=saldo;
    }
    public Conta(Persoa ti, double saldo){// lo va a coger obxPer e conta2
        titular=ti;
        this.saldo=saldo;
    }
    
    public void setTitular(Persoa titular){
        this.titular=titular;
    }
    public Persoa getTitular(){
        return titular;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    
    @Override
    public String toString(){
        return "nome : "+ titular.getNome() +", dni : "+titular.getDni()+" saldo : "+saldo;
    }
}
