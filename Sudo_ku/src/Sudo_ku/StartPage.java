package Sudo_ku;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/** Frame1 is a frame with a label and a button */
public class StartPage extends JFrame
{ /** Constructor  Frame1  creates a frame with a label and button */
  public StartPage(){ 
	  JLabel label = new JLabel("���̵��� �����ϼ���    ");
	  JButton button1 = new JButton("��");
	  JButton button2 = new JButton("��");
	  JButton button3 = new JButton("��");
	  JButton Exit = new JButton("Exit");
	  Container c = getContentPane();
	  c.setLayout(new FlowLayout());
	  c.add(label);
	  c.add(button1);
	  c.add(button2);
	  c.add(button3);
	  c.add(Exit);
	  
	  button1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button1.setText("OK �� clicked.");
          }
      });

	  button2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button2.setText("Ok �� clicked.");
          }
      });

	  button3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button3.setText("OK �� clicked.");
          }
      });
	  Exit.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              Exit.setText("Cancel Button clicked.");
              System.exit(0);
          }
      });

	  setTitle("Sudoku!");
	  setSize(200, 200);			// pack();
	  setVisible(true);
	  }
  

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		new StartPage();
		

	}
  
}