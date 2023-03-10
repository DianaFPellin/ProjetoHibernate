package org.example.dao;

import org.example.model.Aluno;
import org.example.model.Disciplina;

import javax.persistence.EntityManager;

public class DisciplinaDAO {
        //  Instancia uma injeção de dependência
        private EntityManager em;

        //   Como o objetivo é usar o EM, não é mais necessário iniciar o fechar a conexão
        public DisciplinaDAO(EntityManager em) {
            this.em = em;
        }

        //  Métodos relacionados ao CRUD
        public void salvar(Disciplina disciplina) {
            this.em.persist(disciplina);
        }

}
