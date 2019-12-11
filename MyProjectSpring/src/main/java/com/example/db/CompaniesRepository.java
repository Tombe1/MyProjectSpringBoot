package com.example.db;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.beans.Companies;

public interface CompaniesRepository extends JpaRepository<Companies, Integer> {

	Companies getCompaniesByEmailAndPassword(String email, String password);

}
