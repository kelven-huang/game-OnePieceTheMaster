package com.huangjiabin.modle;

public class Poker {
	/**
	 * 一副牌
	 */
	Card[] cards;
	
	/**
	 * 玩家拿完后剩下的牌
	 */
	Card[] leftCards;
	
	
	public Poker() {
		this.cards=new Card[52];
		this.init();
		this.leftCards=cards;
	}
	/**
	 * 一副牌
	 */
	public void init() {
		int i=0;
		for(int color=100;color<=400;color=color+100) {
			for(int dot=1;dot<=13;dot++) {
				//新建一张牌放入生成一副牌
				cards[i++]=new Card(color, dot);
			}
		}
	}
	/**
	 * 洗牌
	 */
	public void shuffle() {
		Card[] cards=this.cards;
		Card temp;
		int index=0;
		for(int i=0;i<cards.length;i++) {
			index=(int)Math.floor(Math.random()*cards.length);
			temp=cards[0];
			cards[0]=cards[index];
			cards[index]=temp;
		}
	}
	
	
	/**
	 * 抽牌
	 * @return 
	 */
	public Card drawCard(int index) {
		Card card=this.leftCards[index];
		Card[] leftCards=new Card[this.leftCards.length-1];
		
		System.arraycopy(this.leftCards, 0, leftCards, 0, index);
		System.arraycopy(this.leftCards, index+1, leftCards, index, this.leftCards.length-index-1);
		this.leftCards=leftCards;
		return card;
		
	}
}
