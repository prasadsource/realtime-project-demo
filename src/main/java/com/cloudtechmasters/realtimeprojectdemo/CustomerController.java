package com.cloudtechmasters.realtimeprojectdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class CustomerController {
    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){
        Customer customer1=new Customer(100,"vamsikrm");
        Customer customer2=new Customer(200,"harsha");
        System.out.println("getAllCustomers called from sysout");
        return Arrays.asList(customer1,customer2);
    }
}
