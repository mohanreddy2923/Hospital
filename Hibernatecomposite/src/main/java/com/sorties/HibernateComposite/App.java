package com.sorties.HibernateComposite;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration(); 
       cfg.configure("hibernate.cfg.xml");
       SessionFactory fact= cfg.buildSessionFactory();
       Session sess = fact.openSession();
       sess.beginTransaction();
       Ck_accId id1= new Ck_accId(10, 1016);
        Account acc= new Account();
        acc.setCk_accid(id1);
        acc.setAcc_bal(8100); 
       Ck_accId id2= new Ck_accId(11, 1020);
       Account acc2 = new Account();
       acc2.setCk_accid(id2);
       acc2.setAcc_bal(7200);
       sess.save(acc); 
       sess.save(acc2);
       sess.getTransaction().commit();
       System.out.println("created");
       sess.close();
    }
} 