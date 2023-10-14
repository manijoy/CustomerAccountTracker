package com.cat.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.main.entity.Customer;
import com.cat.main.service.CustomerService;

//CustomerController.java
@RestController
@RequestMapping("/customers")
public class CustomerController {
 @Autowired
 private CustomerService customerService;

 
 @GetMapping("/hi")
 public String hello()
 {
	 return("Hello");
 }
 @GetMapping("/allcustomers")
 public List<Customer> getAllCustomers() {
     return customerService.getAllCustomers();
 }

 @GetMapping("/{id}")
 public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
     Customer customer = customerService.getCustomerById(id);
     if (customer != null) {
         return ResponseEntity.ok(customer);
     }
     return ResponseEntity.notFound().build();
 }

 @PostMapping("/createcustomer")
 public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
     Customer createdCustomer = customerService.createCustomer(customer);
     return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
 }

 @PutMapping("/{id}")
 public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
     Customer updatedCustomer = customerService.updateCustomer(id, customer);
     if (updatedCustomer != null) {
         return ResponseEntity.ok(updatedCustomer);
     }
     return ResponseEntity.notFound().build();
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<?> deleteCustomer(@PathVariable Long id) {
     customerService.deleteCustomer(id);
     return ResponseEntity.noContent().build();
 }
}

