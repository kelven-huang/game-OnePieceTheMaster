package com.huangjiabin.modle;

import com.yizhuoyan.util.ConsoleUtil;

public class HumanPlayer extends AbstractPlayer{
	
	public HumanPlayer() {
		
	}
	@Override
	public void setName() {
		// TODO Auto-generated method stub
		String name;
		while(true) {
			name =  ConsoleUtil.readString("请输入你的名字");
			if(name.length()==0) {
				System.out.println("你还未输入姓名，请重新输入");
				continue;
			}
			break;
		}
		this.name=name;
	}
	@Override
	boolean isContinue() {
		// TODO Auto-generated method stub
		return ConsoleUtil.readBoolean("是否继续游戏，默认y为是的，其他为否", true);
	}
	@Override
	public void drawCard(Poker poker) {
		// TODO Auto-generated method stub
		int index=0;
		while(true) {
			index=ConsoleUtil.readPositiveInt("请输入1-52抽取你想要的数字的牌");
			if(index>52) {
				System.out.println("请输入1-52之间的一个数字");
				continue;
			}
			break;
		}
		Card card=poker.drawCard(index);
		this.handCard=card;
	}
	
	
}
