package com.bank.model;

import javax.persistence.*;
import com.bank.model.*;
@Entity
@Table (name = "Customer_Address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Serial_No")
	private int num ;
	@Column (name = "House_No")
    private String houseNumber;
	@Column (name = "Landmark")
    private String landmark;
	@Column (name = "City")
    private String city;
	@Column (name = "PinCode")
    private double pin;
	@Column (name = "State")
    private String state;
	@OneToOne
	//@PrimaryKeyJoinColumn
	@JoinColumn(name="Cust_Id")
	private AccDetails ac;
	

    // Default constructor
    public Address() {
        // You can initialize default values here if needed
    }

    // Parameterized constructor
    public Address(int num, String houseNumber, String landmark, String city, double pin, String state, AccDetails ac ) {
        this.num = num;
        this.houseNumber = houseNumber;
        this.landmark = landmark;
        this.city = city;
        this.pin = pin;
        this.state = state;
        this.ac = ac;
    }

    // Getter and Setter methods for houseNumber
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    // Getter and Setter methods for landmark
    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    // Getter and Setter methods for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter methods for pin
    public double getPin() {
        return pin;
    }

    public void setPin(double pin) {
        this.pin = pin;
    }

    // Getter and Setter methods for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    

    public AccDetails getAc() {
		return ac;
	}

	public void setAc(AccDetails ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", landmark=" + landmark + ", city=" + city + ", pin=" + pin
				+ ", state=" + state + ", ac=" + ac + "]";
	}

	// toString method to represent the object as a String
    
    }


