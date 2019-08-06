package com.offcn.demo1.controller;

import com.offcn.demo1.pojo.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/findOne")
    public Car findOneCar(){
        Car car = new Car(1, "Auto", 18888.1F);
        return car;
    }
}
