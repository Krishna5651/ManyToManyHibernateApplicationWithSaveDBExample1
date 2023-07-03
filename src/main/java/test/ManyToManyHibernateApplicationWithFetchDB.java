/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 12:05
 * Project: ManyToManyHibernateApplicationWithSaveDBExample-2
 **/

package test;

import jakarta.persistence.TypedQuery;
import org.example.entity.Customers;
import org.example.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ManyToManyHibernateApplicationWithFetchDB {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        TypedQuery typedQuery=session.createQuery("from Customers customers");
        List<Customers> list=typedQuery.getResultList();
        Iterator<Customers> iterator= list.listIterator();

        while (iterator.hasNext()){
            Customers customers=iterator.next();
            System.out.println(customers.getCustomer_Name()+"  "+customers.getCustomer_Orderno());

            Set<Orders> set=customers.getOrders();
            Iterator<Orders> iterator1=set.iterator();
            while (iterator1.hasNext()){
                Orders orders=iterator1.next();
                System.out.println(orders.getOrder_item()+" "+orders.getOrder_Time());
            }
        }
        session.close();
        System.out.println("Data has been Retrive Successfully");
    }
}


