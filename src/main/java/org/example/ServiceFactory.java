package org.example;

public class ServiceFactory {

    public static IService service(String service) {
        Class aClass = null;
        Object object = null;
        try{
            aClass = Class.forName("org.example.Service"+service);
            object = aClass.newInstance();
        }catch (Exception e) {
            throw new IllegalArgumentException("non-existent service");
        }
        if (!(object instanceof IService)) {
            throw new IllegalArgumentException("Invalid Service");
        }
        return (IService) object;
    }

}
