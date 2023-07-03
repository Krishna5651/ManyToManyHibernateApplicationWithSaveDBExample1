package org.example.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class OrdersTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Orders}
     *   <li>{@link Orders#setCustomers(Set)}
     *   <li>{@link Orders#setOrder_Id(int)}
     *   <li>{@link Orders#setOrder_Time(String)}
     *   <li>{@link Orders#setOrder_item(String)}
     *   <li>{@link Orders#getCustomers()}
     *   <li>{@link Orders#getOrder_Id()}
     *   <li>{@link Orders#getOrder_Time()}
     *   <li>{@link Orders#getOrder_item()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Orders actualOrders = new Orders();
        HashSet<Customers> customers = new HashSet<>();
        actualOrders.setCustomers(customers);
        actualOrders.setOrder_Id(1);
        actualOrders.setOrder_Time("Order Time");
        actualOrders.setOrder_item("Order item");
        assertSame(customers, actualOrders.getCustomers());
        assertEquals(1, actualOrders.getOrder_Id());
        assertEquals("Order Time", actualOrders.getOrder_Time());
        assertEquals("Order item", actualOrders.getOrder_item());
    }
}

