package com.innerClass;

public class InnerClass {

	public static void main(String[] args) {
		Parcel p = new Parcel();
		Parcel.Contents c = p.new Contents(33);
		//���ⲿ��ʹ���ڲ��࣬����������newǰ�ֱ�����ⲿ������ֺ��ⲿ������
		//�ⲿ��.�ڲ���   ���� = �ⲿ����.new  �ڲ��ࣨ��;
		Parcel.Destination d = p.new Destination("ɽ����ͬ");	//D��
		//Destination d = new Destination("ɽ��̫ԭ");	//A��
		p.setValue(c, d);
		p.ship();
		p.testShip();
	}

}
