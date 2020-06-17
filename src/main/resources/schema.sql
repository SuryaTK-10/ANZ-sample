CREATE SCHEMA ACCOUNT_BANKING;

DROP TABLE IF EXISTS ACCOUNT_BANKING.ACCOUNT;
  
CREATE TABLE ACCOUNT_BANKING.ACCOUNT (
  account_number INT NOT NULL,
  account_name VARCHAR(250) NOT NULL,
  account_type VARCHAR(250) NOT NULL,
  balance_date VARCHAR(250) NOT NULL,
  account_currency VARCHAR(250) NOT NULL,
  account_balance  VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS ACCOUNT_BANKING.ACCOUNT_TRANSACTIONS;
  
CREATE TABLE ACCOUNT_BANKING.ACCOUNT_TRANSACTIONS (
  account_number INT NOT NULL,
  account_name VARCHAR(250) NOT NULL,
  account_value_date VARCHAR(250) NOT NULL,
  account_currency VARCHAR(250) NOT NULL,
  account_credit_amt VARCHAR(250) ,
  account_debit_amt VARCHAR(250) ,
  account_debit_credit VARCHAR(250) NOT NULL,
  account_transaction_narrative VARCHAR(250)
);

