package com.epam.springBootSproject.services;

import com.epam.springBootSproject.beans.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperSeviceImpl implements SuperService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Car> getCars() {
        RowMapper<Car> carRowMapper = (rs, rowNumber) -> new Car(rs.getDate("date_Of_Manufacture"),
                rs.getString("car_Make"),
                rs.getString("licence"),
                rs.getBoolean("cruise_Control"));
        return jdbcTemplate.query("SELECT * FROM study.cars", carRowMapper);
    }
}





