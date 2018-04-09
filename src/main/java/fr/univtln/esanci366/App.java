package fr.univtln.esanci366;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
        EntityManager em = emf.createEntityManager();


        Personne p1 = new Personne();

        p1.setNom("Michel");
        p1.setPrenom("Martin");




        EntityTransaction transac = em.getTransaction();

        transac.begin();
        em.persist(p1);
        transac.commit();



    }
}
