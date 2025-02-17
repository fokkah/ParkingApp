package se.lexicon.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.lexicon.model.Customer;
import se.lexicon.model.Vehicle;

public class CustomerDaoTest {

    CustomerDao testObject;

    @BeforeEach
    public void setup() {
        testObject = new CustomerDaoImpl();
    }

    @Test
    void testCreateCustomerSuccessfully() {
        Customer customer = new Customer("Test Name", "0123456789", new Vehicle("ABC123", "Car"));
        Customer createdCustomer = testObject.create(customer);
        Assertions.assertNotNull(createdCustomer.getId());
    }

    @Test
    @DisplayName("Should find a customer by ID when the customer exists")
    void findByIdReturnsCustomerWhenExists() {
        // todo: needs completion
    }

    @Test
    @DisplayName("Should return empty when no customer exists for the given ID")
    void findByIdReturnsEmptyWhenNotExists() {
        // todo: needs completion
    }

}
