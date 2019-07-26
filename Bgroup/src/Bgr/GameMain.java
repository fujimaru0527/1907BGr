package Bgr;
import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JFrame jframe  = new JFrame();
		jframe.setSize(1000,800);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        Panel.createPanel(jframe);
        jframe.setVisible(true);
	}

}
