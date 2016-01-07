import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {

	public MyFrame(){
		super("GUI Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton theButton = new JButton("Click me!");
		theButton.setPreferredSize(new Dimension(500,500));

		theButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					System.out.println("You clicked me!! YAY!!!");		
				}				
		});

		//pseidocode
		for(ActionListener al : listeners){
			al.actionPerformed(event);
		}




		this.add(theButton);

		this.pack();
		this.setVisible(true);
	}


	public static void main(String[] args){
		new MyFrame();
	}

}

