package service.impl;

import entity.Car;
import org.springframework.stereotype.Service;
import repo.CarRepository;
import service.CarService;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
