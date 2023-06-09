package com.petshopSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petshopSystem.entities.Customers;
import com.petshopSystem.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List<Customers> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@PostMapping
	public Customers addCustomer(@RequestBody Customers customer) {
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<?> getCustomerByName(@PathVariable String name) {
		return customerService.getCustomerByName(name);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}
	
    @PutMapping("/id/{id}")
    public ResponseEntity<Object> updateCustomer(@PathVariable Long id, @RequestBody Customers customer) {
        return customerService.updateCustomer(id, customer);
    }
    
    @DeleteMapping("/id/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
