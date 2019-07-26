package Bgr;

//勝敗判定クラス
public class Battle {

	//勝敗判定メソッド
	public boolean result(Hero hero , Enemy enemy){

		if(hero.getAttack() == 1 && enemy.getAttack() == 2 ||
		   hero.getAttack() == 2 && enemy.getAttack() == 3 ||
		   hero.getAttack() == 3 && enemy.getAttack() == 1 ){
			return true;
		}else{
			//勝利以外はすべて敗北
			return false;
		}
	}
}

//仮で作っているだけのクラス
class Hero {
	private int attack;

	public int getAttack() {
		return attack;
	}

}

class Enemy {
	private int attack;

	public int getAttack() {
		return attack;
	}

}