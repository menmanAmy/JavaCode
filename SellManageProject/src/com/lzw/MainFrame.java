package com.lzw;

import java.awt.*;

import javax.swing.*;

import com.lzw.login.LoginDialog;

public class MainFrame extends JFrame {
	private static JLabel czyStateLabel = null;
	private JPanel frameContentPane = null;
	private DesktopPanel desktopPane = null;
	private ToolBar toolBar = null;
	private MenuBar frameMenuBar = null;
	private JLabel stateLabel = null;
	
	public static void main(String arg[]) {
		SplashScreen splashScreen = SplashScreen.getSplashScreen();
		JFrame loginDialog = new LoginDialog();
		if(splashScreen != null) {
			try {
				loginDialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				
			}
		}
		
		loginDialog.setVisible(true);
	}
	
	public MainFrame() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setSize(800, 600);
		//this.setJMenuBar(getFrameMenuBar());
		this.setContentPane(getFrameContentPane());
		this.setTitle("XX销售管理系统");
	}
	
	private JPanel getFrameContentPane() {
		if (frameContentPane == null) {
			frameContentPane = new JPanel();
			frameContentPane.setLayout(new BorderLayout());
			//frameContentPane.add(getStatePanel(), SOUTH);
			frameContentPane.add(getJJToolBarBar(), BorderLayout.NORTH);
			frameContentPane.add(getDesktopPane(), BorderLayout.CENTER);
		}
		return frameContentPane;
	}
	
	private ToolBar getJJToolBarBar() {
		if (toolBar == null) {
			toolBar = new ToolBar(getFrameMenuBar());
			toolBar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		return toolBar;
	}
	
	protected MenuBar getFrameMenuBar() {
		if (frameMenuBar == null) {
			frameMenuBar = new MenuBar(getDesktopPane(), getStateLabel());
		}
		return frameMenuBar;
	}
	
	public JLabel getStateLabel() {
		if (stateLabel == null) {
			stateLabel = new JLabel();
			stateLabel.setText("当前没有选定窗体");
		}
		return stateLabel;
	}
	
	private DesktopPanel getDesktopPane() {
		if (desktopPane == null) {
			desktopPane = new DesktopPanel();
		}
		return desktopPane;
	}
	
	public static JLabel getCzyStateLabel() {
		if(null == czyStateLabel) {
			czyStateLabel = new JLabel("操作员：");
		}
		
		return czyStateLabel;
	}
}
