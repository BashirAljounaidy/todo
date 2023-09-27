package com.aljo.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();

	private static int todoCount = 0;
	
	static {
		todos.add(new Todo(++todoCount,"aljo","Learn AWS", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todoCount,"aljo","Learn DEVOPS", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(++todoCount,"aljo","Learn FULLSTACK", LocalDate.now().plusYears(3),false));
    }
    public List<Todo> findByUsername(String username){
		return todos;
	}
	public void addTodo(String name, String description , LocalDate targetDate,boolean done) {
		Todo todo = new Todo(++todoCount,name,description,targetDate,done);
		todos.add(todo);
	}
	//My Edit
	public void deleteById(int id) {
		//todo.getId() == id
		// todo -> todo.getId() == id
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
		public Todo findById(int id) {
		//todo.getId() == id
		// todo -> todo.getId() == id
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = (Todo)todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
		public void updateTodo(@Valid Todo todo) {
			deleteById(todo.getId());
			todos.add(todo);
		}

	
}