package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class Cloudvendor {
	@Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhone;

    // Default constructor (needed for frameworks like Spring, JPA, etc.)
    public Cloudvendor() {
    }

    // Parameterized constructor
    public Cloudvendor(String vendorId, String vendorName, String vendorAddress, String vendorPhone) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhone = vendorPhone;
    }

    // Getters and Setters
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {  // Fixed typo in method name
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    // Override toString() method for better readability
    @Override
    public String toString() {
        return "Cloudvendor{" +
               "vendorId='" + vendorId + '\'' +
               ", vendorName='" + vendorName + '\'' +
               ", vendorAddress='" + vendorAddress + '\'' +
               ", vendorPhone='" + vendorPhone + '\'' +
               '}';
    }
}
