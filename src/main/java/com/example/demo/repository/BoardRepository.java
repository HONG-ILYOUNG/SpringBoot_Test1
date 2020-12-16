package com.example.demo.repository;
// Repository = DAO

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Board;

// @Repository
// JpaRepository<Entity Name, Primary Key Data Type>
public interface BoardRepository extends JpaRepository<Board, Long> {

}