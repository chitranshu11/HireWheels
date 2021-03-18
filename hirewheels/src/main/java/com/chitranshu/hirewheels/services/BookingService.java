package com.chitranshu.hirewheels.services;

import com.chitranshu.hirewheels.entities.Booking;
import com.chitranshu.hirewheels.exceptions.BookingException;

public interface BookingService {
	Booking addBooking (Booking booking) throws BookingException;
}
