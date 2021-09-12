package org.springframework.beans;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.entity.Car;

public class CarFactoryBean implements FactoryBean<Car> {
     private String carInfo; 
     public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.parseInt(infos[1]));
        car.setPrice(Double.parseDouble(infos[2])); return car;
    }
    public Class<Car> getObjectType() { 
      return Car.class;
    }
    public boolean isSingleton() {
      return true;
   } 
}