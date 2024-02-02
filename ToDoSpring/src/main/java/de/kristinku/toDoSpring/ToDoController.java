package de.kristinku.toDoSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
	@Autowired						//mit @autowired markieren wir den ToDoService Attribute, damit SB für uns den Service automatisch erstellt.
	private ToDoService toDoService; //Der Controller braucht den Service als Attribut um die Anfragen weiterleiten zu können
									//Hier konnten wir SpringBoot sagen das er für uns den Service erstellt. Siehe Gegenteil bei ToDoService.
	@PostMapping("toDo")			//markieren die Funktion damit SB die unter den Pfad toDo für Post Anfragen markiert
	public void createToDo(@RequestBody ToDo todo) { //Controller: Anfrage annehmen von Bruno
		toDoService.addToDo(todo); //Controller: Weiterleitung an Service
	}
	
	@GetMapping("toDo")				//markiert die Funktion damit SB die GET Anfragen hierhin schickt
	public List<ToDo> getToDos(){
		return toDoService.getToDos();
	}
	
	@DeleteMapping("toDo/{bezeichnung}")
	public void deleteToDo(@PathVariable(value = "bezeichnung") String bezeichnung) {
		toDoService.deleteToDo(bezeichnung);
	}
	
}									
