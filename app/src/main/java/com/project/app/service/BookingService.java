package com.project.app.service;



import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

import com.project.app.model.Booking;


@Service
public interface BookingService
{
	List<Booking> getAllBookings();
	void deleteBooking(long id);
	Booking updateBooking(Booking booking, long id);
	List<Booking> SortBookingByDateAsc();
	List<Booking> SortBookingByDateDesc();
	List<Booking> FindBookingByName(String name);
	void updateIsDone(Long id, boolean isDone);
	Booking saveBooking(Booking booking);
	//Booking createBooking(Booking booking);
	
}