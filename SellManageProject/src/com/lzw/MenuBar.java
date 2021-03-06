package com.lzw;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.lzw.iframe.*;

public class MenuBar extends JMenuBar {
	private JMenu jinhuo_Menu = null;
	private JMenuItem jinhuoItem = null;
	private Map<JMenuItem, JInternalFrame> iFrames = null;
	private int nextFrameX, nextFrameY;
	private JDesktopPane desktopPanel = null;
	private JLabel stateLabel;
	
	public MenuBar(JDesktopPane desktopPane,JLabel label) {
		super();
		iFrames = new HashMap<JMenuItem, JInternalFrame>();
		this.desktopPanel = desktopPane;
		this.stateLabel = label;
		initialize();
	}
	
	private void initialize() {
		this.setSize(new Dimension(600,24));
		add(getJinhuo_Menu());
	}
	
	public JMenu getJinhuo_Menu() {
		if(null == jinhuo_Menu) {
			jinhuo_Menu = new JMenu();
			jinhuo_Menu.setText("进货 管理（J）");
			jinhuo_Menu.add(getJinhuoItem());
		}
		
		return jinhuo_Menu;
	}
	
	public JMenuItem getJinhuoItem() {
		if(null == jinhuoItem) {
			jinhuoItem = new JMenuItem();
			jinhuoItem.setText("进货单");
			jinhuoItem.setIcon(new ImageIcon(getClass().getResource("/res/icon/jinhuodan.png")));
			jinhuoItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						createIFrame(jinhuoItem, JinHuo_IFrame.class);
				}
			});
		}
		
		return jinhuoItem;
	}
	
	private JInternalFrame createIFrame(JMenuItem item,Class cla) {
		Constructor constructor = cla.getConstructors()[0];
		JInternalFrame iFrame = iFrames.get(item);
		try {
			if(null == iFrame || iFrame.isClosed()) {
				iFrame = (JInternalFrame)constructor.newInstance(new Object[] {});
				iFrames.put(item, iFrame);
				iFrame.setFrameIcon(item.getIcon());
				iFrame.setLocation(nextFrameX, nextFrameY);
				int frameH = iFrame.getPreferredSize().height;
				int panelH = iFrame.getContentPane().getPreferredSize().height;
				int fSpace = frameH - panelH;
				nextFrameX += fSpace;
				nextFrameY += fSpace;
				if(nextFrameX + iFrame.getWidth() > desktopPanel.getWidth())
					nextFrameX = 0;
				if(nextFrameY + iFrame.getHeight() > desktopPanel.getHeight())
					nextFrameY = 0;
				desktopPanel.add(iFrame);
				iFrame.setResizable(false);
				iFrame.setMaximizable(false);
				iFrame.setVisible(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return iFrame;
	}
}
