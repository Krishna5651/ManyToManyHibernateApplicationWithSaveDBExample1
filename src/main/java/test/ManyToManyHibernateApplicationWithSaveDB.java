/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 11:37
 * Project: ManyToManyHibernateApplicationWithSaveDBExample-2
 **/

package test;

import org.example.entity.Customers;
import org.example.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ManyToManyHibernateApplicationWithSaveDB {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Customers customers=new Customers();
        customers.setCustomer_Name("Krishna Shinde");
        customers.setCustomer_Orderno("22");

        Orders orders=new Orders();
        orders.setOrder_item("Biryani");
        orders.setOrder_Time("12:00 PM");

        orders.getCustomers().add(customers);
        customers.getOrders().add(orders);

        session.persist(customers);
        transaction.commit();
        session.close();
        System.out.println("Data has been successfully saved");

    }
}


