import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePlay implements ActionListener{
	Random random=new Random();
	Scanner scanner=new Scanner(System.in);
	JFrame frame=new JFrame("TIC-TAC-TOE");
	JButton[] button=new JButton[9];
	JButton reset=new JButton("RESET");
	JLabel label=new JLabel();
	 JPanel panel=new JPanel();
	 JPanel tpanel=new JPanel();
	 JPanel side=new JPanel();
	 boolean turn;
	 
	
	 GamePlay() {
		reset.setFocusable(false);
		reset.addActionListener(this);
		
		
		side.setBackground(Color.GRAY);
		side.setBounds(600,600,100,600);
		side.add(reset);
		
		label.setText("TIC-TAC-TOE");
		label.setFont(new Font("MV Boli",Font.BOLD,30));
		label.setForeground(Color.PINK);
		label.setVisible(true);
		
		
		panel.setLayout(new GridLayout(3,3));
		panel.setBackground(Color.BLUE);
		
		
		
		tpanel.setBackground(new Color(123,113,150));
		 tpanel.setOpaque(true);
		 tpanel.setBounds(0, 0, 600, 50);
		tpanel.add(label);
		
		
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		frame.add(panel);
		frame.add(tpanel,BorderLayout.NORTH);
		frame.add(side,BorderLayout.EAST);
		
		
		for(int i=0;i<9;i++) {
			button[i] = new JButton();
			panel.add(button[i]);
			button[i].setBackground(new Color(50,60,50));
			button[i].setFont(new Font("MV Boli",Font.BOLD,80));
			button[i].setFocusable(false);
			button[i].addActionListener(this);
		}
		 
		 first();
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reset) {
			frame.setVisible(false);
			GamePlay game=new GamePlay();
			
		}
		
		
		
		
		for(int i=0;i<9;i++) 
			
		{
			if(e.getSource()==button[i]) {
				if(turn==true) {
					if(button[i].getText()=="") {
						button[i].setForeground(new Color(255,0,0));
						button[i].setText("X");
						turn=false;
						label.setText("O plays");
						c();
					}
				}
				else {
					if(button[i].getText()=="") {
						button[i].setForeground(new Color(0,0,255));
						button[i].setText("O");
						turn=true;
						label.setText("X plays");
						c();
					}
				}
			}			
		}
		
		
	}
	
	public void first()  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			turn=true;
			label.setText("X plays");
		}
		else {
			turn=false;
			label.setText("O plays");
		}
	}
 public void c() {
	 if(button[0].getText()=="X" &&
	    button[1].getText()=="X" &&
	    button[2].getText()=="X") {
		 x(0,1,2);
	 } 
	 else if(button[3].getText()=="X" &&
			    button[4].getText()=="X" &&
			    button[5].getText()=="X") {
				 x(3,4,5);
			 } 
	 else if(button[6].getText()=="X" &&
			    button[7].getText()=="X" &&
			    button[8].getText()=="X") {
				 x(6,7,8);
			 } 
	 else if(button[0].getText()=="X" &&
			    button[3].getText()=="X" &&
			    button[6].getText()=="X") {
				 x(0,3,6);
	 }
	 else if(button[1].getText()=="X" &&
			    button[4].getText()=="X" &&
			    button[7].getText()=="X") {
				 x(1,4,7);
			 } 
	 else if(button[2].getText()=="X" &&
			    button[5].getText()=="X" &&
			    button[8].getText()=="X") {
				 x(2,5,8);
			 } 
	 else if(button[0].getText()=="X" &&
			    button[4].getText()=="X" &&
			    button[8].getText()=="X") {
				 x(0,4,8);
			 } 
	 else if(button[2].getText()=="X" &&
			    button[4].getText()=="X" &&
			    button[6].getText()=="X") {
				 x(2,4,6);
			 } 
	 
	 if(button[0].getText()=="O" &&
			    button[1].getText()=="O" &&
			    button[2].getText()=="O") {
				 O(0,1,2);
			 } 
			 else if(button[3].getText()=="O" &&
					    button[4].getText()=="O" &&
					    button[5].getText()=="O") {
						 O(3,4,5);
					 } 
			 else if(button[6].getText()=="O" &&
					    button[7].getText()=="O" &&
					    button[8].getText()=="O") {
						 O(6,7,8);
					 } 
			 else if(button[0].getText()=="O" &&
					    button[3].getText()=="O" &&
					    button[6].getText()=="O") {
						 O(0,3,6);
			 }
			 else if(button[1].getText()=="O" &&
					    button[4].getText()=="O" &&
					    button[7].getText()=="O") {
						 O(1,4,7);
					 } 
			 else if(button[2].getText()=="O" &&
					    button[5].getText()=="O" &&
					    button[8].getText()=="O") {
						 O(2,5,8);
					 } 
			 else if(button[0].getText()=="O" &&
					    button[4].getText()=="O" &&
					    button[8].getText()=="O") {
						 O(0,4,8);
					 } 
			 else if(button[2].getText()=="O" &&
					    button[4].getText()=="O" &&
					    button[6].getText()=="O") {
						 O(2,4,6);
					 } 
	 if(button[0].getText()!=""&&
			 button[1].getText()!="" &&
			 button[2].getText()!="" &&
			 button[3].getText()!="" &&
			 button[4].getText()!="" &&
			 button[5].getText()!="" &&
			 button[6].getText()!="" &&
			 button[7].getText()!="" &&
			 button[8].getText()!="")
	 {
		 d();
	 }

	 
 }
 public void x(int a,int b,int c) {
	 
	 button[a].setBackground(Color.green);
	 button[b].setBackground(Color.green);
	 button[c].setBackground(Color.green);
	 for(int i=0;i<9;i++) {
		 button[i].setEnabled(false);
	 }
	 label.setText("X wins");
	 
 }
 public void O(int a,int b,int c) {
	 
	 button[a].setBackground(Color.green);
	 button[b].setBackground(Color.green);
	 button[c].setBackground(Color.green);
	 for(int i=0;i<9;i++) {
		 button[i].setEnabled(false);
	 }
	 label.setText("O wins");
	 
 }
 public void d() {
	 label.setText("Draw"); 
	 for(int i=0;i<9;i++) {
		 button[i].setEnabled(false);
	 }
 }

 
}

