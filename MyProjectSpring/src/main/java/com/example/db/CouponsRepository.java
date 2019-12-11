package com.example.db;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Coupons;

public interface CouponsRepository extends JpaRepository<Coupons, Integer> {

}
