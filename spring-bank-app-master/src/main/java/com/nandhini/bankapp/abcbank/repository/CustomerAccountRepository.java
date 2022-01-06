package com.nandhini.bankapp.abcbank.repository;

import com.nandhini.bankapp.abcbank.domain.entity.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Long> {

    List<CustomerAccount> findCustomerAccountsByUserId(long id);

    CustomerAccount findCustomerAccountById(long id);

}
