package Bgr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class Panel {
		public static JLabel headerLabel;
		public static JLabel contentsLabel;
		public static void createPanel(JFrame frame) {
			//ヘッダーパネル
			//上部に表示するパネル
			Dimension headerPanelDimension = new Dimension(640, 50);
			JPanel headerPanel = setPanel(Color.BLACK, headerPanelDimension);
			headerLabel = new JLabel("「さあ、じゃんけんで勝負だ！」");
			headerLabel = setFont(Color.WHITE,headerLabel,24);
			headerPanel.add(headerLabel);
			frame.add(headerPanel,BorderLayout.NORTH);

			//コンテンツパネル
			//要調整
			Dimension contentsPanelDimension = new Dimension(640, 380);
			JPanel contentsPanel = setPanel(Color.WHITE,contentsPanelDimension);
			//画像を読み込んで、表示させる。
			Enemy enemy = new Enemy();
			//enemy.createEnemyImage();

			contentsLabel = new JLabel("じゃんけん・・・");
			contentsLabel = setFont(Color.BLACK,contentsLabel,54);
			contentsPanel.add(contentsLabel);
			frame.add(contentsPanel,BorderLayout.CENTER);

			//フッタパネル
			Dimension footerPanelDimension = new Dimension(640, 50);
			JPanel footerPanel = setPanel(Color.BLACK,footerPanelDimension);

			Player.createButton(footerPanel);
			frame.add(footerPanel,BorderLayout.SOUTH);
		}
		public static JPanel setPanel(Color color, Dimension PanelDimension) {
			JPanel panel = new JPanel();
			panel.setPreferredSize(PanelDimension);
			panel.setLayout(new BorderLayout());
			panel.setBackground(color);
			return(panel);
		}
		public static JLabel setFont(Color clr,JLabel label,int strSize) {
			label.setForeground(clr);
			Font labelFont = new Font("ＭＳ ゴシック",Font.PLAIN,strSize);
			label.setFont(labelFont);
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setVerticalAlignment(JLabel.CENTER);
			return(label);
		}
	}


