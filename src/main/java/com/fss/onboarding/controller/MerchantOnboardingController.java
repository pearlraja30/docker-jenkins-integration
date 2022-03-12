package com.fss.onboarding.controller;

import com.fss.onboarding.exception.ServerException;
import com.fss.onboarding.model.Customer;
import com.fss.onboarding.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/individuals")
public class MerchantOnboardingController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/signup")
    public ResponseEntity<Customer> createMerchant(@RequestBody final Customer customer){

        Customer newCustomer = customerService.save(customer);
        if (newCustomer == null) {
            throw new ServerException();
        }
        else {
            return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
        }
    }
}
