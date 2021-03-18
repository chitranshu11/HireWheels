package com.chitranshu.hirewheels.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chitranshu.hirewheels.dao.BookingDAO;
import com.chitranshu.hirewheels.dao.UserDAO;
import com.chitranshu.hirewheels.entities.Booking;
import com.chitranshu.hirewheels.exceptions.BookingException;
import com.chitranshu.hirewheels.services.BookingService;

public class BookingServiceImpl implements BookingService{
	
	@Autowired
	BookingDAO bookingDAO;
	
	@Autowired
	UserDAO userDAO;
	
	@Override
	public Booking addBooking(Booking booking) throws BookingException {
		
		double balance = booking.getUser().getWalletMoney();
		if(booking.getAmount() > balance) 
			throw new BookingException("Insufficient Balance. Please Check With Admin");
		
		return bookingDAO.save(booking);
	}

}
