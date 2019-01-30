package Waehrungsrechner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Logger {

    private EntityManager en;
    private EntityManagerFactory ef;


    public Logger(){
        ef = Persistence.createEntityManagerFactory("waehrungsrechner");
        en = ef.createEntityManager();
    }

    public void create(LoggerEntity le){
        en.getTransaction().begin();
        en.persist(le);
        en.getTransaction().commit();

    }

    public void delete(LoggerEntity le){
        en.getTransaction().begin();
        en.remove(le);
        en.getTransaction().commit();
    }

    public void update(LoggerEntity le, String update){
        en.getTransaction().begin();
        le.setEntry(update);
        en.getTransaction().commit();
    }

}
