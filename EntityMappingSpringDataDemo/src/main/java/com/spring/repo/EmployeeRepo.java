package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.one_to_one.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>{

}
