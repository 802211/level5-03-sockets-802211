package _02_Chat_Application;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import _00_Click_Chat.networking.Server;
import _01_Intro_To_Sockets.client.ClientGreeter;
import _01_Intro_To_Sockets.server.ServerGreeter;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp {
JButton button = new JButton("button");
	JFrame f = new JFrame();
	
	ServerGreeter sg;
	ClientGreeter cg;
	
	public static void main(String[] args) {
		new ChatApp();
	}
	
	public ChatApp() {
		
		int response = JOptionPane.showConfirmDialog(null, "Do you want to host a connection?", "Connection?", JOptionPane.YES_NO_OPTION);
		
		if(response == JOptionPane.YES_OPTION) {
		Server s = new Server(5385);
		JOptionPane.showMessageDialog(null, "Server: /n   IPAddress:" + s.getIPAddress() + "/n   port: ");
			button.addActionListener((l)->{
				s.sendClick();
			});
		f.add(button);
		f.setVisible(true);
		f.setSize(500, 500);
		
		
		}
		else {
			
		}
		
	}
	
}
