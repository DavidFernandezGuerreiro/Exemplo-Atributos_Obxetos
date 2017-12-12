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
public class Persoa {
    private String nome;
    private String dni;
    
    public Persoa(){
        
    }
    public Persoa(String nom, String dni){
        nome=nom;
        this.dni=dni;
    }
    
    public void setNome(String nom){
        nome=nom;
    }
    public String getNome(){
        return nome;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    public String getDni(){
        return dni;
    }
    
    @Override //sobreescrito
    public String toString(){
        return "nome"+ nome +", dni="+dni;
    }
}
