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

        public void deletar(Disciplina disciplina) {
//          Precisa garantir que o objeto excluído esteja sendo gerenciado pela JPA
            this.em.merge(disciplina);
            this.em.remove(disciplina);
        }

        public Class<Disciplina> buscaDisciplinaById(Long id) {
            this.em.find(Disciplina.class, id);
            return Disciplina.class;
        }

}
