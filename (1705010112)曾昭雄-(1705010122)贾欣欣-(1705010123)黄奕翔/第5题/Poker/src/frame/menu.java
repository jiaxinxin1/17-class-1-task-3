package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import process.Cards;
import process.Card;
import process.Player;
import process.Judge;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;



public class menu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 997, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("纸牌游戏模拟");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel.setBounds(385, 24, 132, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("玩家一");
		label.setFont(new Font("宋体", Font.BOLD, 20));
		label.setBounds(34, 89, 81, 24);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("玩家二");
		label_1.setFont(new Font("宋体", Font.BOLD, 20));
		label_1.setBounds(34, 291, 72, 28);
		frame.getContentPane().add(label_1);
		
		JLabel Label_1 = new JLabel("");
		Label_1.setVerticalAlignment(SwingConstants.TOP);
		Label_1.setIcon(new ImageIcon("picture/back.jpg"));
		Label_1.setBounds(44, 126, 105, 150);
		frame.getContentPane().add(Label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("picture/back.jpg"));
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setBounds(209, 126, 105, 150);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("picture/back.jpg"));
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setBounds(398, 126, 105, 150);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("picture/back.jpg"));
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setBounds(44, 332, 105, 150);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("picture/back.jpg"));
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setBounds(209, 332, 105, 150);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("picture/back.jpg"));
		label_6.setVerticalAlignment(SwingConstants.TOP);
		label_6.setBounds(398, 332, 105, 150);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("游戏模拟");
		label_7.setFont(new Font("宋体", Font.BOLD, 20));
		label_7.setBounds(740, 94, 95, 18);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("同花胜率");
		label_8.setFont(new Font("宋体", Font.BOLD, 20));
		label_8.setBounds(690, 137, 90, 30);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("顺子胜率");
		label_9.setFont(new Font("宋体", Font.BOLD, 20));
		label_9.setBounds(690, 210, 90, 30);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("同点胜率");
		label_10.setFont(new Font("宋体", Font.BOLD, 20));
		label_10.setBounds(690, 280, 90, 30);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("对子胜率");
		label_11.setFont(new Font("宋体", Font.BOLD, 20));
		label_11.setBounds(690, 350, 90, 30);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("杂牌胜率");
		label_12.setFont(new Font("宋体", Font.BOLD, 20));
		label_12.setBounds(690, 420, 90, 30);
		frame.getContentPane().add(label_12);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(790, 139, 90, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(790, 215, 90, 30);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(790, 280, 90, 30);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(790, 350, 90, 30);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(790, 420, 90, 30);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_2 = new JLabel("次数");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel_2.setBounds(582, 487, 60, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(634, 492, 60, 25);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("开始模拟");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int th=0;
				int sz=0;
				int td=0;
				int dz=0;
				int zp=0;
				int sum=0; 
				List<Player> p = new ArrayList<Player>();
			    p.add(new Player(1,"玩家一"));
			    p.add(new Player(2,"玩家二"));
				sum=Integer.parseInt(textField_5.getText().toString());
				
				  Cards cards = new Cards();
		    for(int k=0;k<sum;k++) {
				    cards.shufCards();
				    cards.showCards();
				    p.get(0).clearhandCards();
				    p.get(1).clearhandCards();
			        int count = 0;
			        //设定每人分别拿三张
			        for(int i=0; i<3;i++){
			            //玩家轮流拿牌
			            for(int j=0; j< p.size(); j++){
			                p.get(j).setHandCards(cards.getList().get(count));
			                count++;
			            }
			        }
			        for(int i=0;i<p.size();i++){
			            System.out.print(p.get(i).getName()+"的手牌为：[ ");
			            for(int j=0;j<p.get(i).getHandCards().size();j++){
			                Card cur = p.get(i).getHandCards().get(j);
			                System.out.print(cur.getColor()+cur.getNumber()+" ");
			            }
			            System.out.println(" ]");
			        }
			        System.out.print("picture\\"+p.get(0).getHandCards().get(0).getColor()+p.get(0).getHandCards().get(0).getNumber()+".jpg");
			        Label_1.setIcon(new ImageIcon("picture\\"+p.get(0).getHandCards().get(0).getColor()+p.get(0).getHandCards().get(0).getNumber()+".jpg"));
			        label_2.setIcon(new ImageIcon("picture\\"+p.get(0).getHandCards().get(1).getColor()+p.get(0).getHandCards().get(1).getNumber()+".jpg"));
			        label_3.setIcon(new ImageIcon("picture\\"+p.get(0).getHandCards().get(2).getColor()+p.get(0).getHandCards().get(2).getNumber()+".jpg"));
			        label_4.setIcon(new ImageIcon("picture\\"+p.get(1).getHandCards().get(0).getColor()+p.get(1).getHandCards().get(0).getNumber()+".jpg"));
			        label_5.setIcon(new ImageIcon("picture\\"+p.get(1).getHandCards().get(1).getColor()+p.get(1).getHandCards().get(1).getNumber()+".jpg"));
			        label_6.setIcon(new ImageIcon("picture\\"+p.get(1).getHandCards().get(2).getColor()+p.get(1).getHandCards().get(2).getNumber()+".jpg"));
			        int x= Judge.compare(p.get(0),p.get(1));
			        int y=Judge.getkinds(p.get(0));
			        int z=Judge.getkinds(p.get(1));
			        if(x==0) {
			        	switch(y) {
			        	case 5:th=th+1;break;
			        	case 4:sz=sz+1;break;
			        	case 3:td=td+1;break;
			        	case 2:dz=dz+1;break;
			        	case 1:zp=zp+1;break;
			        	}
			        	
			        }
			        else if(x==1) {
			        	switch(y) {
			        	case 5:th=th+1;break;
			        	case 4:sz=sz+1;break;
			        	case 3:td=td+1;break;
			        	case 2:dz=dz+1;break;
			        	case 1:zp=zp+1;break;
			        	}
			        }
			        else if(x==-1) {
			        	switch(z) {
			        	case 5:th=th+1;break;
			        	case 4:sz=sz+1;break;
			        	case 3:td=td+1;break;
			        	case 2:dz=dz+1;break;
			        	case 1:zp=zp+1;break;
			        	}
			        }
			        
			    }   
		    System.out.println(sum);
		    System.out.println(th);
		    System.out.println(sz);
		    System.out.println(td);
		    System.out.println(dz);
		    System.out.println(zp);
		    textField.setText(String.valueOf((th+0.0)/sum));
			textField_1.setText(String.valueOf((sz+0.0)/sum));
			textField_2.setText(String.valueOf((td+0.0)/sum));
			textField_3.setText(String.valueOf((dz+0.0)/sum));
			textField_4.setText(String.valueOf((zp+0.0)/sum));
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.setBounds(767, 489, 140, 27);
		frame.getContentPane().add(btnNewButton);
	}
	
}
