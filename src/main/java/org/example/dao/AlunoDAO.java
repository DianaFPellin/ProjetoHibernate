package org.example.dao;

import org.example.model.Aluno;

import javax.persistence.EntityManager;

public class AlunoDAO {
//  Instancia uma injeção de dependência
    private EntityManager em;

//   Como o objetivo é usar o EM, não é mais necessário iniciar o fechar a conexão
    public AlunoDAO(EntityManager em) {
        this.em = em;
    }

//  Métodos relacionados ao CRUD
    public void salvar(Aluno aluno) {
        this.em.persist(aluno);
    }

}
