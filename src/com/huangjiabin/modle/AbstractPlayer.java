package com.huangjiabin.modle;

public abstract class AbstractPlayer {
	//玩家名字
	String name;
	//当前手牌
	Card handCard;
	
	
	public Card getHandCard() {
		return handCard;
	}

	public void setHandCard(Card handCard) {
		this.handCard = handCard;
	}

	public String getName() {
		return name;
	}

	
	
	
	/**
	 * 拿牌
	 */
	abstract public void drawCard(Poker poker) ;
	/**
	 * 设置名字
	 */
	abstract public void setName() ;
	/**
	 * 是否继续
	 */
	abstract boolean isContinue();
	public void showCard() {
		Card card=this.handCard;
		System.out.println(this.name+"的牌为"+card.formatCard());
	}
}
