package com.example.Ejerciciosesiones456.repository;

import com.example.Ejerciciosesiones456.entities.Laptops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptops, Long> {
}
