package com.lzw.iframe;


import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.lzw.dao.Dao;

public class BackupAndRestore extends JInternalFrame {
	private JTextField backupTextField;
	private JTextField restoreTextField;
	private JPanel backupPanel;
	private JPanel restorePanel;
	private JButton backupButton;
	private JButton browseButton1;
	private JButton restoreButton;
	private JButton browseButton2;
	
	/**
	 * Create the frame.
	 */
	public BackupAndRestore() {
		setNormalBounds(new Rectangle(0, 0, 470, 220));
		setTitle("\u6570\u636E\u5E93\u5907\u4EFD\u4E0E\u6062\u590D");
		setBounds(100, 100, 450, 300);
		
		backupPanel = new JPanel();
		backupPanel.setBorder(new TitledBorder(null, "\u6570\u636E\u5E93\u5907\u4EFD", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(backupPanel, BorderLayout.NORTH);
		GridBagLayout gbl_backupPanel = new GridBagLayout();
		gbl_backupPanel.rowHeights = new int[] {10, 30, 30};
		gbl_backupPanel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0};
		gbl_backupPanel.rowWeights = new double[]{0.0, 0.0, 0.0};
		backupPanel.setLayout(gbl_backupPanel);
		
		backupTextField = new JTextField();
		GridBagConstraints gbc_backupTextField = new GridBagConstraints();
		gbc_backupTextField.gridwidth = 4;
		gbc_backupTextField.insets = new Insets(0, 0, 5, 5);
		gbc_backupTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_backupTextField.gridx = 0;
		gbc_backupTextField.gridy = 1;
		backupPanel.add(backupTextField, gbc_backupTextField);
		backupTextField.setColumns(10);
		
		backupButton = new JButton("\u5907\u4EFD");
		setBackupButton();
		GridBagConstraints gbc_backupButton = new GridBagConstraints();
		gbc_backupButton.insets = new Insets(0, 0, 0, 5);
		gbc_backupButton.gridx = 3;
		gbc_backupButton.gridy = 2;
		backupPanel.add(backupButton, gbc_backupButton);
		
		browseButton1 = new JButton("\u6D4F\u89C8\u2026\u2026");
		getBrowseButton1();
		GridBagConstraints gbc_browseButton1 = new GridBagConstraints();
		gbc_browseButton1.gridx = 1;
		gbc_browseButton1.gridy = 2;
		backupPanel.add(browseButton1, gbc_browseButton1);
		
		restorePanel = new JPanel();
		restorePanel.setBorder(new TitledBorder(null, "\u6570\u636E\u5E93\u6062\u590D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(restorePanel, BorderLayout.SOUTH);
		GridBagLayout gbl_restorePanel = new GridBagLayout();
		gbl_restorePanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_restorePanel.rowHeights = new int[] {30, 30, 30};
		gbl_restorePanel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_restorePanel.rowWeights = new double[]{0.0, 0.0, 0.0};
		restorePanel.setLayout(gbl_restorePanel);
		
		restoreTextField = new JTextField();
		GridBagConstraints gbc_restoreTextField = new GridBagConstraints();
		gbc_restoreTextField.gridwidth = 4;
		gbc_restoreTextField.insets = new Insets(0, 0, 5, 5);
		gbc_restoreTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_restoreTextField.gridx = 0;
		gbc_restoreTextField.gridy = 1;
		restorePanel.add(restoreTextField, gbc_restoreTextField);
		restoreTextField.setColumns(10);
		
		restoreButton = new JButton("\u6062\u590D");
		setRestoreButton();
		GridBagConstraints gbc_restoreButton = new GridBagConstraints();
		gbc_restoreButton.insets = new Insets(0, 0, 0, 5);
		gbc_restoreButton.gridx = 3;
		gbc_restoreButton.gridy = 2;
		restorePanel.add(restoreButton, gbc_restoreButton);
		
		browseButton2 = new JButton("\u6D4F\u89C8\u2026\u2026");
		getBrowseButton2();
		GridBagConstraints gbc_browseButton2 = new GridBagConstraints();
		gbc_browseButton2.gridx = 1;
		gbc_browseButton2.gridy = 2;		
		restorePanel.add(browseButton2, gbc_browseButton2);

	}
	
	private void setBackupButton() {
		backupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = backupTextField.getText();
				File backupFile = new File(path);
				
				String sql = "backup database db_database_28 to DISK='"
						+ backupFile.getAbsolutePath() + "'";
				try {
					Dao.restoreOrBackup(sql);
				}catch(Exception excpt) {
					excpt.printStackTrace();
					JOptionPane.showMessageDialog(BackupAndRestore.this, excpt.getMessage());
				}
				
				JOptionPane.showMessageDialog(BackupAndRestore.this,"备份成功");
			}
		});
	}
	
	private void setRestoreButton() {
		restoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = restoreTextField.getText();
				File restoreFile = new File(path);
				
				String sql = "restore database db_database_28 from DISK='"
						+ restoreFile.getAbsolutePath() + "'";
				try {
					Dao.restoreOrBackup(sql);
				}catch(Exception excpt) {
					excpt.printStackTrace();
					JOptionPane.showMessageDialog(BackupAndRestore.this, excpt.getMessage());
				}
				
				JOptionPane.showMessageDialog(BackupAndRestore.this,"恢复成功");
			}
		});
	}
	
	private void getBrowseButton2() {		
			
			browseButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser dirChooser = new JFileChooser(".");
					int option = dirChooser.showOpenDialog(BackupAndRestore.this);
					if(option == JFileChooser.APPROVE_OPTION) {
						File selFile = dirChooser.getSelectedFile();
						restoreTextField.setText(selFile.getAbsolutePath());
					}
				}
			});

	}
	
	private void getBrowseButton1() {
				
			browseButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser dirChooser = new JFileChooser(".");
					int option = dirChooser.showOpenDialog(BackupAndRestore.this);
					if(option == JFileChooser.APPROVE_OPTION) {
						File selFile = dirChooser.getSelectedFile();
						backupTextField.setText(selFile.getAbsolutePath());
					}
				}
			});
	}

}
