
package empresaapp;

import java.beans.*;
import java.io.Serializable;


public class Funcionario implements Serializable {
    
    private int nummat;
    private String nome;
    private double salario;
    private char sexo;
    private int ndepto, nsuper;
    Funcionario(){
        
    }


    public int getNummat() {
        return nummat;
    }


    public void setNummat(int nummat) {
        this.nummat = nummat;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

 
    public int getNdepto() {
        return ndepto;
    }


    public void setNdepto(int ndepto) {
        this.ndepto = ndepto;
    }


    public int getNsuper() {
        return nsuper;
    }


    public void setNsuper(int nsuper) {
        this.nsuper = nsuper;
    }
    public void print(){
        System.out.println("número matricula: " + this.nummat);
        System.out.println("NOME: " + this.nome);
        System.out.println("SALARIO: " + this.salario);
        System.out.println("SEXO: " + this.sexo);
        System.out.println("NDEPTO: " + this.ndepto);
        System.out.println("NSUPER: " + this.nsuper);
    }
}
