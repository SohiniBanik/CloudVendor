package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Cloudvendor;
import com.example.demo.repository.CloudVendorRepository;


@Service
public class CloudVendorServiceImpl implements CloudVendorService{

	public CloudVendorServiceImpl(CloudVendorRepository repo) {
		this.repo = repo;
	}

	CloudVendorRepository repo;

	@Override
	public String createCloudVendor(Cloudvendor cv) {
		// TODO Auto-generated method stub
		repo.save(cv);
		return "Success";
	}

	@Override
	public String updateCloudVendor(String vendorId, Cloudvendor cv) {
		// TODO Auto-generated method stub
		Cloudvendor existingVendor = repo.findById(vendorId)
				.orElseThrow(() -> new RuntimeException("Vendor not found with ID: " + vendorId));
            existingVendor.setVendorName(cv.getVendorName());
            existingVendor.setVendorAddress(cv.getVendorAddress());
            existingVendor.setVendorPhone(cv.getVendorPhone());
            repo.save(existingVendor); // Save the updated vendor back to the database
		return "Vendor updated successfully!";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		// TODO Auto-generated method stub
		repo.deleteById(vendorId);
		return "Deleted Successfully";
	}

	@Override
	public Cloudvendor getCloudVendor(String vendorId) {
		// TODO Auto-generated method stub
		return repo.findById(vendorId).get();
	}

	@Override
	public List<Cloudvendor> getAllVendor() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

}
