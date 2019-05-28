package com.innerClass;

class Parcel {
	private Contents c;
	private Destination d;
	private int contentsCount = 0;
	class Contents {
		private int i;
		Contents(int i) {
			this.i = i;
			contentsCount++;	//C�У��ڲ����ֱ��ʹ���ⲿ��ĳ�Ա�����ͷ���
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
		 //�ⲿ��ʹ���ڲ���ķ����ͱ�����һ����ʹ�����Ա�������Ա����û����
		System.out.println("����" + c.value() + "��"+ d.label);
	}
	
	public void testShip() {
		c = new Contents(22);
		d = new Destination("ɽ��̫ԭ");
		ship();
	}

}
