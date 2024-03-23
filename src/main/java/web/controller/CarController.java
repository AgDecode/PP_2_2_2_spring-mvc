package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller()
public class CarController {
    @GetMapping("/cars")
    public String printCars(@RequestParam(required = false, defaultValue = "5") Integer count, ModelMap model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1234, 1));
        cars.add(new Car("Tesla", 4321, 2));
        cars.add(new Car("Lada", 5678, 3));
        cars.add(new Car("Ford", 8765, 4));
        cars.add(new Car("Porsche", 1010, 5));
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getCars(cars, count));
        return "cars";
    }
}
