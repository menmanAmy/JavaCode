package com.lzw.iframe;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

import com.lzw.Item;
import com.lzw.MainFrame;
import com.lzw.dao.Dao;
import com.lzw.dao.model.TbRukuDetail;
import com.lzw.dao.model.TbRukuMain;
import com.lzw.dao.model.TbSpinfo;

public class JinHuo_IFrame extends JInternalFrame {
	private JTable table;
	private JTextField idField;
	private JTextField textField_1;
	private JTextField jhsjField;
	private JTextField pzsField;
	private JTextField textField_4;
	private JTextField hjjeField;
	private JTextField ysjlField;
	private JTextField czyField;
	private JComboBox jsfsComboBox;
	private JComboBox jsrComboBox;
	private JComboBox gysComboBox;
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public JinHuo_IFrame() {
		setClosable(true);
		setMaximizable(true);
		setResizable(true);
		setIconifiable(true);
		setTitle("\u8FDB\u8D27\u5355");
		setBounds(100, 100, 600, 320);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		setTopPanel();
		panel.add(topPanel, BorderLayout.NORTH);
		
		
		
		setBottomPane();
		panel.add(bottomPanel, BorderLayout.SOUTH);
		
		
		
		setTablePane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		

	}
	
	public void setBottomPane() {
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {30, 30, 30, 30, 30, 30, 30};
		gbl_panel_2.rowHeights = new int[] {30, 30};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0};
		bottomPanel.setLayout(gbl_panel_2);
		
		JLabel label = new JLabel("\u54C1\u79CD\u6570\u91CF");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		bottomPanel.add(label, gbc_label);
		
		pzsField = new JTextField();
		pzsField.setEditable(false);
		GridBagConstraints gbc_pzsField = new GridBagConstraints();
		gbc_pzsField.insets = new Insets(0, 0, 5, 5);
		gbc_pzsField.weightx = 1.0;
		gbc_pzsField.fill = GridBagConstraints.HORIZONTAL;
		gbc_pzsField.gridx = 1;
		gbc_pzsField.gridy = 0;
		bottomPanel.add(pzsField, gbc_pzsField);
		pzsField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8D27\u54C1\u603B\u6570");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 0;
		bottomPanel.add(label_1, gbc_label_1);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.weightx = 1.0;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 0;
		bottomPanel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5408\u8BA1\u91D1\u989D");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 0;
		bottomPanel.add(label_2, gbc_label_2);
		
		hjjeField = new JTextField();
		hjjeField.setEditable(false);
		GridBagConstraints gbc_hjjeField = new GridBagConstraints();
		gbc_hjjeField.insets = new Insets(0, 0, 5, 5);
		gbc_hjjeField.weightx = 0.6;
		gbc_hjjeField.gridwidth = 2;
		gbc_hjjeField.anchor = GridBagConstraints.WEST;
		gbc_hjjeField.fill = GridBagConstraints.HORIZONTAL;
		gbc_hjjeField.gridx = 5;
		gbc_hjjeField.gridy = 0;
		bottomPanel.add(hjjeField, gbc_hjjeField);
		hjjeField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u9A8C\u6536\u7ED3\u8BBA");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 0, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		bottomPanel.add(label_3, gbc_label_3);
		
		ysjlField = new JTextField();
		GridBagConstraints gbc_ysjlField = new GridBagConstraints();
		gbc_ysjlField.weightx = 1.0;
		gbc_ysjlField.insets = new Insets(0, 0, 0, 5);
		gbc_ysjlField.fill = GridBagConstraints.HORIZONTAL;
		gbc_ysjlField.gridx = 1;
		gbc_ysjlField.gridy = 1;
		bottomPanel.add(ysjlField, gbc_ysjlField);
		ysjlField.setColumns(10);
		
