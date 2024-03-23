package org.example;

public class ServiceBankATM implements IService {

    @Override
    public String withdrawal(double value) {
        return "Successfully Bank withdrawal";
    }

    @Override
    public String deposit(double value) {
        return "Successfully Bank deposited";
    }
}
