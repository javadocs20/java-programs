package com.waitnotify;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {

	private Data data;

	// standard constructors
	

	public void run() {
		String packets[] = { "First packet", "Second packet", "Third packet", "Fourth packet", "End" };

		for (String packet : packets) {
			data.send(packet);

			// Thread.sleep() to mimic heavy server-side processing
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Thread interrupted" + e);
			}
		}
	}

	public Sender(Data data) {
		super();
		this.data = data;
	}

}
