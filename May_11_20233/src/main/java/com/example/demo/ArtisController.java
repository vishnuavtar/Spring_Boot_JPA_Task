package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ArtisController {
	
	@Autowired
	ArtisService service;
	
	@PostMapping("/insert")
	public Artist insert(@RequestBody Artist a) {
		return service.insert(a);
	}
	
	// Working , you can insert more than one record at a time
	@PostMapping("/insertall")
	public List<Artist> insertall(@RequestBody List<Artist> a){
		return service.insertall(a);
	}
	
	
	// working , Get all data from database
	@GetMapping("/get")
	public List<Artist> getAll(){
		return service.getAll();
	}

	
	// Working , you can delete the record by using id
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		return service.deleteById(id);
	}
	



	
// Working	You can find the record by email
	@GetMapping("/{email}")
	public List<Artist> findByEmail(@PathVariable("email") String email){
		return service.findByEmail(email);
	}
	

	
	
// working you can find the record  by using name with email
	@GetMapping("/{artistName}/{email}")
	public List<Artist> findByEmailAndName(@PathVariable("artistName") String artistName, @PathVariable("email") String email){
		return service.findByEmailAndName(artistName,email);
	}
	
	
	// working All data retrieve
	
	@GetMapping("/get/getAllName")
	public List<Artist> getAllName(){
		return service.getAllName();
	}

	
	
//	Working , Retrieve record by name
//	@GetMapping("/{artistName}")
//	public List<Artist> findByName(@PathVariable("artistName")  String artistName){
//		return service.findByName(artistName);
//	}
	
	
	// Working
//	@GetMapping("/{findByid}")
//	public List<Artist> findById(@PathVariable("findByid") int findByid) {
//		return service.findByid(findByid);
//	}
	

//	@GetMapping("/{emailnative}")
//	public Artist findByEmailNative(@PathVariable("emailnative") String emailnative) {
//		return service.findByEmailNative(emailnative);
//	}

	
}
