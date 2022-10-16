package com.example.employeespringbootbackend;

import com.example.employeespringbootbackend.entity.Employee;
import com.example.employeespringbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeSpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeSpringbootBackendApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = Employee.builder()
                .firstName("Abdullah")
                .lastName("Bakış")
                .email("abdullah@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("Murat")
                .lastName("Jacobs")
                .email("murat@gmail.com")
                .build();

        Employee employee3 = Employee.builder()
                .firstName("Hacı")
                .lastName("Lothbrok")
                .email("ragnar@gmail.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }

}
