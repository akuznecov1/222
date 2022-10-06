package web.Service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> listCar(int id) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "coupe", "gas"));
        cars.add(new Car("Mazda", "sedan", "petrol"));
        cars.add(new Car("Suzuki", "crossover", "gas"));
        cars.add(new Car("BMW", "cabriolet", "petrol"));
        cars.add(new Car("KAMAZ", "truck", "diesel"));



        if ((id >= 5) || (id <= 0)) {
            return cars;
        }else {
            return cars.stream().limit(id).collect(Collectors.toList());
        }

    }
}



