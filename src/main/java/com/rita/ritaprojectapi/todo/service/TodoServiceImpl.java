package com.rita.ritaprojectapi.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rita.ritaprojectapi.todo.entity.Todo;
import com.rita.ritaprojectapi.todo.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

	private final TodoRepository todoRepository;

	@Override
	public List<Todo> getList() {
		return todoRepository.findAll();
	}
	
}
