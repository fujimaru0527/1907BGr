package Bgr;

import java.util.Random;

public class Enemy {

	int attack;


	public Enemy(){
		Random random = new Random();
		this.attack= random.nextInt(3)+1;
	}

	public int createEnemyImage(){
	if(this.attack==1){
	   Panel.contentsLabel.setText("グー");
	}else if(this.attack == 2){
	   Panel.contentsLabel.setText("チョキ");
	}else if(this.attack == 3 ){
	   Panel.contentsLabel.setText("パー");
	}
	return attack;
	}
}
