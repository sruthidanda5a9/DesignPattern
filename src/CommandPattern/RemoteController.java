package CommandPattern;

/*remote controller is the invoker and is responsible for calling the corresponding
 * commadn object and that command object is responsible for invoking the receiver to perform the actions.
 * */


public class RemoteController {
	
	Command command;
	
	public RemoteController(Command command) {
		// TODO Auto-generated constructor stub
		this.command = command;
	}
	
	public void buttonPressed()
	{
		command.execute();
	}
	
	public void undoButtonPressed()
	{
		command.undo();
	}

}
