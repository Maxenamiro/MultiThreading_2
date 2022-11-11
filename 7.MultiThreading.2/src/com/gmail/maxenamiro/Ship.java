package com.gmail.maxenamiro;

public class Ship implements Runnable {
	private String name;
	private Box[] boxes = new Box[10];
	private Port port;
	private Dock dock;

	public Ship(Port port, String name) {
		this.name = name;
		this.port = port;
		for (int i = 0; i < 10; i++) {// ++i
			boxes[i] = new Box(i, name);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + "прибув");
		dock = port.getDock(this);
		for (Box box : boxes) {
			dock.setBox(box);
		}
		dock.unLock(this);
		port.leave();
	}

	public String getName() {
		return name;
	}

}
