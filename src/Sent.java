	import java.awt.*;
	import java.awt.event.*;

import javax.swing.ImageIcon;
	
	public class Sent extends Frame  {
		Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,back,check,out,check2;//키패드
	    
	    Dialog warring;//자리수 초과 알림
	    
	    List accountlist;
	    
	    Label laccount, lcheck, lwarring;//계좌번호(이름) 보는곳, 금액 확인하는곳, 경고문
	    
		Font f1 = new Font("Dialog", Font.BOLD, 20);;//폰트
		
		Color c = new Color(60, 229, 229);;//버튼색
		
		boolean run = true;;
	    
	    Sent(){
	    	super("송금");
			this.setBounds(-10, 30, 1900, 800);
			this.setLayout(null);
			
			this.setIconImage(new ImageIcon("image/icon.png").getImage());
			
			laccount = new Label("계좌번호를 입력 하십시오", Label.CENTER);
			laccount.setBounds(50, 120, 850, 40);
			laccount.setBackground(Color.yellow);
			laccount.setFont(f1);
			
			lcheck = new Label("자주 송금하신 계좌번호", Label.CENTER);
			lcheck.setBounds(50, 160, 850, 40);
			lcheck.setBackground(Color.yellow);
			lcheck.setFont(f1);
			
			accountlist = new List();
			accountlist.setFont(f1);
			accountlist.setBounds(50, 200, 850, 80);
			for(int i = 0; i<Main.account1.length; i++) {
				accountlist.add(Integer.toString(Main.account1[i]));
			}
			accountlist.addItemListener(new ItemListener() {
			    public void itemStateChanged(ItemEvent e) {
			            String selectedValue = accountlist.getSelectedItem();
			            Main.account = Integer.parseInt(selectedValue);
			            laccount.setText("계좌번호: " + Main.account);
			    }
			});
	
			
			warring = new Dialog(this , "알림", false);
			warring.setBounds(620, 350, 400, 100);
			warring.setLayout(new FlowLayout());
			
			lwarring = new Label("자리수가 초과되었습니다.");
			lwarring.setBackground(Color.yellow);
			lwarring.setAlignment(Label.CENTER);
			lwarring.setFont(f1);
			
			check2 = new Button(" 확인 ");
			check2.setFont(f1);
			check2.setBackground(c);
			check2.addActionListener(new Event());
			
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
			add(back); add(check); add(out); add(laccount); warring.add(lwarring);
			warring.add(check2); add(lcheck); add(accountlist);
			this.setVisible(true);
	    }
	    
	    
	    
	    class Event implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				 String str = ((Button) e.getSource()).getLabel();
		         if (str.equals("1")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 1;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("2")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 2;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("3")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 3;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("4")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 4;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("5")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 5;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("6")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 6;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("7")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 7;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("8")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 8;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("9")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 9;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("0")) {
		        	 if (Main.account < 100000000) {
		        		 Main.account = Main.account * 10 + 0;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						warring.setVisible(true);
					}
		        	 
		         } else if (str.equals("정정")) {
		        	 if (Main.account < 1000000000) {
		        		 Main.account = Main.account / 10;
		        		 laccount.setText("계좌번호: " + Main.account);
					} else {
						 warring.setVisible(true);
					}
		         } else if (str.equals("확인")) {
		        	 dispose();
		        	 Main.name1 = 0;
		        	 for(int i = 0; i< Main.account1.length; ++i) {
		        		 if(Main.account == Main.account1[i]) {
		        			 Main.name1 = i+1;
		        		 }
		        	 }
		        	 new Sent1();
		         } else if (str.equals(" 확인 ")) {
		        	 warring.setVisible(false);
		         } else if (str.equals("나가기")) {
		        	setVisible(false);
		        	Main.account = 0;
					new Main("Bank");
		         }
			}
		} 
	    
	    class Event2 implements KeyListener{
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()){
					case KeyEvent.VK_1:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 1;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_2:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 2;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_3:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 3;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_4:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 4;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_5:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 5;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_6:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 6;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_7:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 7;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_8:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 8;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_9:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 9;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_0:
						if (Main.account < 100000000) {
			        		 Main.account = Main.account * 10 + 0;
			        		 laccount.setText("계좌번호: " + Main.account);
						} else {
							warring.setVisible(true);
						}
		        		break;
					case KeyEvent.VK_BACK_SPACE:
			        	Main.account = Main.account / 10;
			        	laccount.setText("계좌번호: " + Main.account);
		        		break;
					case KeyEvent.VK_ENTER:
						dispose();
			        	 Main.name1 = 0;
			        	 for(int i = 0; i< Main.account1.length; ++i) {
			        		 if(Main.account == Main.account1[i]) {
			        			 Main.name1 = i+1;
			        		 }
			        	 }
			        	 new Sent1();
		        		break;
				}
			}
			
			public void keyTyped(KeyEvent e) {
				
			}
			public void keyPressed(KeyEvent e) {
				
			}
	    }
	}	
