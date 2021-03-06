package com.lzw.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.lzw.MainFrame;
import com.lzw.dao.Dao;

public class LoginDialog extends JFrame{
	private LoginPanel loginPanel = null;
	private JLabel jLabelUsr = null;
	private JLabel jLabelPwd = null;
	private JTextField userField = null;
	private JPasswordField passwordField = null;
	private JButton loginButton = null;
	private JButton exitButton = null;
	private MainFrame mainFrame = null;
	private String userStr;
	
	public LoginDialog() {
		try {
			mainFrame = new MainFrame();
			initialize();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initialize() {
		Dimension size = getToolkit().getScreenSize();
		setLocation((size.width - 296) / 2, (size.height - 188) / 2);
		setSize(296, 188);
		this.setTitle("系统登录");
		setContentPane(getLoginPanel());
	}
	
	private LoginPanel getLoginPanel() {
		jLabelUsr = new JLabel();
		jLabelUsr.setBounds(new Rectangle(85,41,56,18));
		jLabelUsr.setText("用 户");
		jLabelPwd = new JLabel();
		jLabelPwd.setBounds(new Rectangle(86,71,55,18));
		jLabelPwd.setText("密 码");
		loginPanel = new LoginPanel();
		loginPanel.setLayout(null);
		loginPanel.setBackground(new Color(0xD8DDC7));
		loginPanel.add(jLabelUsr,null);
		loginPanel.add(getUserField(),null);
		loginPanel.add(jLabelPwd,null);
		loginPanel.add(getPasswordField(),null);
		loginPanel.add(getLoginButton(),null);
		loginPanel.add(getExitButton(),null);
		
		return loginPanel;
	}
	
	private JTextField getUserField() {
		if(null == userField) {
			userField = new JTextField();
			userField.setBounds(new Rectangle(142, 39, 127, 22));
		}
		
		return userField;
	}
	
	private JPasswordField getPasswordField() {
		if(null == passwordField) {
			passwordField = new JPasswordField();
			passwordField.setBounds(new Rectangle(143, 69, 125, 22));
			passwordField.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					if(e.getKeyChar() == '\n')
						loginButton.doClick();
				}
			});
		}
		
		return passwordField;
	}
	
	private JButton getLoginButton() {
		loginButton = new JButton();
		loginButton.setBounds(new Rectangle(109, 114, 48, 20));
		loginButton.setIcon(new ImageIcon(getClass().getResource("/res/loginButton.jpg")));
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try {
					userStr = userField.getText();
					String pwdStr = new String(passwordField.getPassword());
			
					if(!Dao.checkLogin(userStr,pwdStr)) {
						JOptionPane.showMessageDialog(LoginDialog.this,"用户名与密码无法登录\", \"登录失败");
						return;
					}
				}catch(Exception expt) {
					expt.printStackTrace();
				}
			
				mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				mainFrame.setVisible(true);
				mainFrame.getCzyStateLabel().setText(userStr);
				setVisible(false);
			}
		});
		
		return loginButton;
	}
	
	private JButton getExitButton() {
		exitButton = new JButton();
		exitButton.setBounds(new Rectangle(181, 114, 48, 20));
		exitButton.setIcon(new ImageIcon(getClass().getResource("/res/exitButton.jpg")));
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		return exitButton;
	}
}
