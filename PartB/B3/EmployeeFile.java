import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*import java.io.File;
import java.io.FileWriter;
import java.io.IOException;*/
import java.io.*;
import javax.swing.*;

public class EmployeeFile 
{
	//private static Color black;

	public static void main(String[] args) 
	{
		JFrame frameobj = new JFrame();  //creating frame
		frameobj.setSize(500, 500);  //declaring frame size
		frameobj.setTitle("Employee Database");//declaring frame title

		GridLayout g1=new GridLayout(5,2);  // layout of the frame
		frameobj.setLayout(g1);				//layout is set to the frame created
		
		JPanel p1=new JPanel();  //creating panels
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		JPanel p6=new JPanel();
		JPanel p7=new JPanel();
		JPanel p8=new JPanel();
		JPanel p9=new JPanel();
		JPanel p10=new JPanel();
		
		JLabel l1=new JLabel("NAME");  //creating labels
		JLabel l2=new JLabel("ID");
		JLabel l3=new JLabel("DOJ");
		JLabel l4=new JLabel("DOB");
		
		JTextField t1=new JTextField();   //create obj for txtfield
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JTextField t4=new JTextField();
		
		t1.setPreferredSize(new Dimension(200,30)); //size of txtfield
		t2.setPreferredSize(new Dimension(200,30));
		t3.setPreferredSize(new Dimension(200,30));
		t4.setPreferredSize(new Dimension(200,30));
		
		JButton b1=new JButton("SUBMIT");
		JButton b2=new JButton("RESET");
		
		b1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				File fileobj=new File("/home/deepak/Desktop/1.txt");
				try 
				{
					FileWriter fw=new FileWriter(fileobj.getAbsoluteFile(),true);
					System.out.println("\n NAME : " +t1.getText()  +"\n"  +"ID : " +t2.getText()  +"\n"  +"DOJ : " +t3.getText()  +"\n"  +"DOB : "+t4.getText() +"\n");
					fw.write("\n NAME : " +t1.getText()  +"\n"  +"ID : " +t2.getText()  +"\n"  +"DOJ : " +t3.getText()  +"\n"  +"DOB : "+t4.getText() +"\n");
					fw.close();
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}	
			}
		});
		
		b2.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				t1.setText(" ");
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
			}
		});
		p1.add(l1);   //add labels to panels where labels=name,id,doj,dob
		p3.add(l2);
		p5.add(l3);
		p7.add(l4);
		
		p2.add(t1);   //add textfield to panels where txtfield is user defined
		p4.add(t2);
		p6.add(t3);
		p8.add(t4);
		
		p9.add(b1);    //add buttons to panel
		p10.add(b2);
		
		
		//l1.setBorder(BorderFactory.createLineBorder(Color.black));
		//l1.setBorder(BorderFactory.createLineBorder(black,10));
		//l2.setBorder(BorderFactory.createLineBorder(black,10));
		//l3.setBorder(BorderFactory.createLineBorder(black,10));
		//l4.setBorder(BorderFactory.createLineBorder(black,10));
		
		frameobj.add(p1);  //add panels to frames
		frameobj.add(p2);
		frameobj.add(p3);
		frameobj.add(p4);
			
		frameobj.add(p5);
		frameobj.add(p6);
		frameobj.add(p7);
		frameobj.add(p8);
		
		frameobj.add(p9);
		frameobj.add(p10);
		
		frameobj.setVisible(true);
	}
}
