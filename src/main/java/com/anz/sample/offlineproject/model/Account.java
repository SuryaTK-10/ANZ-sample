package com.anz.sample.offlineproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

@Entity
public class Account {

	@Id
	@NotNull
	@Column(name = "account_number")
	public int accountNumber;

	@NotNull
	@Column(name = "account_name")
	public String accountName;

	@NotNull
	@Column(name = "account_type")
	public String accountType;

	@NotNull
	@Column(name = "balance_date")
	public String balanceDate;

	@NotNull
	@Column(name = "account_currency")
	public String accountCurrency;

	@NotNull
	@Column(name = "account_balance")
	public int accountBalance;

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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", balanceDate=" + balanceDate + ", accountCurrency=" + accountCurrency
				+ ", accountBalance=" + accountBalance + "]";
	}

}
