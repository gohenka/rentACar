package com.btkAkademi.rentACar.business.requests.RentalRequest;

import java.time.LocalDate;

import com.btkAkademi.rentACar.entities.concretes.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalRequest {

	private Customer customer;

	private LocalDate rentDate;
	

	private LocalDate returnDate;
	

	private int rentedKilometer;
	

	private int returnKilometer;
	
	
	
}
