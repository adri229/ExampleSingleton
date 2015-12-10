package es.uvigo.esei.dagss.acfernandez4.patterns.behavioral.chain.example1;

import java.io.IOException;

public class Logger {

	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;
	
	private static Logger instance = null;
	
	protected Logger next;
	protected int priority;
	
	public static Logger getInstance(int priority, Logger next) {
		if (instance == null) {
			try {
				instance = new FileLogger(priority,next);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} 
		return instance;
	}
	
	public void log(String msg, int priority){
	}
	
	protected Logger(int priority, Logger next){
		this.next = next;
		this.priority = priority;
	}
	
}
