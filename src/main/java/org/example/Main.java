package org.example;

import org.example.model.Aluno;
import org.example.model.Disciplina;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Aluno pedro = new Aluno("Pedro", 5, 8.2);
        Disciplina mat = new Disciplina("Matemática", 12);

        //Cria um Factory para instanciar um EntityManager, o factory usa unidades de persistencia para instanciar as conexões
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aulaJPA");

        //Responsável pela conexão com o banco instanciado na factory.
        EntityManager em = factory.createEntityManager();

        //Iniciar a conexão com o banco.
        em.getTransaction().begin();
        em.persist(pedro);
        em.persist(mat);
        em.getTransaction().commit();
        em.close();
    }
}