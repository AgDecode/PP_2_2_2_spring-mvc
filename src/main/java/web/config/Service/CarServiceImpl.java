package web.config.Service;

import web.model.Car;

import java.util.List;

public interface CarServiceImpl {
     List<Car> getCars (List<Car> cars, int count);
}
