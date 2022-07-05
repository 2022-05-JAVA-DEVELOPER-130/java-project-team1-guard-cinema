package com.itwill.gc.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ScrollPaneConstants;

public class guardMainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField idTF;
	private JTextField passwordTF;
	private JTextField nameTF;
	private JTextField juminTF;
	private JTextField phoneTF;
	private JTextField emailTF;
	private JTextField loginIdTF;
	private JTextField loginPasswordTF;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable gongjiTable;
	private JTextField g_noTF;
	private JTextField g_categoryTF;
	private JTextField g_titleTF;
	private JTextField g_dateTF;
	private JTextField m_noTF;
	private JTextField m_categoryTF;
	private JTextField m_titleTF;
	private JTable categoryTable;
	private JTextField q_titleTF;
	private JTable questionListTable;
	private JTextField p_noTF;
	private JTextField p_oneCateTF;
	private JTextField p_twoCateTF;
	private JTextField p_titleTF;
	private JPanel foodListPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guardMainFrame frame = new guardMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public guardMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel moviePanel = new JPanel();
		tabbedPane.addTab("영화", null, moviePanel, null);
		moviePanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		moviePanel.add(tabbedPane_1);
		
		JPanel movieListIngPanel = new JPanel();
		tabbedPane_1.addTab("상영영화", null, movieListIngPanel, null);
		
		JPanel movieListFeaPanel = new JPanel();
		tabbedPane_1.addTab("개봉예정", null, movieListFeaPanel, null);
		
		JPanel reserveOnePanel = new JPanel();
		tabbedPane_1.addTab("예매", null, reserveOnePanel, null);
		
		JPanel seatPanel = new JPanel();
		tabbedPane_1.addTab("좌석", null, seatPanel, null);
		
		JPanel reserveListPanel = new JPanel();
		tabbedPane_1.addTab("예매내역", null, reserveListPanel, null);
		
		JPanel reviewPanel = new JPanel();
		tabbedPane_1.addTab("리뷰", null, reviewPanel, null);
		
		JPanel productPanel = new JPanel();
		tabbedPane.addTab("상품", null, productPanel, null);
		productPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		productPanel.add(tabbedPane_2, BorderLayout.CENTER);
	/**************************************************************/
		
		JPanel cartPanel = new JPanel();
		tabbedPane_2.addTab("장바구니", null, cartPanel, null);
		
		JPanel receiptPanel = new JPanel();
		tabbedPane_2.addTab("구매내역", null, receiptPanel, null);
		
		JPanel foodPanel = new JPanel();
		tabbedPane_2.addTab("상품", null, foodPanel, null);
		foodPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		foodPanel.add(scrollPane_3, BorderLayout.CENTER);
		
		foodListPanel = new JPanel();
		foodListPanel.setPreferredSize(new Dimension(10, 800));
		foodListPanel.setBackground(Color.PINK);
		scrollPane_3.setViewportView(foodListPanel);
		/******************************************productItemPanel***************/
		JPanel productItemPanel = new JPanel();
		productItemPanel.setLayout(null);
		productItemPanel.setPreferredSize(new Dimension(350, 130));
		
		
		JLabel productImageLB = new JLabel("");
		productImageLB.setIcon(new ImageIcon(guardMainFrame.class.getResource("/images/50shaipei.jpg")));
		productImageLB.setBounds(8, 4, 82, 73);
		productItemPanel.add(productImageLB);
		
		JLabel productNameLB = new JLabel("반반콤보");
		productNameLB.setFont(new Font("굴림", Font.BOLD, 16));
		productNameLB.setBounds(102, 4, 99, 15);
		productItemPanel.add(productNameLB);
		
		JLabel productDescLB = new JLabel("<html>ㅇㄴㄹㄴ어ㅏ론어ㅏ런오ㅓㅏ론어ㅓ<br>란어ㅏㄹㄴㅇ</html>");
		productDescLB.setBounds(100, 29, 214, 30);
		productItemPanel.add(productDescLB);
		
		JLabel productPriceLB = new JLabel("16,000");
		productPriceLB.setBounds(110, 69, 57, 15);
		productItemPanel.add(productPriceLB);
		foodListPanel.add(productItemPanel);
	  /*************************************productItemPanel*******************/
		
		
		
		
		
		JPanel userPanel = new JPanel();
		tabbedPane.addTab("회원", null, userPanel, null);
		userPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		userPanel.add(tabbedPane_3, BorderLayout.CENTER);
		
		JPanel joinPanel = new JPanel();
		tabbedPane_3.addTab("회원가입", null, joinPanel, null);
		joinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(60, 48, 57, 15);
		joinPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(60, 103, 57, 15);
		joinPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(60, 162, 57, 15);
		joinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주민번호");
		lblNewLabel_3.setBounds(60, 216, 57, 15);
		joinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("휴대폰번호");
		lblNewLabel_4.setBounds(60, 271, 71, 15);
		joinPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("이메일");
		lblNewLabel_5.setBounds(60, 327, 57, 15);
		joinPanel.add(lblNewLabel_5);
		
		idTF = new JTextField();
		idTF.setBounds(143, 45, 116, 21);
		joinPanel.add(idTF);
		idTF.setColumns(10);
		
		passwordTF = new JTextField();
		passwordTF.setColumns(10);
		passwordTF.setBounds(143, 100, 116, 21);
		joinPanel.add(passwordTF);
		
		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(143, 159, 116, 21);
		joinPanel.add(nameTF);
		
		juminTF = new JTextField();
		juminTF.setColumns(10);
		juminTF.setBounds(143, 213, 116, 21);
		joinPanel.add(juminTF);
		
		phoneTF = new JTextField();
		phoneTF.setColumns(10);
		phoneTF.setBounds(143, 268, 116, 21);
		joinPanel.add(phoneTF);
		
		emailTF = new JTextField();
		emailTF.setColumns(10);
		emailTF.setBounds(143, 324, 116, 21);
		joinPanel.add(emailTF);
		
		JButton joinBtn = new JButton("가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idTF.getText();
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		joinBtn.setBounds(72, 410, 97, 23);
		joinPanel.add(joinBtn);
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.setBounds(214, 410, 97, 23);
		joinPanel.add(cancleBtn);
		
		JLabel lblNewLabel_6 = new JLabel("*");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(271, 48, 57, 15);
		joinPanel.add(lblNewLabel_6);
		
		JPanel loginPanel = new JPanel();
		tabbedPane_3.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("아이디");
		lblNewLabel_7.setBounds(64, 110, 57, 15);
		loginPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("비밀번호");
		lblNewLabel_7_1.setBounds(64, 176, 57, 15);
		loginPanel.add(lblNewLabel_7_1);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(195, 107, 116, 21);
		loginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPasswordTF = new JTextField();
		loginPasswordTF.setColumns(10);
		loginPasswordTF.setBounds(195, 173, 116, 21);
		loginPanel.add(loginPasswordTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.setBounds(64, 303, 97, 23);
		loginPanel.add(loginBtn);
		
		JButton cancleBtn2 = new JButton("취소");
		cancleBtn2.setBounds(214, 303, 97, 23);
		loginPanel.add(cancleBtn2);
		
		JPanel changePanel = new JPanel();
		tabbedPane_3.addTab("정보수정", null, changePanel, null);
		changePanel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("아이디");
		lblNewLabel_8.setBounds(45, 49, 57, 15);
		changePanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("비밀번호");
		lblNewLabel_8_1.setBounds(45, 95, 57, 15);
		changePanel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("이름");
		lblNewLabel_8_2.setBounds(45, 145, 57, 15);
		changePanel.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("주민번호");
		lblNewLabel_8_3.setBounds(45, 199, 57, 15);
		changePanel.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("휴대폰번호");
		lblNewLabel_8_4.setBounds(45, 256, 65, 15);
		changePanel.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("이메일");
		lblNewLabel_8_5.setBounds(45, 310, 57, 15);
		changePanel.add(lblNewLabel_8_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(182, 46, 116, 21);
		changePanel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(182, 92, 116, 21);
		changePanel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(182, 142, 116, 21);
		changePanel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(182, 196, 116, 21);
		changePanel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(182, 253, 116, 21);
		changePanel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(182, 307, 116, 21);
		changePanel.add(textField_11);
		
		JButton memberUpdateBtn = new JButton("수정");
		memberUpdateBtn.setBounds(64, 396, 97, 23);
		changePanel.add(memberUpdateBtn);
		
		JButton memberDeleteBtn = new JButton("삭제");
		memberDeleteBtn.setBounds(210, 396, 97, 23);
		changePanel.add(memberDeleteBtn);
		
		JPanel centerPanel = new JPanel();
		tabbedPane.addTab("고객센터", null, centerPanel, null);
		centerPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		centerPanel.add(tabbedPane_4, BorderLayout.CENTER);
		
		JPanel gongjiPanel = new JPanel();
		tabbedPane_4.addTab("공지사항", null, gongjiPanel, null);
		gongjiPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 356, 165);
		gongjiPanel.add(scrollPane);
		
		gongjiTable = new JTable();
		gongjiTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uCE74\uD14C\uACE0\uB9AC", "\uC81C\uBAA9", "\uB4F1\uB85D\uC77C"
			}
		));
		gongjiTable.getColumnModel().getColumn(0).setPreferredWidth(37);
		gongjiTable.getColumnModel().getColumn(2).setPreferredWidth(99);
		gongjiTable.getColumnModel().getColumn(3).setPreferredWidth(72);
		scrollPane.setViewportView(gongjiTable);
		
		g_noTF = new JTextField();
		g_noTF.setBounds(12, 185, 31, 21);
		gongjiPanel.add(g_noTF);
		g_noTF.setColumns(10);
		
		g_categoryTF = new JTextField();
		g_categoryTF.setBounds(12, 216, 91, 21);
		gongjiPanel.add(g_categoryTF);
		g_categoryTF.setColumns(10);
		
		g_titleTF = new JTextField();
		g_titleTF.setBounds(111, 216, 152, 21);
		gongjiPanel.add(g_titleTF);
		g_titleTF.setColumns(10);
		
		JTextArea g_contentTA = new JTextArea();
		g_contentTA.setBounds(12, 247, 356, 236);
		gongjiPanel.add(g_contentTA);
		
		g_dateTF = new JTextField();
		g_dateTF.setBounds(275, 216, 93, 21);
		gongjiPanel.add(g_dateTF);
		g_dateTF.setColumns(10);
		
		JPanel faqPanel = new JPanel();
		tabbedPane_4.addTab("자주찾는질문", null, faqPanel, null);
		faqPanel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 10, 356, 165);
		faqPanel.add(scrollPane_1);
		
		categoryTable = new JTable();
		categoryTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uCE74\uD14C\uACE0\uB9AC", "\uC81C\uBAA9"
			}
		));
		categoryTable.getColumnModel().getColumn(0).setPreferredWidth(37);
		categoryTable.getColumnModel().getColumn(1).setPreferredWidth(81);
		categoryTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		scrollPane_1.setViewportView(categoryTable);
		
		m_noTF = new JTextField();
		m_noTF.setBackground(Color.WHITE);
		m_noTF.setColumns(10);
		m_noTF.setBounds(12, 185, 31, 21);
		faqPanel.add(m_noTF);
		
		m_categoryTF = new JTextField();
		m_categoryTF.setColumns(10);
		m_categoryTF.setBounds(12, 216, 86, 21);
		faqPanel.add(m_categoryTF);
		
		m_titleTF = new JTextField();
		m_titleTF.setColumns(10);
		m_titleTF.setBounds(104, 216, 149, 21);
		faqPanel.add(m_titleTF);
		
		JTextArea m_contentTA = new JTextArea();
		m_contentTA.setBounds(12, 247, 356, 236);
		faqPanel.add(m_contentTA);
		
		JPanel questionPanel = new JPanel();
		tabbedPane_4.addTab("1대1 문의", null, questionPanel, null);
		questionPanel.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("제목");
		lblNewLabel_9.setBounds(25, 22, 35, 15);
		questionPanel.add(lblNewLabel_9);
		
		q_titleTF = new JTextField();
		q_titleTF.setBounds(81, 19, 139, 21);
		questionPanel.add(q_titleTF);
		q_titleTF.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("대분류");
		lblNewLabel_10.setBounds(25, 60, 46, 15);
		questionPanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("소분류");
		lblNewLabel_11.setBounds(25, 95, 46, 15);
		questionPanel.add(lblNewLabel_11);
		
		JTextArea q_contentTA = new JTextArea();
		q_contentTA.setBounds(12, 126, 356, 264);
		questionPanel.add(q_contentTA);
		
		JComboBox q_oneCateCB = new JComboBox();
		q_oneCateCB.setModel(new DefaultComboBoxModel(new String[] {"대분류1", "대분류2", "대분류3", "대분류4", "대분류5", "대분류6", "대분류7", "대분류8", "대분류9", "대분류10", ""}));
		q_oneCateCB.setBounds(82, 56, 75, 23);
		questionPanel.add(q_oneCateCB);
		
		JComboBox q_twoCateCB = new JComboBox();
		q_twoCateCB.setModel(new DefaultComboBoxModel(new String[] {"소분류1", "소분류2", "소분류3", "소분류4", "소분류5", "소분류6", "소분류7", "소분류8", "소분류9", "소분류10"}));
		q_twoCateCB.setBounds(81, 91, 76, 23);
		questionPanel.add(q_twoCateCB);
		
		JButton q_insertBtn = new JButton("등록하기");
		q_insertBtn.setBounds(39, 432, 97, 23);
		questionPanel.add(q_insertBtn);
		
		JButton q_cancleBtn = new JButton("취소하기");
		q_cancleBtn.setBounds(242, 432, 97, 23);
		questionPanel.add(q_cancleBtn);
		
		JPanel personalQPanel = new JPanel();
		tabbedPane_4.addTab("문의목록", null, personalQPanel, null);
		personalQPanel.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 10, 356, 202);
		personalQPanel.add(scrollPane_2);
		
		questionListTable = new JTable();
		questionListTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uB300\uBD84\uB958", "\uC18C\uBD84\uB958", "\uC81C\uBAA9", "\uB4F1\uB85D\uC77C"
			}
		));
		scrollPane_2.setViewportView(questionListTable);
		
		p_noTF = new JTextField();
		p_noTF.setColumns(10);
		p_noTF.setBackground(Color.WHITE);
		p_noTF.setBounds(12, 220, 31, 21);
		personalQPanel.add(p_noTF);
		
		p_oneCateTF = new JTextField();
		p_oneCateTF.setColumns(10);
		p_oneCateTF.setBounds(12, 251, 64, 21);
		personalQPanel.add(p_oneCateTF);
		
		p_twoCateTF = new JTextField();
		p_twoCateTF.setColumns(10);
		p_twoCateTF.setBounds(83, 251, 64, 21);
		personalQPanel.add(p_twoCateTF);
		
		p_titleTF = new JTextField();
		p_titleTF.setColumns(10);
		p_titleTF.setBounds(154, 251, 139, 21);
		personalQPanel.add(p_titleTF);
		
		JTextArea p_contentTA = new JTextArea();
		p_contentTA.setBounds(12, 282, 356, 201);
		personalQPanel.add(p_contentTA);
		productList();
	}
	
	
	
	public  void productList() {
		foodListPanel.removeAll();
		for(int i=0;i<5;i++) {
			JPanel productItemPanel = new JPanel();
			productItemPanel.setLayout(null);
			productItemPanel.setPreferredSize(new Dimension(350, 130));
			
			
			JLabel productImageLB = new JLabel("");
			productImageLB.setIcon(new ImageIcon(guardMainFrame.class.getResource("/images/50shaipei.jpg")));
			productImageLB.setBounds(8, 4, 82, 73);
			productItemPanel.add(productImageLB);
			
			JLabel productNameLB = new JLabel("반반콤보");
			productNameLB.setFont(new Font("굴림", Font.BOLD, 16));
			productNameLB.setBounds(102, 4, 99, 15);
			productItemPanel.add(productNameLB);
			
			JLabel productDescLB = new JLabel("<html>ㅇㄴㄹㄴ어ㅏ론어ㅏ런오ㅓㅏ론어ㅓ<br>란어ㅏㄹㄴㅇ</html>");
			productDescLB.setBounds(100, 29, 214, 30);
			productItemPanel.add(productDescLB);
			
			JLabel productPriceLB = new JLabel("16,000");
			productPriceLB.setBounds(110, 69, 57, 15);
			productItemPanel.add(productPriceLB);
			foodListPanel.add(productItemPanel);
		}
		
		
	}
	
}
