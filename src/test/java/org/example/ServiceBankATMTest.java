package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceBankATMTest {
    IService service = ServiceFactory.service("BankATM");

    @Test
    public void shouldReturnSuccessWithdrawal(){
        assertEquals("Successfully Bank withdrawal",service.withdrawal(10.0));
    }

    @Test
    public void shouldReturnSuccessDeposit(){
        assertEquals("Successfully Bank deposited",service.deposit(1));
    }
}