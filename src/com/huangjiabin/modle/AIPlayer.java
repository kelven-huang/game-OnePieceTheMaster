package com.huangjiabin.modle;

import java.util.Random;

import com.yizhuoyan.util.ConsoleUtil;

public class AIPlayer extends AbstractPlayer {
	
	
	public AIPlayer() {
		this.setName();
	}
	@Override
	public void setName() {
		// TODO Auto-generated method stub
		this.name ="小爱";
	}
	@Override
	boolean isContinue() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void drawCard(Poker poker) {
		// TODO Auto-generated method stub
		int index=0;
		index=(int) Math.floor(Math.random()*poker.leftCards.length+1);
		Card card=poker.drawCard(index);
		this.handCard=card;
	}
	
	

}
