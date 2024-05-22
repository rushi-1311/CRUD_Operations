package com.bank.model;

import javax.persistence.*;

import com.bank.model.*;

@Entity
@Table(name = "Customer_AccDetails")
public class AccDetails {
	@Column(name = "Customer_Name")
	private String name;
	@Id
	@Column(name = "CustomerID")
	private int id;
	@Column(name = "IFSC_Code")
	private String ifsc;
	@Column(name = "Branch_Name")
	private String branch;
	@OneToOne(mappedBy = "ac", cascade = CascadeType.ALL)
	private Address ad;

	// Default constructor
	public AccDetails() {
		// You can initialize default values here if needed
	}

	// Parameterized constructor
	public AccDetails(String name, int id, String ifsc, String branch, Address ad) {
		this.name = name;
		this.id = id;
		this.ifsc = ifsc;
		this.branch = branch;
		this.ad = ad;
	}

	// Getter and Setter methods for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter methods for id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Getter and Setter methods for ifsc
	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	// Getter and Setter methods for branch
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "AccDetails [name=" + name + ", id=" + id + ", ifsc=" + ifsc + ", branch=" + branch + ", ad=" + ad + "]";
	}

}
