package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cloudvendor;
import com.example.demo.service.CloudVendorService;
import com.example.demo.service.CloudVendorServiceImpl;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	CloudVendorService service;

  

	public CloudVendorController(CloudVendorService service) {
		this.service = service;
	}

	@GetMapping("/{vendorId}")
    public Cloudvendor getVendorDetails(@PathVariable String vendorId) {
        return service.getCloudVendor(vendorId);
    }
    
    @GetMapping("/all")
    public List<Cloudvendor> getVendorDetails() {
        return service.getAllVendor();
    }
    
    @PostMapping()
    public String createCloudVendor(@RequestBody Cloudvendor cv1) {
    	return service.createCloudVendor(cv1);
    }
    
    @PutMapping("/{vendorId}")
    public String updateCloudVendor(@PathVariable String vendorId, @RequestBody Cloudvendor cv1) {
    	return service.updateCloudVendor(vendorId, cv1);
    }
    
    
    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendor(@PathVariable String vendorId) {
    	return service.deleteCloudVendor(vendorId);
    }
    
    
}
