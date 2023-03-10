package org.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private int qtde_alunos;
    public Disciplina (String nome, int qtde_alunos) {
        this.nome = nome;
        this.qtde_alunos = qtde_alunos;
    }

    public Disciplina() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde_alunos() {
        return qtde_alunos;
    }

    public void setQtde_alunos(int qtde_alunos) {
        this.qtde_alunos = qtde_alunos;
    }
}
