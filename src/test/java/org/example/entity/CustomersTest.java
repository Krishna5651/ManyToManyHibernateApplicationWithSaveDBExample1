package org.example.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class CustomersTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Customers}
     *   <li>{@link Customers#setCustomer_Id(int)}
     *   <li>{@link Customers#setCustomer_Name(String)}
     *   <li>{@link Customers#setCustomer_Orderno(String)}
     *   <li>{@link Customers#setOrders(Set)}
     *   <li>{@link Customers#getCustomer_Id()}
     *   <li>{@link Customers#getCustomer_Name()}
     *   <li>{@link Customers#getCustomer_Orderno()}
     *   <li>{@link Customers#getOrders()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Customers actualCustomers = new Customers();
        actualCustomers.setCustomer_Id(1);
        actualCustomers.setCustomer_Name("Customer Name");
        actualCustomers.setCustomer_Orderno("Customer Orderno");
        HashSet<Orders> orders = new HashSet<>();
        actualCustomers.setOrders(orders);
        assertEquals(1, actualCustomers.getCustomer_Id());
        assertEquals("Customer Name", actualCustomers.getCustomer_Name());
        assertEquals("Customer Orderno", actualCustomers.getCustomer_Orderno());
        assertSame(orders, actualCustomers.getOrders());
    }
}

