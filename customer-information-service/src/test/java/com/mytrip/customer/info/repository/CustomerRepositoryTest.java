package com.mytrip.customer.info.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mytrip.customer.info.entity.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;

    @Before
    public void setUp() throws Exception {
        Customer customer1 = new Customer("Testfirst", "Testfirst");
        Customer customer2 = new Customer("Testsecond", "Testsecond");
        //save product, verify has ID value after save
        assertNull(customer1.getId());
        assertNull(customer2.getId());//null before save
        this.repository.save(customer1);
        this.repository.save(customer2);
        assertNotNull(customer1.getId());
        assertNotNull(customer2.getId());
    }

    @Test
    public void testDataUpdate(){
    }

    @After
    public void tearDown() throws Exception {
      this.repository.deleteAll();
    }
}
