package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtisService {

	@Autowired
	ArtistRepository repo;
	
	public Artist insert(Artist a) {
		return repo.save(a);
	}
	
	public List<Artist> insertall(List<Artist> a){
		return (List<Artist>) repo.saveAll(a);
	}
	
	
	public List<Artist> getAll(){
		return (List<Artist>) repo.findAll();
	}
	
	
	public String deleteById(int id) {
		repo.deleteById(id);
		return "Deleted item = " + id;
	}

	

	public List<Artist> getAllName() {
		
		return (List<Artist>) repo.findAll();
	}


	
	
// Working	
	public List<Artist> findByEmail(String email){
		return repo.findByEmail(email);
	}
	
	public List<Artist> findByEmailAndName(String artistName, String email){
		return repo.findByEmailAndName(artistName,email);
	}
	
	
//	Working
	public List<Artist> findByName(String artistName) {
		return repo.findByName(artistName);
	}

	public List<Artist> findByid(int findByid) {
		
		return repo.findByid(findByid);
	}

	public Artist findByEmailNative(String emailnative) {
		
		return (Artist) repo.findByNameNative(emailnative);
	}

}
