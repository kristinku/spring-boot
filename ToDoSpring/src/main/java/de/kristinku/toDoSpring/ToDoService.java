package de.kristinku.toDoSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private List<ToDo> toDos = new ArrayList<ToDo>(); // Hier erstellen wir automatisch das toDos Attribut als leere Liste
														//Hier wird der Konstruktor verwendet, um eine leere Liste zu erstellen.Weil eine Liste von ToDos keine von Springboot Markierte Klasse(bean) ist
	public void addToDo(ToDo todo) {
		toDos.add(todo);	
	}
	
	public List<ToDo> getToDos(){
		return toDos;
	}
	
	public void deleteToDo(String bezeichnung) {
		List<ToDo> newToDos = new ArrayList<ToDo>();
		for(ToDo todo : toDos ) {
			if(!todo.getBezeichnung().equals(bezeichnung)) {
				newToDos.add(todo);
			}
		}
		toDos = newToDos;
	}
}