		JLabel label_4 = new JLabel("\u64CD\u4F5C\u5458");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 0, 5);
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 1;
		bottomPanel.add(label_4, gbc_label_4);
		
		czyField = new JTextField();
		czyField.setEditable(false);
		czyField.setText(MainFrame.getCzyStateLabel().getText());
		GridBagConstraints gbc_czyField = new GridBagConstraints();
		gbc_czyField.insets = new Insets(0, 0, 0, 5);
		gbc_czyField.fill = GridBagConstraints.HORIZONTAL;
		gbc_czyField.gridx = 3;
		gbc_czyField.gridy = 1;
		bottomPanel.add(czyField, gbc_czyField);
		czyField.setColumns(10);
		
		JButton tjButton = new JButton("\u6DFB\u52A0");
		GridBagConstraints gbc_tjButton = new GridBagConstraints();
		gbc_tjButton.insets = new Insets(0, 0, 0, 5);
		gbc_tjButton.gridx = 5;
		gbc_tjButton.gridy = 1;
		setTjButton(tjButton);
		bottomPanel.add(tjButton, gbc_tjButton);
		
		JButton rkButton = new JButton("\u5165\u5E93");
		GridBagConstraints gbc_rkButton = new GridBagConstraints();
		gbc_rkButton.insets = new Insets(0, 0, 0, 5);
		gbc_rkButton.gridx = 6;
		gbc_rkButton.gridy = 1;
		setRkButton(rkButton);
		bottomPanel.add(rkButton, gbc_rkButton);
	}
	
	private void setTjButton(JButton tjButton) {
		tjButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopTableCellEditing();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Vector());
			}
		});
	}
	
	private void setRkButton(JButton rkButton) {
		rkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopTableCellEditing(); // 结束表格中没有编写的单元
				String pzsStr = pzsField.getText(); // 品种数
				String jeStr = hjjeField.getText(); // 合计金额
				String jsfsStr = jsfsComboBox.getSelectedItem().toString(); // 结算方式
				String jsrStr = jsrComboBox.getSelectedItem() + ""; // 经手人
				String czyStr = jsrComboBox.getSelectedItem() + ""; // 操作员
				String rkDate = jhsjField.getText(); // 入库时间
				String ysjlStr = ysjlField.getText().trim(); // 验收结论
				String id = idField.getText(); // 票号
				String gysName = gysComboBox.getSelectedItem() + "";// 供应商名字
				
				TbRukuMain rkMain = new TbRukuMain(id, pzsStr, jeStr,
						ysjlStr, gysName, rkDate, czyStr, jsrStr, jsfsStr);
				Set<TbRukuDetail> set = rkMain.getTbRukuDetails();
				int rows = table.getRowCount();
				for(int i = 0;i < rows;i++) {
					TbSpinfo spInfo = (TbSpinfo)table.getValueAt(i, 0);
					if(spInfo == null || spInfo.getId() == null ||
							spInfo.getId().isEmpty())
						continue;
					String dj = (String)table.getValueAt(i, 6);
					Integer sl = Integer.valueOf((String)table.getValueAt(i, 7));
					TbRukuDetail rkDetail = new TbRukuDetail();
					rkDetail.setSpId(spInfo.getId());
					rkDetail.setDj(dj);
					rkDetail.setSl(sl);
					rkDetail.setTbRukuMain(rkMain.getRkid());
					set.add(rkDetail);
				}
				
				Dao.insertRkInfo(rkMain);
			}
		});
	}
	
	private void stopTableCellEditing() {
		TableCellEditor cellEditor = table.getCellEditor();
		if(null != cellEditor) {
			cellEditor.stopCellEditing();
		}
	}
	
	public void setTablePane() {
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5546\u54C1\u540D\u79F0", "\u5546\u54C1\u7F16\u53F7", "\u4EA7\u5730", "\u5355\u4F4D", "\u89C4\u683C", "\u5305\u88C5", "\u5355\u4EF7", "\u6570\u91CF"
			}
		));
		//scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);
	}
	
	public void setTopPanel(){
		
		GridBagLayout gbl_topPanel = new GridBagLayout();
		gbl_topPanel.columnWidths = new int[] {30, 30, 30, 30, 30, 30};
		gbl_topPanel.rowHeights = new int[] {30, 0};
		gbl_topPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0};
		gbl_topPanel.rowWeights = new double[]{0.0, 0.0};
		topPanel.setLayout(gbl_topPanel);
		
		JLabel label = new JLabel("\u8FDB\u8D27\u7968\u53F7");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		topPanel.add(label, gbc_label);
		
		idField = new JTextField();
		GridBagConstraints gbc_idField = new GridBagConstraints();
		gbc_idField.weightx = 1.0;
		gbc_idField.insets = new Insets(0, 0, 5, 5);
		gbc_idField.fill = GridBagConstraints.HORIZONTAL;
		gbc_idField.gridx = 1;
		gbc_idField.gridy = 0;
		topPanel.add(idField, gbc_idField);
		idField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u4F9B\u5E94\u5546");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 0;
		topPanel.add(label_1, gbc_label_1);
		
		gysComboBox = new JComboBox();
		GridBagConstraints gbc_gysComboBox = new GridBagConstraints();
		gbc_gysComboBox.weightx = 1.0;
		gbc_gysComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_gysComboBox.fill = GridBagConstraints.BOTH;
		gbc_gysComboBox.gridx = 3;
		gbc_gysComboBox.gridy = 0;
		setGysComBox(gysComboBox);
		topPanel.add(gysComboBox, gbc_gysComboBox);
		
		JLabel label_2 = new JLabel("\u8054\u7CFB\u4EBA");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 0;
		topPanel.add(label_2, gbc_label_2);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 5;
		gbc_textField_1.gridy = 0;
		topPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("\u7ED3\u7B97\u65B9\u5F0F");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		topPanel.add(label_3, gbc_label_3);
		
		jsfsComboBox = new JComboBox();
		GridBagConstraints gbc_jsfsComboBox = new GridBagConstraints();
		gbc_jsfsComboBox.weightx = 1.0;
		gbc_jsfsComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_jsfsComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_jsfsComboBox.gridx = 1;
		gbc_jsfsComboBox.gridy = 1;
		topPanel.add(jsfsComboBox, gbc_jsfsComboBox);
		
		JLabel lblNewLabel = new JLabel("\u8FDB\u8D27\u65F6\u95F4");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		topPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		jhsjField = new JTextField();
		GridBagConstraints gbc_jhsjField = new GridBagConstraints();
		gbc_jhsjField.weightx = 1.0;
		gbc_jhsjField.insets = new Insets(0, 0, 5, 5);
		gbc_jhsjField.fill = GridBagConstraints.HORIZONTAL;
		gbc_jhsjField.gridx = 3;
		gbc_jhsjField.gridy = 1;
		topPanel.add(jhsjField, gbc_jhsjField);
		jhsjField.setColumns(10);
		
		JLabel label_4 = new JLabel("\u7ECF\u624B\u4EBA");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 4;
		gbc_label_4.gridy = 1;
		topPanel.add(label_4, gbc_label_4);
		
		jsrComboBox = new JComboBox();
		GridBagConstraints gbc_jsrComboBox = new GridBagConstraints();
		gbc_jsrComboBox.weightx = 1.0;
		gbc_jsrComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_jsrComboBox.fill = GridBagConstraints.BOTH;
		gbc_jsrComboBox.gridx = 5;
		gbc_jsrComboBox.gridy = 1;
		topPanel.add(jsrComboBox, gbc_jsrComboBox);
	}
	
	public void setGysComBox(JComboBox gysComboBox) {
		List gysInfo = Dao.getGysInfos();
		for(Iterator iter = gysInfo.iterator();iter.hasNext();) {
			List list = (List)iter.next();
			Item item = new Item();
			item.setId(list.get(0).toString().trim());
			item.setName(list.get(1).toString().trim());
			gysComboBox.addItem(item);
		}
	}

}
