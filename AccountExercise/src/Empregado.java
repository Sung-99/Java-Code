/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public  abstract class Empregado extends Pagavel{
    protected String nome;
    protected String sobrenome;
    protected int numeroIdentidade;

    public Empregado(String nome, String sobrenome, int numeroIdentidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroIdentidade = numeroIdentidade;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumeroIdentidade() {
        return numeroIdentidade;
    }

    public void setNumeroIdentidade(int numeroIdentidade) {
        this.numeroIdentidade = numeroIdentidade;
    }
}
