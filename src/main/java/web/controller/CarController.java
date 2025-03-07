package web.controller;


import com.sun.jdi.Value;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController() {
        this.carService = new CarServiceImpl();
    }

    @GetMapping(value = "/car")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("tesla");
        messages.add("very");
        messages.add("well ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping("/cars")
    public String countCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.countCars(count);
        System.out.println(cars.size());
        model.addAttribute("cars", cars);
        for (Car car : carService.countCars(count)) {
            System.out.println(car.toString(car));
        }
        return "cars";
    }

}
