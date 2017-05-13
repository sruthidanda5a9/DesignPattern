package CommandPattern;

// This command interface is implemented by all command objects.
public interface Command {
	
	public void execute(); // execute method is responsible for binding actions with receiver.

	public void undo(); // this method is used to undo the previous action.In order to do this we need to store the previous action in the application.
}
