package org.example;

import org.example.dao.AlunoDAO;
import org.example.dao.DisciplinaDAO;
import org.example.model.Aluno;
import org.example.model.Disciplina;
import org.example.util.Factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ângela", 5, 9.9);
        Disciplina disciplina = new Disciplina("Orientação a objetos 2", 21);
        Disciplina dis = new Disciplina();

        //Cria um Factory para instanciar um EntityManager, o factory usa unidades de persistencia para instanciar as conexões
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aulaJPA");

        //Responsável pela conexão com o banco instanciado na factory.
        EntityManager em = Factory.getEntityManager();
        AlunoDAO alunoDAO = new AlunoDAO(em);
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO(em);

        //Iniciar a conexão com o banco.
        em.getTransaction().begin();
//        alunoDAO.salvar(aluno);
//        disciplinaDAO.salvar(disciplina);

        dis = disciplinaDAO.buscaDisciplinaById(5L);
        disciplinaDAO.deletar(dis);

        em.getTransaction().commit();
        em.close();
    }
}