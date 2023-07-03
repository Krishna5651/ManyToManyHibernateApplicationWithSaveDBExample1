/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 11:25
 * Project: ManyToManyHibernateApplicationWithSaveDBExample-2
 **/

package org.example.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_Id;
    private String order_item;
    private String order_Time;

    @ManyToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    Set<Customers> customers=new HashSet<Customers>();

    public int getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
    }

    public String getOrder_item() {
        return order_item;
    }

    public void setOrder_item(String order_item) {
        this.order_item = order_item;
    }

    public String getOrder_Time() {
        return order_Time;
    }

    public void setOrder_Time(String order_Time) {
        this.order_Time = order_Time;
    }

    public Set<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customers> customers) {
        this.customers = customers;
    }
}


