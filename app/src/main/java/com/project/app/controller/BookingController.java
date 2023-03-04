package com.project.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.model.Booking;
import com.project.app.DTO.BookingStatusRequestDTO;
import com.project.app.service.BookingService;
import com.project.app.service.ServiceManager;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping(path = "booking")
@RestController
public class BookingController
{	
	private BookingService bookingService;
	private ServiceManager serviceManager;
	@Autowired
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking) {
		return new ResponseEntity<Booking>(bookingService.saveBooking(booking), HttpStatus.CREATED);
	}
	
	//@PostMapping("/add")
	//public Booking saveBooking(@RequestBody Booking booking)
	//{
	//	booking.setService(serviceManager.findById(booking.getService().getId()));
	//	return bookingService.saveBooking(booking);
	//}
	
	
	
		
	@GetMapping("/getAllBookings")
	public List<Booking> getAllBookings(Booking booking){
		return bookingService.getAllBookings(); 
	}
	 @DeleteMapping("/deleteBooking/{id}")
	 public ResponseEntity<String> deleteBooking(@PathVariable("id") long id){
		 bookingService.deleteBooking(id);
		 return new ResponseEntity<String>("Booking is deleted successfully!", HttpStatus.OK);
	}
	
	@PutMapping("/updateBookingNote/{id}")
	public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking, @PathVariable("id") long id){
		 return new ResponseEntity<Booking>(bookingService.updateBooking(booking, id), HttpStatus.OK);
	}
	@GetMapping("/getAllByDateAsc")
	public List<Booking> getAllByDateAsc(){
		return bookingService.SortBookingByDateAsc();
	}

	@GetMapping("/getAllByDateDesc")
	public List<Booking> getAllByDateDesc(){
		return bookingService.SortBookingByDateDesc();
	}
	
	@GetMapping("/findName")
	public ResponseEntity<List<Booking>> FindBookingByName(String username){
		return ResponseEntity.ok(bookingService.FindBookingByUsername(username));
	}

	@PutMapping("/bookingStatus/{id}")
	public void update(@PathVariable(name = "id") Long id, @RequestBody BookingStatusRequestDTO requestBody )
	{
		bookingService.updateIsDone(id,requestBody.isDone());
	}
	 
}
