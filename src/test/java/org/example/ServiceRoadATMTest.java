package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceRoadATMTest {
    IService service = ServiceFactory.service("RoadATM");

    @Test
    public void shouldReturnExceptionInvalidValueWithdrawal(){
        try{
            service.withdrawal(1000.1);
        }catch (IllegalArgumentException e){
            assertEquals("High value for road withdraw, cannot withdraw for security reasons",e.getMessage());
        }
    }
    @Test
    public void shouldReturnSuccessWithdrawal(){
        assertEquals("Successfully withdrawal", service.withdrawal(999.9));
    }
    @Test
    public void shouldReturnExceptionInvalidValueDeposit(){
        try{
            service.deposit(1000.1);
        }catch (IllegalArgumentException e){
            assertEquals("Cannot deposit high values in road ATM", e.getMessage());
        }
    }
    @Test
    public void shouldReturnSuccessDeposit(){
        assertEquals("Successfully deposited", service.deposit(999.9));
    }
}