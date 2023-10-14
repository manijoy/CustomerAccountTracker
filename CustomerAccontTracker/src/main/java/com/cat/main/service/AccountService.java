package com.cat.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.main.entity.Account;
import com.cat.main.repository.AccountRepository;

import java.util.List;

//AccountService.java
@Service
public class AccountService {
 @Autowired
 private AccountRepository accountRepository;

 public List<Account> getAllAccounts() {
     return accountRepository.findAll();
 }

 public Account getAccountById(Long id) {
     return accountRepository.findById(id).orElse(null);
 }

 public Account createAccount(Account account) {
     return accountRepository.save(account);
 }

 public Account updateAccount(Long id, Account account) {
     if (accountRepository.existsById(id)) {
         account.setId(id);
         return accountRepository.save(account);
     }
     return null;
 }

 public void deleteAccount(Long id) {
     accountRepository.deleteById(id);
 }
}
