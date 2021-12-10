package com.uequations.list;

import com.uequations.model.Employee;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListDemoTest {

    @Test
    public void testDemoAddToList() {

        List<Employee> employeeList = new ListDemo().demoAddToList();

        assertEquals("Happy",employeeList.get(0).getFirstName());
        assertEquals("Happy",employeeList.get(0).getFirstName());
        assertEquals("Beyonce",employeeList.get(1).getFirstName());
    }

    @Test
    public void testDemoRemoveFromList() {

        List<Employee> employeeList = new ListDemo().demoRemoveFromList();

        assertEquals("Mensah",employeeList.get(0).getFirstName());
        assertEquals(1,employeeList.size());
    }
}