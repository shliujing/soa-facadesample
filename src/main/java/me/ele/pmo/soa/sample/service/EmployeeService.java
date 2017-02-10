package me.ele.pmo.soa.sample.service;

import me.ele.pmo.soa.sample.model.Employee;

import java.util.List;

/**
 * Created by kimi on 06/02/2017.
 */
public interface EmployeeService {
    int save(Employee employee);

    Employee get(int id);

    List<Employee> all();
}
