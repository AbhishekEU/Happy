package com.shakthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakthi.entity.RegisterEntity;

public interface RegisterRepo extends JpaRepository<RegisterEntity, Integer> {

}
