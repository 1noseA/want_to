package com.example.want.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.want.entity.Want;

@Repository
public interface WantRepository extends JpaRepository<Want, Long> {


}
