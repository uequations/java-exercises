package com.uequations.list;

import com.uequations.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public List<Employee> demoAddToList() {

        Employee e1 = new Employee("Happy", "Golukcy",1);
        Employee e2 = new Employee("Mensah", "Alkebu-Lan",2);
        Employee e3 = new Employee("Beyonce", "Knowles-Carter",3);

        List<Employee> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(1,e3);

        return list;
    }

    public List<Employee> demoRemoveFromList() {

        List<Employee> list = demoAddToList();

        int i = 0;
        Employee j = new Employee("Beyonce", "Knowles-Carter",3);

        list.remove(i);
        list.remove(j);

        return list;
    }
}
