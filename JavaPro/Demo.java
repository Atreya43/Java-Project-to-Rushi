import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Demo extends JFrame
{
	Demo()
	{
		//Font
		Font f = new Font("Sen-Serif",Font.BOLD,30);



		//Header
		JPanel heading;
		heading = new JPanel();
		heading.setBackground(new Color(0,0,0,80));
		

		heading.setBounds(0,0,900,100);
		JLabel name = new JLabel("WELCOME TO PARKING TOKEN MASTER LOGIN");
		name.setForeground(Color.WHITE);
		name.setBounds(200,50,400,50);
		name.setFont(f);
		heading.add(name);


		//LOGIN PANEL
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setSize(400,350);
		login.setBackground(new Color(0,0,0,60));
		login.setBounds(250,130,400,350);
		

		JLabel l1=new JLabel("Username");
		l1.setBounds(50,5,300,50);
		l1.setForeground(Color.WHITE);
		l1.setOpaque(false);
		l1.setBackground(new Color(153,153,153,50));
		login.add(l1);

		JTextField username = new JTextField("Username");
		username.setBounds(50,50,300,50);
		username.setForeground(Color.WHITE);
		username.setOpaque(false);
		username.setBackground(new Color(153,153,153,50));
		login.add(username);

		JLabel l2=new JLabel("Password");
		l2.setBounds(50,100,300,50);
		l2.setForeground(Color.WHITE);
		l2.setOpaque(false);
		l2.setBackground(new Color(153,153,153,50));
		login.add(l2);

		JPasswordField password = new JPasswordField("Password");
		password.setBounds(50,150,300,50);
		password.setForeground(Color.WHITE);
		password.setOpaque(false);
		password.setBackground(new Color(153,153,153,50));
		login.add(password);

		JButton signin = new JButton("Sign IN");
		signin.setBounds(50,250,100,50);
		signin.setBackground(new Color(160,182,45));
		login.add(signin);

		
		JButton showDialogButton = new JButton("Sign IN");
		signin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String uname = username.getText();
				String passwd = password.getText();
				int m = uname.compareTo("Atreya");
				int n = passwd.compareTo("atreya0304");
				if(m == 0 && n == 0)
				{
					System.out.println("You are successfully signed in");
				}
				else
				{
					System.out.println("UserId or Password is incorrect");
				}
				

			}
		});
		
		//frame
		setSize(900,600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		



		//Background
		ImageIcon background_image = new ImageIcon("login2.jpg");
		
		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		

		background.add(login);
		background.add(heading);
		background.setBounds(0,0,900,600);
		add(background);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Demo();	

	}
}



