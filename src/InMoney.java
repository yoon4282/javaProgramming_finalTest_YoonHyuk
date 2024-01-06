import java.awt.*;

import java.awt.event.*;

import javax.swing.ImageIcon;


public class InMoney extends Frame {
	Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,back,check,out,check2;
    
    Label laccount, lcheck;
    
	Font f1 = new Font("Dialog", Font.BOLD, 20);;//폰트
	
	Color c = new Color(60, 229, 229);;//버튼색
    
    InMoney(){
    	super("입금");
    	this.setBounds(-10, 30, 1900, 800);
		this.setLayout(null);
		
		this.setIconImage(new ImageIcon("image/icon.png").getImage());
		
		lcheck = new Label("입금하실");
		lcheck.setBounds(50, 120, 850, 40);
		lcheck.setBackground(Color.yellow);
		lcheck.setAlignment(Label.CENTER);
		lcheck.setFont(f1);
		
		laccount = new Label("금액을 입력하십시오");
		laccount.setBounds(50, 160, 850, 40);
		laccount.setBackground(Color.yellow);
		laccount.setAlignment(Label.CENTER);
		laccount.setFont(f1);	
		
		num1 = new Button("1");
		num1.setBounds(950, 120, 100, 100);
		num1.setFont(f1);
		num1.setBackground(c);
		num1.addActionListener(new Event());
		
		num2 = new Button("2");
		num2.setBounds(1100, 120, 100, 100);
		num2.setFont(f1);
		num2.setBackground(c);
		num2.addActionListener(new Event());
		
		num3 = new Button("3");
		num3.setBounds(1250, 120, 100, 100);
		num3.setFont(f1);
		num3.setBackground(c);
		num3.addActionListener(new Event());
		
		num4 = new Button("4");
		num4.setBounds(950, 250, 100, 100);
		num4.setFont(f1);
		num4.setBackground(c);
		num4.addActionListener(new Event());
		
		num5 = new Button("5");
		num5.setBounds(1100, 250, 100, 100);
		num5.setFont(f1);
		num5.setBackground(c);
		num5.addActionListener(new Event());
		
		num6 = new Button("6");
		num6.setBounds(1250, 250, 100, 100);
		num6.setFont(f1);
		num6.setBackground(c);
		num6.addActionListener(new Event());
		
		num7 = new Button("7");
		num7.setBounds(950, 380, 100, 100);
		num7.setFont(f1);
		num7.setBackground(c);
		num7.addActionListener(new Event());
		
		num8 = new Button("8");
		num8.setBounds(1100, 380, 100, 100);
		num8.setFont(f1);
		num8.setBackground(c);
		num8.addActionListener(new Event());
		
		num9 = new Button("9");
		num9.setBounds(1250, 380, 100, 100);
		num9.setFont(f1);
		num9.setBackground(c);
		num9.addActionListener(new Event());
		
		num0 = new Button("0");
		num0.setBounds(1100, 510, 100, 100);
		num0.setFont(f1);
		num0.setBackground(c);
		num0.addActionListener(new Event());
		
		back = new Button("정정");
		back.setBounds(950, 510, 100, 100);
		back.setFont(f1);
		back.setBackground(c);
		back.addActionListener(new Event());
		
		check = new Button("확인");
		check.setBounds(1250, 510, 100, 100);
		check.setFont(f1);
		check.setBackground(c);
		check.addActionListener(new Event());
		
		out = new Button("나가기");
		out.setBounds(1150, 650, 200, 100);
		out.setForeground(Color.black);
		out.setFont(f1);
		out.setBackground(c);
		out.addActionListener(new Event());
		
		this.setFocusable(true);
		this.addKeyListener(new Event2());
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		add(num1);  add(num2);  add(num3);  add(num4);  add(num5);  
		add(num6); add(num7);  add(num8);  add(num9);  add(num0);  
		add(back); add(check); add(out); add(lcheck); add(laccount);
		this.setVisible(true);
    }
    
    class Event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			 String str = ((Button) e.getSource()).getLabel();
			 
	         if (str.equals("1")) {
	        	Main.sent = Main.sent * 10 + 1;
	        	laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("2")) {
	        	 Main.sent = Main.sent * 10 + 2;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("3")) {
	        	 Main.sent = Main.sent * 10 + 3;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("4")) {
	        	 Main.sent = Main.sent * 10 + 4;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("5")) {
	        	 Main.sent = Main.sent * 10 + 5;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("6")) {
	        	 Main.sent = Main.sent * 10 + 6;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("7")) {
	        	 Main.sent = Main.sent * 10 + 7;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("8")) {
	        	 Main.sent = Main.sent * 10 + 8;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("9")) {
	        	 Main.sent = Main.sent * 10 + 9;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("0")) {
	        	 Main.sent = Main.sent * 10 + 0;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("정정")) {
	        	 Main.sent = Main.sent / 10;
	        	 laccount.setText("금액 : "+Main.sent+"원");
	         } else if (str.equals("확인")) {	       
	        	 if(Main.sent == 0) {
		        		lcheck.setText("0원은 입금할수 없습니다.");
		        		laccount.setText("처음 화면으로 돌아가십시오. (나가기를 누르시오)");
		        	 } else {
			        	dispose();
			        	Main.money += Main.sent;
				        new InMoney1();
		        	 }       	 
	         }  else if (str.equals("나가기")) {
	        	 dispose();
	        	Main.sent = 0;
				new Main("은행");
	         }
			}
		}
    class Event2 implements KeyListener{
		public void keyReleased(KeyEvent e) {
			switch(e.getKeyCode()){
				case KeyEvent.VK_1:
		        	Main.sent = Main.sent * 10 + 1;
		        	laccount.setText("금액 : "+Main.sent+"원");
	        		break;
				case KeyEvent.VK_2:
					Main.sent = Main.sent * 10 + 2;
		        	laccount.setText("금액 : "+Main.sent+"원");
	        		break;
				case KeyEvent.VK_3:
					Main.sent = Main.sent * 10 + 3;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_4:
					Main.sent = Main.sent * 10 + 4;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_5:
					Main.sent = Main.sent * 10 + 5;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_6:
		        	Main.sent = Main.sent * 10 + 6;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_7:
		        	Main.sent = Main.sent * 10 + 7;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_8:
		        	Main.sent = Main.sent * 10 + 8;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_9:
		        	Main.sent = Main.sent * 10 + 9;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_0:
		        	Main.sent = Main.sent * 10 + 0;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_BACK_SPACE:
		        	Main.sent = Main.sent / 10;
		        	laccount.setText("금액 : "+Main.sent+"원");
		        	break;
				case KeyEvent.VK_ENTER:
					if(Main.sent == 0) {
		        		lcheck.setText("0원은 입금할수 없습니다.");
		        		laccount.setText("처음 화면으로 돌아가십시오. (나가기를 누르시오)");
		        	 } else {
			        	dispose();
			        	Main.money += Main.sent;
				        new InMoney1();
		        	 }
	        		break;
			}
		}

		public void keyTyped(KeyEvent e) {
			
		}
		public void keyPressed(KeyEvent e) {
			
		}
    }
}
