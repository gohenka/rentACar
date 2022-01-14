package com.btkAkademi.rentACar.business.abstracts;

import java.util.List;

import com.btkAkademi.rentACar.business.dtos.AdditionalServiceListDto;
import com.btkAkademi.rentACar.business.requests.additionalService.CreateAdditionalServiceRequest;

import com.btkAkademi.rentACar.core.utilities.results.DataResult;
import com.btkAkademi.rentACar.core.utilities.results.Result;
import com.btkAkademi.rentACar.entities.concretes.AdditionalService;

public interface AdditionalServiceService {


    DataResult<List<AdditionalServiceListDto>> getAll();
	Result add(CreateAdditionalServiceRequest createAdditionalServiceRequest);
	
	DataResult<AdditionalService> getByRentalId(int rentalId);
	DataResult<List<AdditionalService>> getAllRentalId(int rentalId);


}
