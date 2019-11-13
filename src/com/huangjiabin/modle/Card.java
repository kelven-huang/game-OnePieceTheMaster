package com.huangjiabin.modle;

public class Card {
	//颜色
	private int color;
	//点数
	private int dot;
	
	public Card(int color,int dot) {
		this.color=color;
		this.dot=dot;
	}
	
	
	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}


	public int getDot() {
		return dot;
	}


	public void setDot(int dot) {
		this.dot = dot;
	}


	/**
	 * 与其他牌比较
	 * @return 
	 */
	public int compare(Card anotherCard) {
		if(this.dot==anotherCard.dot) {
			return this.color-anotherCard.color;
		}
		return this.dot-anotherCard.dot;
	}
	/**
	 * 格式化扑克牌
	 */
	public String formatCard() {
		int i=this.color/100;
		int j=this.dot;
		String[] format=new String[]{"♦","♣","♥","♠"};
		String[] formatDot=new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		return format[i-1]+formatDot[j-1];
	}
	/**
	 * 展示牌
	 */
	public void showCard() {
		
	}
	
}
