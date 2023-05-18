package com.example.demo;

import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Configuration
public interface ArtistRepository  extends CrudRepository<Artist, Integer>   {

	//Optional<Artist> findByName(String artistName);

//	@Query("select u from Artist u")
//	public List<Artist> getAllName();

	@Query("select a from Artist a where a.artistName=:n")
	public List<Artist> findByName(@Param("n") String artistName);

	@Query("select e from Artist e where e.email=:n")
	public List<Artist> findByEmail(@Param("n") String email);
	
	
	@Query("select em from Artist em where em.artistName=:n and em.email=:e")
	public List<Artist> findByEmailAndName( @Param("n") String artistName , @Param("e") String email);

	@Query("select f from Artist f where f.id=:n")
	public List<Artist> findByid(@Param("n") int f);
	
	
	@Query( value = "select * from Artist u where u.email=1" , nativeQuery =true)
	public List<Artist> findByNameNative(@Param("1") String email);
}
