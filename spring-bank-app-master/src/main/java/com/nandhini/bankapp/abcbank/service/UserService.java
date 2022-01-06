package com.nandhini.bankapp.abcbank.service;

import com.nandhini.bankapp.abcbank.domain.entity.CustomerAccount;
import com.nandhini.bankapp.abcbank.domain.entity.Deposits;
import com.nandhini.bankapp.abcbank.domain.entity.User;
import com.nandhini.bankapp.abcbank.domain.entity.Withdrawals;
import com.nandhini.bankapp.abcbank.resources.UserCreateForm;


import java.util.List;
import java.util.Optional;


public interface UserService {

    Optional<User> findUserByUsername(String username);
    Optional<User> findUserByEmail(String email);
    List<CustomerAccount> findCustomerAccountById(long id);
    List<Withdrawals> findTransactionsByCustomerAccountId(long id);
    User registerUser(UserCreateForm userCreateForm);
    boolean hasValidPassword(User user, String pwd);
    List<Deposits> findTransactionsByAccountId(long id);
}
