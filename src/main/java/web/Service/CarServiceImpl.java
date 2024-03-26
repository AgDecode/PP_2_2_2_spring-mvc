package web.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        if(count >= 6){
            return cars;
        }

        List<Car> res = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            res.add(cars.get(i));
        }
        return res;
    }


    public List<Car> addCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1234, 1));
        cars.add(new Car("Tesla", 4321, 2));
        cars.add(new Car("Lada", 5678, 3));
        cars.add(new Car("Ford", 8765, 4));
        cars.add(new Car("Porsche", 1010, 5));
        return cars;
    }
}
