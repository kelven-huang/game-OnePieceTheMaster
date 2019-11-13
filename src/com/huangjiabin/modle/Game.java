package com.huangjiabin.modle;

import com.yizhuoyan.util.ConsoleUtil;

public class Game {
	AbstractPlayer humanPlayer;
	AbstractPlayer aiPlayer;
	Poker poker;
	
	public Game() {
		this.humanPlayer=new HumanPlayer();
		this.aiPlayer=new AIPlayer();
		this.poker=new Poker();
	}
	public void start() {
		//1游戏开始
		this.welcome();
		//2创建参与对象
		this.humanPlayer.setName();
		while(true) {
			//3洗牌
			this.poker.shuffle();
			//4抽牌
			this.humanPlayer.drawCard(poker);
			//删除玩家拿了的牌
			
			this.aiPlayer.drawCard(poker);
			//5展示牌
			this.humanPlayer.showCard();
			this.aiPlayer.showCard();
			//6比大小
			if(isWin()>0) {
				System.out.println(this.humanPlayer.name+"恭喜你赢了");
			}else {
				System.out.println(this.humanPlayer.name+"很遗憾，你输了");
			}
			//7展示结果
			//8是否继续
			if(!this.humanPlayer.isContinue()) {
				break;
			}
		}
	}
	
	
	private void welcome() {
		System.out.println("欢迎游戏");
		System.out.println("-----------");
	}
	
	
	private int isWin() {
		Card humanCard=this.humanPlayer.handCard;
		Card aiCard=this.aiPlayer.handCard;
		return humanCard.compare(aiCard);
	}
}
