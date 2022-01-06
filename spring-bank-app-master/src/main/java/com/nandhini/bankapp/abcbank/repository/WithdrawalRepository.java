package com.nandhini.bankapp.abcbank.repository;

import com.nandhini.bankapp.abcbank.domain.entity.Withdrawals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WithdrawalRepository extends JpaRepository<Withdrawals, Long> {

    List<Withdrawals> findTransactionsByCustomerAccountId(long id);
}
