package com.project.app.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class BookingDateToStringDTO {
	
	private Date bookingDate= new Date(System.currentTimeMillis()); 	
	SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
	String stringDate= DateFor.format(bookingDate);
	

	//Date someDate = createBooking(booking.getService().getDuration());
	//booking.setBookingDate(someDate);
	//booking = bookingRepository.saveAndFlush(booking);
	//entityManager.clear();
	//booking = bookingRepository.findById(booking.getId()).get();
	//return booking;

}
