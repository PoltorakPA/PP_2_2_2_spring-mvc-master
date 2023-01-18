package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private SessionFactory sessionFactory;
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Black", "BMW", 2022));
        cars.add(new Car("White", "Нива", 1988));
        cars.add(new Car("Grey", "Skoda", 2015));
        cars.add(new Car("Blue", "Audi", 2021));
        cars.add(new Car("Black", "Jeep", 2018));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarList(int count) {
        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}
