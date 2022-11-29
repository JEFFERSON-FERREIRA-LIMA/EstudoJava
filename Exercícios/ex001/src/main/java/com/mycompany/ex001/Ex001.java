package com.mycompany.ex001;
public class Ex001 {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.ano = 2000;
        c.cor = "Prata";
        c.marca = "Fiat";
        c.modelo = "Palio";
        c.ligado = true;
        c.funcionando();
        c.status();
    }
}
