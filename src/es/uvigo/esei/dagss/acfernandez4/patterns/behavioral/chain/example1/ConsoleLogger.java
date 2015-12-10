package es.uvigo.esei.dagss.acfernandez4.patterns.behavioral.chain.example1;

public class ConsoleLogger extends Logger {

	protected ConsoleLogger(int priority, Logger next) {
		super(priority, next);
		// TODO Auto-generated constructor stub
	}

	public void log(String msg, int priority) {
		if (priority > super.priority) {
			System.out.println("CONSOLE LOGGER: " + msg);
		}

		if (super.next != null) {
			super.next.log(msg, priority);
		}

	}

}
