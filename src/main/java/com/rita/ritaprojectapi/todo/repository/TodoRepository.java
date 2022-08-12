package com.rita.ritaprojectapi.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rita.ritaprojectapi.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo,Long>{
	
}
