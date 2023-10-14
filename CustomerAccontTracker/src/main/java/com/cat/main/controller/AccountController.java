package com.cat.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cat.main.entity.Account;
import com.cat.main.service.AccountService;

//AccountController.java
@RestController
@RequestMapping("/accounts")
public class AccountController {
 @Autowired
 private AccountService accountService;

 @GetMapping
 public List<Account> getAllAccounts() {
     return accountService.getAllAccounts();
 }

 @GetMapping("/{id}")
 public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
     Account account = accountService.getAccountById(id);
     if (account != null) {
         return ResponseEntity.ok(account);
     }
     return ResponseEntity.notFound().build();
 }

 @PostMapping
 public ResponseEntity<Account> createAccount(@RequestBody Account account) {
     Account createdAccount = accountService.createAccount(account);
     return ResponseEntity.status(HttpStatus.CREATED).body(createdAccount);
 }

 @PutMapping("/{id}")
 public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account account) {
     Account updatedAccount = accountService.updateAccount(id, account);
     if (updatedAccount != null) {
         return ResponseEntity.ok(updatedAccount);
     }
     return ResponseEntity.notFound().build();
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<?> deleteAccount(@PathVariable Long id) {
     accountService.deleteAccount(id);
     return ResponseEntity.noContent().build();
 }
}
