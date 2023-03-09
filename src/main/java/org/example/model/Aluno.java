package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "Alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private int RA;
    @Column(name = "MEDIA_FINAL")
    private double media;

    public Aluno (String nome, int RA, double media) {
        this.nome = nome;
        this.RA = RA;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
