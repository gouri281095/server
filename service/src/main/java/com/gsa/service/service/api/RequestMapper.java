package com.gsa.service.service.api;

import com.gsa.service.service.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RequestMapper {
    @GetMapping("/getEmployee")
    public List<Employee> getEmployees()
    {
        Employee e1 = new Employee();
        e1.setDesignation("Software Engineer");
        e1.setEmployeeID("1234ABCD");
        e1.setEmployeeName("Raghav Sharma");
        e1.setSalary(30000f);
        e1.setReporttingManager("John Wick");

        Employee e2 = new Employee();
        e2.setDesignation("Software Engineer");
        e2.setEmployeeID("1235ABCD");
        e2.setEmployeeName("Sumit Sharma");
        e2.setSalary(40000f);
        e2.setReporttingManager("John Wick");

        Employee e3 = new Employee();
        e3.setDesignation("Associate Software Engineer");
        e3.setEmployeeID("1236ABCD");
        e3.setEmployeeName("Manish Pandey");
        e3.setSalary(20000f);
        e3.setReporttingManager("John Wick");

        Employee e4 = new Employee();
        e4.setDesignation("Senior Software Engineer");
        e4.setEmployeeID("1237ABCD");
        e4.setEmployeeName("Sumit Pradhan");
        e4.setSalary(80000f);
        e4.setReporttingManager("John Wick");

        List<Employee> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        return list;
    }

    @GetMapping("/getEmployeeMap")
    public Map<String,Employee> getEmployeesLikeMap() {
        Employee e1 = new Employee();
        e1.setDesignation("Software Engineer");
        e1.setEmployeeID("1234ABCD");
        e1.setEmployeeName("Raghav Sharma");
        e1.setSalary(30000f);
        e1.setReporttingManager("John Wick");

        Employee e2 = new Employee();
        e2.setDesignation("Software Engineer");
        e2.setEmployeeID("1235ABCD");
        e2.setEmployeeName("Sumit Sharma");
        e2.setSalary(40000f);
        e2.setReporttingManager("John Wick");

        Employee e3 = new Employee();
        e3.setDesignation("Associate Software Engineer");
        e3.setEmployeeID("1236ABCD");
        e3.setEmployeeName("Manish Pandey");
        e3.setSalary(20000f);
        e3.setReporttingManager("John Wick");

        Employee e4 = new Employee();
        e4.setDesignation("Senior Software Engineer");
        e4.setEmployeeID("1237ABCD");
        e4.setEmployeeName("Sumit Pradhan");
        e4.setSalary(80000f);
        e4.setReporttingManager("John Wick");

        Map<String,Employee> map = new HashMap<>();
        map.put("E1",e1);
        map.put("E2",e2);
        map.put("E3",e3);
        map.put("E4",e4);

        return map;
    }

    @PostMapping("/getEmpPost")
    public List<Employee> getEmpAsPost(@RequestBody List<Employee> list)
    {
        for(Employee e : list)
        {
            e.setSalary(1.2f*e.getSalary());
        }

        return list;
    }

    @PostMapping("/getEmpMapPost")
    public Map<String,Employee> getEmpAsPost(@RequestBody Map<String,Employee> map)
    {

        for(Map.Entry<String,Employee> holder:map.entrySet())
        {
            holder.getValue().setSalary(1.5f*holder.getValue().getSalary());
        }

        return map;
    }

}
