package web.config.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService implements CarServiceImpl {
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
}
