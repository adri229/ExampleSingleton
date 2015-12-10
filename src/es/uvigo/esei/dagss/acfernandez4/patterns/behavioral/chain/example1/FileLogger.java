package es.uvigo.esei.dagss.acfernandez4.patterns.behavioral.chain.example1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {	
	
	BufferedWriter bw;

	protected FileLogger(int priority, Logger next) throws IOException {
		super(priority, next);
		this.bw = new BufferedWriter(new FileWriter(new File("log.txt")));
	}
	
	public void log(String msg, int priority) {
		if (priority > super.priority) {
			try {
				System.out.println("generating file log.txt...");
				bw.write(msg);
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (super.next != null) {
			super.next.log(msg, priority);
		}

	}

}
