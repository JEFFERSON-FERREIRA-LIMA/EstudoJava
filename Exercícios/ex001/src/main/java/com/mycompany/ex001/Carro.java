
package com.mycompany.ex001;
public class Carro {
    String marca;
    String modelo;
    String cor;
    int ano;
    boolean ligado;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Está ligado? " + this.ligado);
    }
    void funcionando(){
        if (this.ligado == true){
            System.out.println("O carro está ligado!");
        } else 
    System.out.println("O carro não está ligado!");
    }
}