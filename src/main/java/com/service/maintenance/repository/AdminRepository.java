package com.service.maintenance.repository;

import com.service.maintenance.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByEmailAndMdp(String admin,String mdp);
}