package com.innerClass;

public class InnerClass {

	public static void main(String[] args) {
		Parcel p = new Parcel();
		Parcel.Contents c = p.new Contents(33);
		//非外部类使用内部类，在用类名和new前分别冠以外部类的名字和外部对象名
		//外部类.内部类   对象 = 外部对象.new  内部类（）;
		Parcel.Destination d = p.new Destination("山西大同");	//D行
		//Destination d = new Destination("山西太原");	//A行
		p.setValue(c, d);
		p.ship();
		p.testShip();
	}

}
