//package com.example.demo.OneToOne;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ArtistController {
//
//	@Autowired
//	 private ArtistService service;
//	
//	@PostMapping("/insert")
//	public Artist insert(@RequestBody Artist a) {
//		return service.insert(a);
//	}
//	
//	@GetMapping("/getall")
//	public List<Artist> getall(){
//		return service.getall();
//	}
//	
//}
