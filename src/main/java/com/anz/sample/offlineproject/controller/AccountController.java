package com.anz.sample.offlineproject.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.anz.sample.offlineproject.model.Account;
import com.anz.sample.offlineproject.model.AccountTransactions;
import com.anz.sample.offlineproject.repository.AccountRepository;
import com.anz.sample.offlineproject.repository.AccountTransactionsRepository;

@RestController
public class AccountController {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	AccountTransactionsRepository accountTransactionsRepository;

	@GetMapping("/")
	public List<Account> listAll() {
		return accountRepository.findAll();
	}

	@GetMapping("/{id}")
	public Account listId(@PathVariable(value = "id") int id) throws Exception {

		Account account = accountRepository.findByAccountNumber(id);

		if (account == null)
			throw new IOException("Account details cannot be found for account Number: " + id);

		return account;
	}

	@GetMapping("/listTransactions/{id}")
	public List<AccountTransactions> listTransactions(@PathVariable(value = "id") int id) throws Exception {
		List<AccountTransactions> acctTransactions = accountTransactionsRepository.findByAccountNumber(id);

		if (acctTransactions.size() == 0)
			throw new IOException("Transactions not found for account number:" + id);

		return acctTransactions;
	}

}
