package web.service;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class CarServiceImpl implements CarService {
    @Autowired
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    @Transactional
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    @Transactional
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}
