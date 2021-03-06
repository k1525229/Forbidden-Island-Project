// Pedro's work
package island;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class TitlePanel extends JFrame implements ActionListener {
	private JComboBox<String> diff;
	private JLabel l1, l2, l3;
	public ImageIcon lt1, lt2, lt3;
	public JButton start, temp;
	public JPanel info;
	public TitlePanel(String title)throws IOException {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0, 3));
		this.setBounds(0, 0, 32, 900);
		this.setResizable(false);
		
		String[] difficulty = {"Select Difficulty", "Novice", "Normal", "Elite", "Legendary"};
		diff = new JComboBox<String>(difficulty);
		
		l1 = new JLabel();
		lt1 = new ImageIcon("t_part_1.jpg");
		l1.setIcon(lt1);
		
		l2 = new JLabel();
		lt2 = new ImageIcon("t_part_2.jpg");
		l2.setIcon(lt2);
		
		l3 = new JLabel();
		lt3 = new ImageIcon("t_part_3.jpg");
		l3.setIcon(lt3);
		
		start = new JButton("Start Game");
		start.addActionListener(this);
		info = new JPanel();
		//change to equal Instruction Panel when Suliman is done
		
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(start);
		this.add(diff);
		this.add(info);
		this.pack();
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == start) {
			if (diff.getSelectedIndex() != 0 ) {
				System.out.println("Start a Game with difficulty: " + diff.getSelectedItem());
				//This is where you get Difficulty
			}
			else {
				System.out.println("Select Difficulty");
			}
		}
		else if {
			try {
				Scanner input = new Scanner(new File("readfrom.txt"));
				PrintWriter outfile = new PrintWriter(new File("instruction.txt"));
				while (input.hasNext()) {
					outfile.println(input.nextLine());
					outfile.close();
				}
			} 
			catch (FileNotFoundException exception) {
				exception.printStackTrace();
			}
		}
	}
}

