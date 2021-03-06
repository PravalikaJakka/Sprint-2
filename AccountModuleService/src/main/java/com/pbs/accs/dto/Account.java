package com.pbs.accs.dto;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Account 
{
	 @Id
     @Column(name="acc_no")
	 @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="acc_seq")
	 @SequenceGenerator(name="acc_seq",sequenceName="acc_seq",allocationSize=1)
     Long accountNo;
     @Column(name="acc_type")
     String type;
     @Column(name="acc_opendate")
     LocalDate openDate;
     @Column(name="acc_balance")
     double balance;
     @Column(name="acc_status")
     String status;
     @OneToOne(cascade=CascadeType.ALL)
     @JoinColumn(name="cust_id")
     Customer customer;
     public Account() {}
	public Account(Long accountNo, String type, LocalDate openDate, double balance, String status, Customer customer) 
	{
		this.accountNo = accountNo;		this.type = type;		this.openDate = openDate;
		this.balance = balance;		this.status = status;		this.customer = customer;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getOpenDate() {
		return openDate;
	}
	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	} 
	
}
