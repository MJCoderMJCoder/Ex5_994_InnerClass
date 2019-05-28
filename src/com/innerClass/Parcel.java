package com.innerClass;

class Parcel {
	private Contents c;
	private Destination d;
	private int contentsCount = 0;
	class Contents {
		private int i;
		Contents(int i) {
			this.i = i;
			contentsCount++;	//C行，内部类可直接使用外部类的成员变量和方法
		}
		int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		public Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	
	void setValue(Contents c, Destination d) {
		this.c = c;
		this.d = d;
	}
	
	void ship() {
		 //外部类使用内部类的方法和变量与一个类使用其成员变量或成员方法没区别
		System.out.println("运输" + c.value() + "到"+ d.label);
	}
	
	public void testShip() {
		c = new Contents(22);
		d = new Destination("山西太原");
		ship();
	}

}
