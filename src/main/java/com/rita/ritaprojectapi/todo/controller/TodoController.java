package com.rita.ritaprojectapi.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rita.ritaprojectapi.todo.entity.Todo;
import com.rita.ritaprojectapi.todo.service.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

	private final TodoService todoService;

	@GetMapping("")
	public List<Todo> getTodoList() {
		return todoService.getList();
	}
	
}
