package com.fss.onboarding.service;

import com.fss.onboarding.dao.MerchantOnboardingRepository;
import com.fss.onboarding.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    MerchantOnboardingRepository merchantOnboardingRepository;

    public Customer save(Customer customer){
        return merchantOnboardingRepository.save(customer);
    }
}
