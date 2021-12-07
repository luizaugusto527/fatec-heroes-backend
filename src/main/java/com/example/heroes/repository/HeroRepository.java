package com.example.heroes.repository;

import com.example.heroes.entity.Hero;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero,Integer> {
    
}
