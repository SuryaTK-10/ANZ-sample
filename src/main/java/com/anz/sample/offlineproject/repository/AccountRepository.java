package com.anz.sample.offlineproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anz.sample.offlineproject.model.Account;

@Repository
@Transactional
public interface AccountRepository extends CrudRepository<Account, Integer> {

	List<Account> findAll();

	Account findByAccountNumber(int accountNumber);
}
