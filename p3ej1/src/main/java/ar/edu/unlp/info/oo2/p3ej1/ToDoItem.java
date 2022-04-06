package ar.edu.unlp.info.oo2.p3ej1;

import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private List<String> comments = new ArrayList<String>();
	private State state;
	private Duration duration;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
	}
	
	public void start() {
		this.state.start(this);
	}
	
	void basicStart() {
		this.setState(new InProgress());
		duration = new Duration();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void togglePause() {
		this.state.togglePause(this);
	}
	
	void basicSetPaused() {
		this.setState(new Paused());
	}
	
	void basicSetInProgress() {
		this.setState(new InProgress());
	}
	
	public void finish() {
		this.state.finish(this);
	}
	
	void basicFinish() {
		this.setState(new Finished());
		this.duration.stop();
	}
	
	public Duration workedTime() {
		return this.state.workedTime(this, duration);
	}
	
	public void addComment(String comment) {
		this.state.addComment(this, comment);
	}
	
	void basicAddComment(String comment) {
		this.comments.add(comment);
	}
}
