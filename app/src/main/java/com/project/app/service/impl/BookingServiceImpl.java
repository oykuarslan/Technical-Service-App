package com.project.app.service.impl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.model.Booking;
import com.project.app.repository.BookingRepository;
import com.project.app.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	
	
	private EntityManager entityManager;
	private BookingRepository bookingRepository;
	
	@Autowired
	public BookingServiceImpl(BookingRepository bookingRepository) {
		super();
		this.bookingRepository = bookingRepository;
	}

	@Override
	public Booking saveBooking(Booking booking) {
			
			//date time içinden time kısmının silinmesi
			//bir gün içindeki toplam süre kontrolü
			//10 saatten fazlaysa +1 gün do-s
//
//			Date someDate = createBooking(booking.getService().getDuration());
//			booking.setBookingDate(someDate);
//			booking = bookingRepository.findById(booking.getId()).get();	
	
	        return bookingRepository.save(booking);
	}
	
	

//	private Date createBooking(int bookingDuration) {
//		
//			Date bookingDate = new Date(System.currentTimeMillis());
//			int dailyWork = 0;
//			do
//			{
//				dailyWork = bookingDuration;
//				LocalDateTime.from(bookingDate.toInstant()).plusDays(1);
//				List<Booking> bookings = bookingRepository.searchByBookingDate(bookingDate);
//				for (Booking booking : bookings)
//				{
//					dailyWork += booking.getService().getDuration();
//				}
//			}
//			while (dailyWork > 10);
//			return bookingDate;
//	}
	
	

	
	
	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}
	
    @Override
    public void deleteBooking(long id) {
        bookingRepository.findById(id).orElseThrow();
        bookingRepository.deleteById(id);
    }
    
    @Override
    public Booking updateBooking(Booking booking, long id) {
    	Booking existingBooking = bookingRepository.findById(id).orElseThrow();
    	existingBooking.setNote(booking.getNote());
        bookingRepository.save(existingBooking);
        return existingBooking;
    }
    
    @Override
    public List<Booking> SortBookingByDateAsc() {
        return bookingRepository.OrderByBookingDateAsc();
    }
    
    @Override
    public List<Booking> SortBookingByDateDesc() {
        return bookingRepository.OrderByBookingDateDesc();
    }
    
    @Override
    public List<Booking> FindBookingByUsername(String username) {
        return bookingRepository.FindBookingByUsername(username);
    }
    
    @Override
	public void updateIsDone(Long id, boolean isDone)
	{
    	
		Booking booking = bookingRepository.findById(id).get();
		booking.setDone(true);
		bookingRepository.save(booking);
	}

//	public Booking createBooking(Booking booking)
//	{
//		LocalDate someDate = createBookingDate(booking.getService().getDuration());
//		booking.setBookingDate(someDate);
//		booking = bookingRepository.saveAndFlush(booking);
//		entityManager.clear();
//		booking = bookingRepository.findById(booking.getId()).get();
//		return booking;
//	}
//       

    
}
