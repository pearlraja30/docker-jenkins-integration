package com.fss.onboarding.dao;

import com.fss.onboarding.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantOnboardingRepository extends JpaRepository<Customer, Long> {
}
