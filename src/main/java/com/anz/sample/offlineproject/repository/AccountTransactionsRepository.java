package com.anz.sample.offlineproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anz.sample.offlineproject.model.AccountTransactions;

@Repository
@Transactional
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Integer> {
	List<AccountTransactions> findByAccountNumber(int accountNumber);

}
