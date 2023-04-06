package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class HumanBody 
{

private HumanHeart humanHeart;

@Autowired
public void setHumanHeart(HumanHeart humanHeart) {
	this.humanHeart = humanHeart;
}
public HumanHeart getHumanHeart() {
	return humanHeart;
}



public void humanMethod()
{
	if(humanHeart!=null)
	{
		System.out.println("Human Is Alive");
		humanHeart.heartBeat();
	}
	else
	{
		System.out.println("Human Is not Alive");
	}
}
}
