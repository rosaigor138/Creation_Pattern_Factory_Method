package org.example;

public class ServiceRoadATM implements IService {
    @Override
    public String withdrawal(double value) {
        if (value > 1000.0){
            throw new IllegalArgumentException("High value for road withdraw, cannot withdraw for security reasons");
        }
        return "Successfully withdrawal";
    }

    @Override
    public String deposit(double value) {
        if(value > 1000.0){
            throw new IllegalArgumentException("Cannot deposit high values in road ATM");
        }
        return "Successfully deposited";
    }
}
