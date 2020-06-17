package com.anz.sample.offlineproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class AccountTransactions {

	@Id
	@NotNull
	@Column(name = "account_number")
	public int accountNumber;

	@NotNull
	@Column(name = "account_name")
	public String accountName;

	@NotNull
	@Column(name = "account_value_date")
	public String accountValueDate;

	@NotNull
	@Column(name = "account_currency")
	public String accountCurrency;

	@Column(name = "account_credit_amt")
	public String accountCreditAmt;

	@Column(name = "account_debit_amt")
	public String accountDebitAmt;

	@NotNull

	@Column(name = "account_debit_credit")
	public String accountDebitCredit;

	@Column(name = "account_transaction_narrative")
	public String accountTransactionNarrative;

	public AccountTransactions() {
		super();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountValueDate() {
		return accountValueDate;
	}

	public void setAccountValueDate(String accountValueDate) {
		this.accountValueDate = accountValueDate;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getAccountCreditAmt() {
		return accountCreditAmt;
	}

	public void setAccountCreditAmt(String accountCreditAmt) {
		this.accountCreditAmt = accountCreditAmt;
	}

	public String getAccountDebitAmt() {
		return accountDebitAmt;
	}

	public void setAccountDebitAmt(String accountDebitAmt) {
		this.accountDebitAmt = accountDebitAmt;
	}

	public String getAccountDebitCredit() {
		return accountDebitCredit;
	}

	public void setAccountDebitCredit(String accountDebitCredit) {
		this.accountDebitCredit = accountDebitCredit;
	}

	public String getAccountTransactionNarrative() {
		return accountTransactionNarrative;
	}

	public void setAccountTransactionNarrative(String accountTransactionNarrative) {
		this.accountTransactionNarrative = accountTransactionNarrative;
	}

	@Override
	public String toString() {
		return "AccountTransactions [accountNumber=" + accountNumber + ", accountName=" + accountName
				+ ", accountValueDate=" + accountValueDate + ", accountCurrency=" + accountCurrency
				+ ", accountCreditAmt=" + accountCreditAmt + ", accountDebitAmt=" + accountDebitAmt
				+ ", accountDebitCredit=" + accountDebitCredit + ", accountTransactionNarrative="
				+ accountTransactionNarrative + "]";
	}

}