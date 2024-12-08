package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Cloudvendor;

public interface CloudVendorService {
	public String createCloudVendor(Cloudvendor cv);
	public String updateCloudVendor(String vendorId, Cloudvendor cv);
	public String deleteCloudVendor(String vendorId);
	public Cloudvendor getCloudVendor(String vendorId);
	public List<Cloudvendor> getAllVendor();
	
	
}
