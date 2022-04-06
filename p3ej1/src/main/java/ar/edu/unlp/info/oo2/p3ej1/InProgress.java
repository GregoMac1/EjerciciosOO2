package ar.edu.unlp.info.oo2.p3ej1;

public class InProgress implements State{
	public void start(ToDoItem item) {}
	
	public void togglePause(ToDoItem item) {
		item.basicSetPaused();
	}
	
	public void finish(ToDoItem item) {
		item.basicFinish();
	}
	
	public void addComment(ToDoItem item, String comment) {
		item.basicAddComment(comment);
	}
	
	public Duration workedTime(ToDoItem item, Duration duration) {
		duration.stop();
		return duration;
	}
}
