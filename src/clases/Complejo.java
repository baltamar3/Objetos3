/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author baltamar
 */
public class Complejo {
    
    private int parte_real;
    private int parte_imaginaria;
    
    public Complejo(int parte_real, int parte_imaginaria){
        this.parte_real= parte_real;
        this.parte_imaginaria = parte_imaginaria;
    }

    public int getParte_real() {
        return parte_real;
    }

    public void setParte_real(int parte_real) {
        this.parte_real = parte_real;
    }

    public int getParte_imaginaria() {
        return parte_imaginaria;
    }

    public void setParte_imaginaria(int parte_imaginaria) {
        this.parte_imaginaria = parte_imaginaria;
    }
    
    public Complejo sumar(Complejo c2){
        Complejo z;
        int  r, i;
        r = this.parte_real + c2.parte_real;
        i = this.parte_imaginaria + c2.parte_imaginaria;
        z = new Complejo(r, i);
        return z;
    }
    
    public Complejo restar(Complejo c2){
        Complejo c;
        int  real, imaginario;
        real = this.parte_real - c2.parte_real;
        imaginario = this.parte_imaginaria - c2.parte_imaginaria;
        c = new Complejo(real, imaginario);
        return c;
    }
    
    public Complejo multiplicar(Complejo c2){
        Complejo c;
        int  real, imaginario;
        real = (this.parte_real * c2.parte_real) - (this.parte_imaginaria * c2.parte_imaginaria);
        imaginario = (this.parte_real * c2.parte_imaginaria) + (this.parte_imaginaria * c2.parte_real);
        c = new Complejo(real, imaginario);
        return c;
    }
    
    public Complejo dividir(Complejo c2){
        Complejo c;
        int real_numerador, imaginario_numerador;
        real_numerador = ((this.parte_real * c2.parte_real) + (this.parte_imaginaria * c2.parte_imaginaria));
        imaginario_numerador = ((this.parte_imaginaria * c2.parte_real) - (this.parte_real * c2.parte_imaginaria));
        c = new Complejo(real_numerador, imaginario_numerador);
        return c;
    }
    
    
}
