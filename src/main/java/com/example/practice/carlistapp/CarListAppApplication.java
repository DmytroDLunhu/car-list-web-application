package com.example.practice.carlistapp;

import entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repo.CarRepository;

@SpringBootApplication
public class CarListAppApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(CarListAppApplication.class, args);
    }

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        Car car1 = new Car("Honda", "Civic", "red");
        carRepository.save(car1);
        Car car2 = new Car("Toyota", "Rav4", "black");
        carRepository.save(car1);
        Car car3 = new Car("Fiat", "500", "pink");
        carRepository.save(car3);

    }
}
