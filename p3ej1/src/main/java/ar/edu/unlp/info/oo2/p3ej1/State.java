package ar.edu.unlp.info.oo2.p3ej1;

public interface State {
	public void start(ToDoItem item);
	
	public void togglePause(ToDoItem item);
	
	public void finish(ToDoItem item);
	
	public void addComment(ToDoItem item, String comment);
	
	public Duration workedTime(ToDoItem item, Duration duration);
}
