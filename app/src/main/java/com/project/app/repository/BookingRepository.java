package com.project.app.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.app.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long>
{
	List<Booking> OrderByBookingDateAsc();
	List<Booking> OrderByBookingDateDesc();
	
	@Query(name = "FindBookingByName", value = "SELECT p FROM Booking p WHERE p.systemUser.name LIKE CONCAT ('%',:name,'%')")
	public List<Booking> FindBookingByName(String name);
	List<Booking> searchByBookingDate(Date bookingDate);
	
	
	
}