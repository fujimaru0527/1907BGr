package Bgr;

//勝敗判定クラス
public class Battle {

	//勝敗判定メソッド
	public static boolean result(int playerHand , int enemyHand){

		if(playerHand == 1 && enemyHand == 2 ||
		   playerHand == 2 && enemyHand == 3 ||
		   playerHand == 3 && enemyHand == 1 ){
			return true;
		}else{
			//勝利以外はすべて敗北
			return false;
		}
	}
}
