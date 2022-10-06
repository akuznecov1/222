package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarController {

    @Autowired
    CarService carService;
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "id", defaultValue = "5") int id, Model model) {
        model.addAttribute("cars", carService.listCar(id));
        return "cars";
    }

}
