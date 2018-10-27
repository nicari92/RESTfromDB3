package com.thinkopen.hotel;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City, Long>{
	
	@Query("SELECT c.name FROM City c WHERE c.name LIKE %:name%")
	List<String> findByName(@Param("name") String name, Pageable pageable);
}
