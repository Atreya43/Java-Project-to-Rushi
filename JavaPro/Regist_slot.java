import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit.*;
import java.sql.*;


class Regist_slot extends JFrame
{

	JLabel nocars;
	JTextField txtnocars;
	JLabel pphc;
	JTextField txtpphc;

	JLabel nobikes;
	JTextField txtnobikes;
	JLabel pphb;
	JTextField txtpphb;

	JLabel totslot;
	JTextField txttot;
	
	JButton btnsubmit;


	Regist_slot()
	{
		ImageIcon  backimg= new ImageIcon("login12.jpg");
		Image img = backimg.getImage();
		Image tmp = img.getScaledInstance(600,600,Image.SCALE_SMOOTH);
		backimg = new ImageIcon(tmp);
		JLabel background = new JLabel("",backimg,JLabel.CENTER);
		background.setBounds(0,0,600,600);

		nocars = new JLabel("Number of cars:");
		nocars.setBounds(200,20,170,30);
		txtnocars = new JTextField();
		txtnocars.setBounds(200,50,170,30);

		pphc = new JLabel("Price/Hour Cars:");
		pphc.setBounds(200,80,190,30);
		txtpphc = new JTextField();
		txtpphc.setBounds(200,110,170,30);

		nobikes = new JLabel("Number of Bikes:");
		nobikes.setBounds(200,140,170,20);
		txtnobikes = new JTextField();
		txtnobikes.setBounds(200,170,170,30);

		pphb = new JLabel("Price/Hour Bikes:");
		pphb.setBounds(200,200,190,30);
		txtpphb = new JTextField();
		txtpphb.setBounds(200,230,170,30);

		totslot = new JLabel("Total Slots");
		totslot.setBounds(200,260,170,30);
		txttot = new JTextField();
		txttot.setBounds(200,290,170,30);
		
		btnsubmit = new JButton("Submit");
		btnsubmit.setBackground(new Color(0,0,0));
		btnsubmit.setForeground(Color.BLACK);
		btnsubmit.setBounds(230,390,100,50);



		add(nocars);
		add(txtnocars);
		add(pphc);
		add(txtpphc);
		add(nobikes);
		add(txtnobikes);
		add(pphb);
		add(txtpphb);
		add(totslot);
		add(txttot);
	
		add(btnsubmit);
		add(background);

		setLayout(null);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		btnsubmit.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ee)
						{	
							int no_car = Integer.parseInt(txtnocars.getText());
							int pr_ph_car = Integer.parseInt(txtpphc.getText());
							int no_bike = Integer.parseInt(txtnobikes.getText());
							int pr_ph_bike = Integer.parseInt(txtpphb.getText());
							int total = Integer.parseInt(txttot.getText());

							try
							{
								Class.forName("com.mysql.jdbc.Driver");
								Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Regist_slot","root","Suhani@0304");
       					   		System.out.println("Database connected");
       					   		String sql = "insert into Regist (nocars,pphc,nobikes,pphb,totsolt) values (?,?,?,?,?)";
       					   		PreparedStatement preparedStmt = con.prepareStatement(sql);
       					   		preparedStmt.setInt(1,no_car);
       					   		preparedStmt.setInt(2,pr_ph_car);
       					   		preparedStmt.setInt(3,no_bike);
       					   		preparedStmt.setInt(4,pr_ph_bike);
       					   		preparedStmt.setInt(5,total);
								//preparedStmt.setInt(1,YOUR_SEQUENCE.nextval);
       					   		
       					   		preparedStmt.execute();

      							con.close();


							}
							catch(Exception e)
							{
								System.out.println(e);
							}

						}

			});
	}

	public static void main(String args[])
	{
		Regist_slot ad = new Regist_slot();
			//Home ll = new Home();
			//ll.


	}
}