package com.btkAkademi.rentACar.business.abstracts;

import com.btkAkademi.rentACar.core.utilities.results.Result;

public interface CustomerService {

   Result getByCustomerId(int id);
   
   
}
