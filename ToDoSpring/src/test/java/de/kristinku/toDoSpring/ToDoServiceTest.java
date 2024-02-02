package de.kristinku.toDoSpring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoServiceTest {
	private ToDoService cut = new ToDoService();
	
	
	@Test
	void shouldAddNewToDo() {
		ToDo test = new ToDo("test", true);
		Assertions.assertEquals(0,cut.getToDos().size()); //Wir erwarten das die länge der Liste gerade noch 0 ist. In Test spricht man von erwarten (assert)
		cut.addToDo(test);
		Assertions.assertEquals(1,cut.getToDos().size()); //Wir erwarten nach der addToDo funktion das die Liste 1 ist.
		Assertions.assertEquals(test, cut.getToDos().get(0));
	}													//Wenn alle Erwartungen erfüllt sind ist der test grün
	
	@Test
	void shouldDeleteToDos() {
		ToDo test = new ToDo("test", true);
		ToDo test1 = new ToDo("solar", false);
		cut.addToDo(test);	//zum test hinzufügen um es für den test löschen zu können.
		cut.addToDo(test1);
		cut.deleteToDo("test");
		Assertions.assertEquals(1,cut.getToDos().size());
		
	}
}
