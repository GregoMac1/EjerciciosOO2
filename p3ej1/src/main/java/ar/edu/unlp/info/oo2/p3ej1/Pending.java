package ar.edu.unlp.info.oo2.p3ej1;

public class Pending implements State{
	public void start(ToDoItem item) {
		item.basicStart();
	}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en paused o in-progress.");
	}
	
	public void finish(ToDoItem item) {}
	
	public void addComment(ToDoItem item, String comment) {
		item.basicAddComment(comment);
	}
	
	public Duration workedTime(ToDoItem item, Duration duration) {
		throw new RuntimeException("La tarea no se inició.");
	}
}
