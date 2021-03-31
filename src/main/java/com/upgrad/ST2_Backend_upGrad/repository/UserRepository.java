package com.upgrad.ST2_Backend_upGrad.repository;

import com.upgrad.ST2_Backend_upGrad.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class UserRepository {

    @PersistenceUnit(unitName = "ST2Project")
    private EntityManagerFactory entityManagerFactory;

    public void registerUser(User newUser){
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();

        try{

            transaction.begin();
            entityManager.persist(newUser);
            transaction.commit();

        }
        catch (Exception e){
            System.out.println(e);
            transaction.rollback();
        }
    }

}

