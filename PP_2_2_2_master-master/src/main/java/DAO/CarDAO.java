package DAO;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarDAO {


  private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(1,"Vasya", "Volga"));
        carList.add(new Car(2,"KVasya", "Volvo"));
        carList.add(new Car(3,"Petya", "Moskvich"));
        carList.add(new Car(4,"Slava", "Zapor"));
        carList.add(new Car(5,"Plota", "Zhiga"));

    }
    public List<Car> getCarList(int count){

        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
