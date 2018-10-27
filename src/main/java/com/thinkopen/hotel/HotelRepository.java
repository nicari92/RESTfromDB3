package com.thinkopen.hotel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	List<Hotel> findByName(String name);

	
	@Query("SELECT DISTINCT h "
			+ "FROM Hotel h "
			+ "LEFT OUTER JOIN City c ON c.id = h.city "
			+ "WHERE c.name = :cityName")
	List<Hotel> findByCityName(@Param("cityName") String cityName);
}
