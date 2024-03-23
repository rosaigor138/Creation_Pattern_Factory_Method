package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {
    @Test
    public void shouldReturnExceptionNonExistentService(){
        try{
            IService service = ServiceFactory.service("SkyATM");
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("non-existent service",e.getMessage());
        }
    }

    @Test
    public void shouldReturnExceptionInvalidService(){
        try{
            IService service = ServiceFactory.service("PrivateATM");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Invalid Service", e.getMessage());
        }
    }

    @Test
    public void shouldReturnValidService(){
        IService service = ServiceFactory.service("BankATM");
        assertNotNull(service);
    }
}