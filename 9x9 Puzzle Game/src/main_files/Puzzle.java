package main_files;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Puzzle extends JFrame implements java.awt.event.ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int f=9,f1,f2,f3,f4,f5,f6,f7,f8,f9;
    JLabel welcome;
	Puzzle(){
		super("Image Puzzle Game Project from Riz1 & Shuhag");
		setSize(612,660);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		JPanel header=new JPanel();
		JPanel mainpanel=new JPanel();
		mainpanel.setLayout(new GridLayout(3,3));
		mainpanel.setBackground(Color.YELLOW);
		header.setBackground(Color.CYAN);
		welcome=new JLabel(new ImageIcon(getClass().getResource("/images/Welcome.gif")));
		header.add(welcome);
		add(header,BorderLayout.NORTH);
		add(mainpanel,BorderLayout.CENTER);

		
		
		b1=new JButton(new ImageIcon(getClass().getResource("/images/img1.png")));
		mainpanel.add(b1);
		b1.addActionListener(this);
		b2=new JButton(new ImageIcon(getClass().getResource("/images/img2.png")));
		mainpanel.add(b2);
		b2.addActionListener(this);
		b3=new JButton(new ImageIcon(getClass().getResource("/images/img3.png")));
		b3.addActionListener(this);
		mainpanel.add(b3);
		b4=new JButton(new ImageIcon(getClass().getResource("/images/img4.png")));
		b4.addActionListener(this);
		mainpanel.add(b4);
		b5=new JButton(new ImageIcon(getClass().getResource("/images/img5.png")));
		b5.addActionListener(this);
		mainpanel.add(b5);
		b6=new JButton(new ImageIcon(getClass().getResource("/images/img6.png")));
		b6.addActionListener(this);
		mainpanel.add(b6);
		b7=new JButton(new ImageIcon(getClass().getResource("/images/img7.png")));
		b7.addActionListener(this);
		mainpanel.add(b7);
		b8=new JButton(new ImageIcon(getClass().getResource("/images/img8.png")));
		b8.addActionListener(this);
		mainpanel.add(b8);
		b9=new JButton("");
		b9.addActionListener(this);
		mainpanel.add(b9);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon img=(ImageIcon)((AbstractButton) e.getSource()).getIcon();
		
		if(e.getSource().equals(b1)){
			if(f==2){
				b2.setIcon(img);
				b1.setIcon(null);
				f=1;
			} else if(f==4){
				b4.setIcon(img);
				b1.setIcon(null);
				f=1;
			}
		}
		if(e.getSource().equals(b2)){
			if(f==1){
				b1.setIcon(img);
				b2.setIcon(null);
				f=2;
			}else if(f==3){
				b3.setIcon(img);
				b2.setIcon(null);
				f=2;
			}else if(f==5){
				b5.setIcon(img);
				b2.setIcon(null);
				f=2;
			}
		}
		if(e.getSource().equals(b3)){
			if(f==2){
				b2.setIcon(img);
				b3.setIcon(null);
				f=3;
			} else if(f==6){
				b6.setIcon(img);
				b3.setIcon(null);
				f=3;
			}
		}
		if(e.getSource().equals(b4)){
			if(f==1){
				b1.setIcon(img);
				b4.setIcon(null);
				f=4;
			}else if(f==5){
				b5.setIcon(img);
				b4.setIcon(null);
				f=4;
			}else if(f==7){
				b7.setIcon(img);
				b4.setIcon(null);
				f=4;
			}
		}
		if(e.getSource().equals(b5)){
			if(f==2){
				b2.setIcon(img);
				b5.setIcon(null);
				f=5;
			}else if(f==4){
				b4.setIcon(img);
				b5.setIcon(null);
				f=5;
			}else if(f==6){
				b6.setIcon(img);
				b5.setIcon(null);
				f=5;
			}else if(f==8){
				b8.setIcon(img);
				b5.setIcon(null);
				f=5;
			}
		}
		if(e.getSource().equals(b6)){
			if(f==3){
				b3.setIcon(img);
				b6.setIcon(null);
				f=6;
			}else if(f==5){
				b5.setIcon(img);
				b6.setIcon(null);
				f=6;
			}else if(f==9){
				b9.setIcon(img);
				b6.setIcon(null);
				f=6;
			}
		}
		if(e.getSource().equals(b7)){
			if(f==4){
				b4.setIcon(img);
				b7.setIcon(null);
				f=7;
			}else if(f==8){
				b8.setIcon(img);
				b7.setIcon(null);
				f=7;
			}
		}
		if(e.getSource().equals(b8)){
			if(f==5){
				b5.setIcon(img);
				b8.setIcon(null);
				f=8;
			}else if(f==7){
				b7.setIcon(img);
				b8.setIcon(null);
				f=8;
			}else if(f==9){
				b9.setIcon(img);
				b8.setIcon(null);
				f=8;
			}
		}
		if(e.getSource().equals(b9)){
			if(f==6){
				b6.setIcon(img);
				b9.setIcon(null);
				f=9;
			}else if(f==8){
				b8.setIcon(img);
				b9.setIcon(null);
				f=9;
			}
		}
	}

	public static void main(String args[]){
		new Puzzle();
	}
}