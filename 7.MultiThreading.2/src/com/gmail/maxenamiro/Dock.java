package com.gmail.maxenamiro;

public class Dock {
	private boolean lock = false;
	private String name;
	private Ship locker;

	public Dock(String name) {
		super();
		this.name = name;
	}

	public void setBox(Box box) {
		// TODO Auto-generated method stub
		if (box.getShipName().equals(locker.getName())) {
			System.out.println(box + "прибув до " + name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}

	public boolean isLocked() {
		// TODO Auto-generated method stub
		return lock;
	}

	public void lock(Ship locker) {
		if (!lock) {
			lock = true;
			this.locker = locker;
		}
	}

	public void unLock(Ship locker) {
		// TODO Auto-generated method stub
		if (lock && this.locker.getName().equals(locker.getName())) {
			lock = false;
		}
		System.out.println(locker.getName() + " звільнив " + name);
	}

}
