package com.rita.ritaprojectapi.todo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rita.ritaprojectapi.common.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todo")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Todo extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoSeq;
    private int todoLevel;
    private String todoText;

		public void setTodoLevel(int todoLevel){
			this.todoLevel = todoLevel;
	}

    public void setTodoText(String todoText){
        this.todoText = todoText;
    }

}