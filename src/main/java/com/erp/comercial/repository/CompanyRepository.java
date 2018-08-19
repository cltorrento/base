package com.erp.comercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.comercial.model.Company;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
