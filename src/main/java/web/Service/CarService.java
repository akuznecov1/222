package web.Service;

import web.model.Car;

import java.util.List;

import org.springframework.stereotype.Service;

public interface CarService {

    List<Car> listCar(int count);
}
