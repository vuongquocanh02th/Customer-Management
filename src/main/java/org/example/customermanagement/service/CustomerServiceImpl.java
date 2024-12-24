package org.example.customermanagement.service;

import org.example.customermanagement.model.Customer;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@gmail.com", "US"));
        customers.put(2, new Customer(2, "Miss", "miss@gmail.com", "HN"));
        customers.put(3, new Customer(3, "Fuck", "fuck@gmail.com", "HCM"));
        customers.put(4, new Customer(4, "Kill", "kill@gmail.com", "QN"));
        customers.put(5, new Customer(5, "Shoot", "shoot@gmail.com", "TH"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
