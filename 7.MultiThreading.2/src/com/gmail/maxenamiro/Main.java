package com.gmail.maxenamiro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Port port = new Port();
		port.addDock(new Dock("Перший док"));
		port.addDock(new Dock("Другий док"));
		for (int i = 0; i < 3; i++) {
			new Thread(new Ship(port, "корабель № " + i)).start();
		}
	}

}
