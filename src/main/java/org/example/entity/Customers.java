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
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_Id;
    private String customer_Name;
    private String customer_Orderno;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "customers_orders",joinColumns = {@JoinColumn(name = "customer_Id")}
    ,inverseJoinColumns = {@JoinColumn(name = "order_Id")})
    Set<Orders> orders=new HashSet<Orders>();

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public String getCustomer_Orderno() {
        return customer_Orderno;
    }

    public void setCustomer_Orderno(String customer_Orderno) {
        this.customer_Orderno = customer_Orderno;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
}


