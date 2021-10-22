package com.example.bankapplication;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    private BankBalanceRep bankBalanceRep = new BankBalanceRep();
    private BankService bankService = new BankService(bankBalanceRep);

    @Test
    void getBalance() {
        final BigDecimal balance = bankService.getBalance(1L);
        assertEquals(balance, BigDecimal.ZERO);
    }

    @Test
    void addMoney() {
        final BigDecimal balance = bankService.addMoney(1L, BigDecimal.TEN);
        assertEquals(balance, BigDecimal.valueOf(10));
    }
}