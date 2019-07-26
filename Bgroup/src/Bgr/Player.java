package Bgr;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

	public class Player implements ActionListener {
		public static void createButton(JPanel footerPanel) {
			//ボタンを表示
			JButton btnGu = new JButton("グー");
			btnGu = setButton(btnGu);
			btnGu.setMnemonic(KeyEvent.VK_1);
			footerPanel.add(btnGu, BorderLayout.WEST);

			JButton btnChoki = new JButton("チョキ");
			btnChoki = setButton(btnChoki);
			btnChoki.setMnemonic(KeyEvent.VK_2);
			footerPanel.add(btnChoki, BorderLayout.CENTER);

			JButton btnPa = new JButton("パー");
			btnPa = setButton(btnPa);
			btnPa.setMnemonic(KeyEvent.VK_3);
			footerPanel.add(btnPa, BorderLayout.EAST);
		}
		public static JButton setButton(JButton button) {
			int buttonSizeX = (640 - 20)/3;
			Dimension buttonDimesion = new Dimension(buttonSizeX, 50);
			button.setPreferredSize(buttonDimesion);
			Font buttonFont = new Font("ＭＳ ゴシック",Font.PLAIN,24);
			button.setFont(buttonFont);

			Player player = new Player();
			button.addActionListener(player);

			return(button);
		}
		public void actionPerformed(ActionEvent e) {
			Enemy enemy = new Enemy();
			int enemyHnad = enemy.createEnemyImage();
			String command = e.getActionCommand();
			int playerHand = 0;
			if (command.equals("グー")) playerHand = 1;
			else if (command.equals("チョキ")) playerHand = 2;
			else if (command.equals("パー"))  playerHand = 3;

			boolean result = Battle.result(playerHand ,enemyHnad);
			if(result == false){
				Panel.contentsLabel.setText("ゲームオーバーです");
			}
		}
	}


