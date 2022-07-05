package com.itwill.gc.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.gc.service.FaqService;
import com.itwill.gc.service.GongjiService;
import com.itwill.gc.service.MovieReserveService;
import com.itwill.gc.service.QuestionService;
import com.itwill.gc.vo.Faq;
import com.itwill.gc.vo.Gongji;
import com.itwill.gc.vo.Movie;
import com.itwill.gc.vo.MovieItem;
import com.itwill.gc.vo.MovieReserve;
import com.itwill.gc.vo.Question;
import com.itwill.gc.vo.User;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class GuardMainFrame extends JFrame {
	
	/********************객체선언**********************/
	private GongjiService gongjiService;
	private FaqService faqService;
	private QuestionService questionService;
	public MovieItem movieItem;
	private MovieReserveService movieReserveService;
	private MovieReserve movieReserve;
	/**************************************************/
	/**************************************************/
	/**************************************************/
	
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
	private JTextField g_noTF;
	private JTextField g_categoryTF;
	private JTextField g_titleTF;
	private JTextField g_dateTF;
	private JTextField m_noTF;
	private JTextField m_categoryTF;
	private JTextField m_titleTF;
	private JTable faqTable;
	private JTextField q_titleTF;
	private JTable questionListTable;
	private JTextField p_noTF;
	private JTextField p_oneCateTF;
	private JTextField p_twoCateTF;
	private JTextField p_titleTF;
	private JPanel foodListPanel;
	private JTable gongjiTable;
	private JTextArea g_contentTA;
	private JTextArea m_contentTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuardMainFrame frame = new GuardMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public GuardMainFrame() throws Exception {
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
		
		JTabbedPane movieTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		moviePanel.add(movieTabbedPane);
		
		JPanel movieListIngPanel = new JPanel();
		movieTabbedPane.addTab("상영영화", null, movieListIngPanel, null);
		movieListIngPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3_1 = new JScrollPane();
		scrollPane_3_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		movieListIngPanel.add(scrollPane_3_1);
		
		JPanel movieListPanel = new JPanel();
		movieListPanel.setLayout(null);
		movieListPanel.setPreferredSize(new Dimension(10, 800));
		movieListPanel.setBackground(Color.DARK_GRAY);
		scrollPane_3_1.setViewportView(movieListPanel);
		
		JPanel movieOnePanel = new JPanel();
		movieOnePanel.setLayout(null);
		movieOnePanel.setBounds(12, 154, 337, 131);
		movieListPanel.add(movieOnePanel);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(12, 10, 94, 87);
		movieOnePanel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("지구멸망");
		lblNewLabel_13.setBounds(118, 10, 74, 22);
		movieOnePanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("<html>제~~~~~~~~~~~~~~~~~~~<br>~~~~~~~~~~~~~발</html>");
		lblNewLabel_14.setBounds(118, 67, 178, 45);
		movieOnePanel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("스릴러/전체이용가");
		lblNewLabel_15.setBounds(118, 42, 114, 15);
		movieOnePanel.add(lblNewLabel_15);
		
		JButton reserveBtn2 = new JButton("예매");
		reserveBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movieTabbedPane.setSelectedIndex(2);
				 movieItem.setI_code(2);
			}
		});
		reserveBtn2.setBounds(264, 98, 61, 23);
		movieOnePanel.add(reserveBtn2);
		
		JPanel movieTwoPanel = new JPanel();
		movieTwoPanel.setLayout(null);
		movieTwoPanel.setBounds(12, 10, 337, 131);
		movieListPanel.add(movieTwoPanel);
		
		JLabel lblNewLabel_12_1 = new JLabel("");
		lblNewLabel_12_1.setBounds(12, 10, 94, 87);
		movieTwoPanel.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("지구멸망");
		lblNewLabel_13_1.setBounds(118, 10, 74, 22);
		movieTwoPanel.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("<html>제~~~~~~~~~~~~~~~~~~~<br>~~~~~~~~~~~~~발</html>");
		lblNewLabel_14_1.setBounds(118, 67, 178, 45);
		movieTwoPanel.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("스릴러/전체이용가");
		lblNewLabel_15_1.setBounds(118, 42, 114, 15);
		movieTwoPanel.add(lblNewLabel_15_1);
		
		/**********************************예매1**********************/
		JButton reserveBtn1 = new JButton("예매");
		reserveBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movieTabbedPane.setSelectedIndex(2);
				 movieItem.setI_code(1);
				
			}
		});
		/********************************************************/
		reserveBtn1.setBounds(264, 98, 61, 23);
		movieTwoPanel.add(reserveBtn1);
		
		JPanel movieThreePanel = new JPanel();
		movieThreePanel.setLayout(null);
		movieThreePanel.setBounds(12, 299, 337, 131);
		movieListPanel.add(movieThreePanel);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("");
		lblNewLabel_12_1_1.setBounds(12, 10, 94, 87);
		movieThreePanel.add(lblNewLabel_12_1_1);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("지구멸망");
		lblNewLabel_13_1_1.setBounds(118, 10, 74, 22);
		movieThreePanel.add(lblNewLabel_13_1_1);
		
		JLabel lblNewLabel_14_1_1 = new JLabel("<html>제~~~~~~~~~~~~~~~~~~~<br>~~~~~~~~~~~~~발</html>");
		lblNewLabel_14_1_1.setBounds(118, 67, 178, 45);
		movieThreePanel.add(lblNewLabel_14_1_1);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("스릴러/전체이용가");
		lblNewLabel_15_1_1.setBounds(118, 42, 114, 15);
		movieThreePanel.add(lblNewLabel_15_1_1);
		
		JButton reserveBtn3 = new JButton("예매");
		reserveBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movieTabbedPane.setSelectedIndex(2);
				 movieItem.setI_code(3);
			}
		});
		reserveBtn3.setBounds(264, 98, 61, 23);
		movieThreePanel.add(reserveBtn3);
		
		JPanel movieLastPanel = new JPanel();
		movieLastPanel.setLayout(null);
		movieLastPanel.setBounds(12, 444, 337, 131);
		movieListPanel.add(movieLastPanel);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("");
		lblNewLabel_12_1_1_1.setBounds(12, 10, 94, 87);
		movieLastPanel.add(lblNewLabel_12_1_1_1);
		
		JLabel lblNewLabel_13_1_1_1 = new JLabel("지구멸망");
		lblNewLabel_13_1_1_1.setBounds(118, 10, 74, 22);
		movieLastPanel.add(lblNewLabel_13_1_1_1);
		
		JLabel lblNewLabel_14_1_1_1 = new JLabel("<html>제~~~~~~~~~~~~~~~~~~~<br>~~~~~~~~~~~~~발</html>");
		lblNewLabel_14_1_1_1.setBounds(118, 67, 178, 45);
		movieLastPanel.add(lblNewLabel_14_1_1_1);
		
		JLabel lblNewLabel_15_1_1_1 = new JLabel("스릴러/전체이용가");
		lblNewLabel_15_1_1_1.setBounds(118, 42, 114, 15);
		movieLastPanel.add(lblNewLabel_15_1_1_1);
		
		JButton reserveBtn4 = new JButton("예매");
		reserveBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movieTabbedPane.setSelectedIndex(2);
				 movieItem.setI_code(4);
			}
		});
		reserveBtn4.setBounds(264, 98, 61, 23);
		movieLastPanel.add(reserveBtn4);
		
		JPanel movieListFeaPanel = new JPanel();
		movieTabbedPane.addTab("개봉예정", null, movieListFeaPanel, null);
		movieListFeaPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3_1_1 = new JScrollPane();
		scrollPane_3_1_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		movieListFeaPanel.add(scrollPane_3_1_1, BorderLayout.CENTER);
		
		JPanel movieListPanel_1 = new JPanel();
		movieListPanel_1.setLayout(null);
		movieListPanel_1.setPreferredSize(new Dimension(10, 800));
		movieListPanel_1.setBackground(Color.DARK_GRAY);
		scrollPane_3_1_1.setViewportView(movieListPanel_1);
		
		JPanel movieOnePanel_1 = new JPanel();
		movieOnePanel_1.setLayout(null);
		movieOnePanel_1.setBounds(12, 154, 337, 131);
		movieListPanel_1.add(movieOnePanel_1);
		
		JLabel lblNewLabel_12_2 = new JLabel("");
		lblNewLabel_12_2.setBounds(12, 10, 94, 87);
		movieOnePanel_1.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_13_2 = new JLabel("지구멸망");
		lblNewLabel_13_2.setBounds(118, 10, 74, 22);
		movieOnePanel_1.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_14_2 = new JLabel("<html>제~~~~~~~~~~~~~~~~~~~<br>~~~~~~~~~~~~~발</html>");
		lblNewLabel_14_2.setBounds(118, 67, 178, 45);
		movieOnePanel_1.add(lblNewLabel_14_2);
		
		JLabel lblNewLabel_15_2 = new JLabel("스릴러/전체이용가");
		lblNewLabel_15_2.setBounds(118, 42, 114, 15);
		movieOnePanel_1.add(lblNewLabel_15_2);
		
		JPanel movieTwoPanel_1 = new JPanel();
		movieTwoPanel_1.setLayout(null);
		movieTwoPanel_1.setBounds(12, 10, 337, 131);
		movieListPanel_1.add(movieTwoPanel_1);
		
		JLabel lblNewLabel_12_1_2 = new JLabel("");
		lblNewLabel_12_1_2.setBounds(12, 10, 94, 87);
		movieTwoPanel_1.add(lblNewLabel_12_1_2);
		
		JLabel lblNewLabel_13_1_2 = new JLabel("지구멸망");
		lblNewLabel_13_1_2.setBounds(118, 10, 74, 22);
		movieTwoPanel_1.add(lblNewLabel_13_1_2);
		
		JLabel lblNewLabel_14_1_2 = new JLabel("<html>제~~~~~~~~~~~~~~~~~~~<br>~~~~~~~~~~~~~발</html>");
		lblNewLabel_14_1_2.setBounds(118, 67, 178, 45);
		movieTwoPanel_1.add(lblNewLabel_14_1_2);
		
		JLabel lblNewLabel_15_1_2 = new JLabel("스릴러/전체이용가");
		lblNewLabel_15_1_2.setBounds(118, 42, 114, 15);
		movieTwoPanel_1.add(lblNewLabel_15_1_2);
		
		JPanel movieThreePanel_1 = new JPanel();
		movieThreePanel_1.setLayout(null);
		movieThreePanel_1.setBounds(12, 299, 337, 131);
		movieListPanel_1.add(movieThreePanel_1);
		
		JLabel lblNewLabel_12_1_1_2 = new JLabel("");
		lblNewLabel_12_1_1_2.setBounds(12, 10, 94, 87);
		movieThreePanel_1.add(lblNewLabel_12_1_1_2);
		
		JLabel lblNewLabel_13_1_1_2 = new JLabel("지구멸망");
		lblNewLabel_13_1_1_2.setBounds(118, 10, 74, 22);
		movieThreePanel_1.add(lblNewLabel_13_1_1_2);
		
		JLabel lblNewLabel_14_1_1_2 = new JLabel("<html>제~~~~~~~~~~~~~~~~~~~<br>~~~~~~~~~~~~~발</html>");
		lblNewLabel_14_1_1_2.setBounds(118, 67, 178, 45);
		movieThreePanel_1.add(lblNewLabel_14_1_1_2);
		
		JLabel lblNewLabel_15_1_1_2 = new JLabel("스릴러/전체이용가");
		lblNewLabel_15_1_1_2.setBounds(118, 42, 114, 15);
		movieThreePanel_1.add(lblNewLabel_15_1_1_2);
		
		JPanel movieLastPanel_1 = new JPanel();
		movieLastPanel_1.setLayout(null);
		movieLastPanel_1.setBounds(12, 444, 337, 131);
		movieListPanel_1.add(movieLastPanel_1);
		
		JLabel lblNewLabel_12_1_1_1_1 = new JLabel("");
		lblNewLabel_12_1_1_1_1.setBounds(12, 10, 94, 87);
		movieLastPanel_1.add(lblNewLabel_12_1_1_1_1);
		
		JLabel lblNewLabel_13_1_1_1_1 = new JLabel("지구멸망");
		lblNewLabel_13_1_1_1_1.setBounds(118, 10, 74, 22);
		movieLastPanel_1.add(lblNewLabel_13_1_1_1_1);
		
		JLabel lblNewLabel_14_1_1_1_1 = new JLabel("<html>제~~~~~~~~~~~~~~~~~~~<br>~~~~~~~~~~~~~발</html>");
		lblNewLabel_14_1_1_1_1.setBounds(118, 67, 178, 45);
		movieLastPanel_1.add(lblNewLabel_14_1_1_1_1);
		
		JLabel lblNewLabel_15_1_1_1_1 = new JLabel("스릴러/전체이용가");
		lblNewLabel_15_1_1_1_1.setBounds(118, 42, 114, 15);
		movieLastPanel_1.add(lblNewLabel_15_1_1_1_1);
		
		JPanel reserveOnePanel = new JPanel();
		reserveOnePanel.setLayout(null);
		movieTabbedPane.addTab("영화예매", null, reserveOnePanel, null);
		
		JComboBox cinemaNameCB = new JComboBox();
		cinemaNameCB.setModel(new DefaultComboBoxModel(new String[] {"가산디지털", "가양", "강동", "건대입구", "김포공항", "노원", "도곡", "독산", "브로드웨이", "서울대입구", "수락산", "수유", "신도림", "신림", "에비뉴엘", "영등포", "용산", "월드타워", "은평", "중랑", "청량리", "합정", "홍대입구"}));
		cinemaNameCB.setBounds(28, 341, 100, 23);
		reserveOnePanel.add(cinemaNameCB);
		
		JComboBox cinemaPlaceCB = new JComboBox();
		cinemaPlaceCB.setModel(new DefaultComboBoxModel(new String[] {"1관", "2관", "3관", "4관", "5관", "6관", "7관", "8관", "9관"}));
		cinemaPlaceCB.setBounds(256, 341, 100, 23);
		reserveOnePanel.add(cinemaPlaceCB);
		
		JButton btnNewButton = new JButton("좌석 선택");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cinemaNameStr=(String)cinemaNameCB.getSelectedItem();
				String cinemaPlace=(String)cinemaPlaceCB.getSelectedItem();
				movieItem.setI_cname(cinemaNameStr);
				movieItem.setI_cplace(cinemaPlace);
				movieTabbedPane.setSelectedIndex(3);
				
			}
		});
		btnNewButton.setBounds(144, 435, 97, 23);
		reserveOnePanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7월6일");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 movieItem.setI_day("7월6일");
			}
		});
		btnNewButton_1.setBounds(12, 11, 69, 69);
		reserveOnePanel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("7월7일");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_day("7월7일");
			}
		});
		btnNewButton_1_1.setBounds(109, 11, 69, 69);
		reserveOnePanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("7월8일");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_day("7월6일");
			}
		});
		btnNewButton_1_2.setBounds(203, 11, 69, 69);
		reserveOnePanel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("7월9일");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_day("7월9일");
			}
		});
		btnNewButton_1_3.setBounds(300, 11, 69, 69);
		reserveOnePanel.add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("06시~08시");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_daytime("06시~08시");
			}
		});
		btnNewButton_2.setBounds(12, 110, 97, 87);
		reserveOnePanel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("13시~15시");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_daytime("13시~15시");
			}
		});
		btnNewButton_2_1.setBounds(272, 110, 97, 87);
		reserveOnePanel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("09시~11시");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_daytime("09시~11시");
			}
		});
		btnNewButton_2_2.setBounds(142, 110, 97, 87);
		reserveOnePanel.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("16시~18시");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_daytime("16시~18시");
			}
		});
		btnNewButton_2_3.setBounds(12, 227, 97, 87);
		reserveOnePanel.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_2_1 = new JButton("19시~21시");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_daytime("19시~21시");
			}
		});
		btnNewButton_2_2_1.setBounds(142, 227, 97, 87);
		reserveOnePanel.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("22시~24시");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 movieItem.setI_daytime("22시~24시");
			}
		});
		btnNewButton_2_1_1.setBounds(272, 227, 97, 87);
		reserveOnePanel.add(btnNewButton_2_1_1);
		
		JPanel seatPanel = new JPanel();
		seatPanel.setBackground(Color.BLUE);
		movieTabbedPane.addTab("좌석", null, seatPanel, null);
		seatPanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 356, 404);
		seatPanel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movieItem.setI_seat(1);
				movieItem.setI_price(10000);
				
			}
		});
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("New button");
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("New button");
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("New button");
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("New button");
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("New button");
		panel_1.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("New button");
		panel_1.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("New button");
		panel_1.add(btnNewButton_22);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 424, 356, 59);
		seatPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_23 = new JButton("예매!!");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movieReserve = new MovieReserve(0,movieItem.getI_day(),movieItem.getI_seat(),movieItem.getI_daytime(),movieItem.getI_price(),movieItem.getI_cname(),movieItem.getI_cplace(),
						new Movie(movieItem.getI_code()),new User("qkrrjsxo"));
				try {
					movieReserveService.movieReserve(movieReserve);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				movieTabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_23.setBounds(129, 10, 97, 39);
		panel_2.add(btnNewButton_23);
		
		JPanel reserveListPanel = new JPanel();
		movieTabbedPane.addTab("예매내역", null, reserveListPanel, null);
		reserveListPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(12, 25, 356, 115);
		reserveListPanel.add(panel);
		
		JPanel reviewPanel = new JPanel();
		movieTabbedPane.addTab("리뷰", null, reviewPanel, null);
		
		JPanel productPanel = new JPanel();
		tabbedPane.addTab("상품", null, productPanel, null);
		productPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		productPanel.add(productTabbedPane, BorderLayout.CENTER);
	/**************************************************************/
		
		JPanel cartPanel = new JPanel();
		productTabbedPane.addTab("장바구니", null, cartPanel, null);
		
		JPanel receiptPanel = new JPanel();
		productTabbedPane.addTab("구매내역", null, receiptPanel, null);
		
		JPanel foodPanel = new JPanel();
		productTabbedPane.addTab("상품", null, foodPanel, null);
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
		productImageLB.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/images/50shaipei.jpg")));
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
		
		JTabbedPane userTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		userPanel.add(userTabbedPane, BorderLayout.CENTER);
		
		JPanel joinPanel = new JPanel();
		userTabbedPane.addTab("회원가입", null, joinPanel, null);
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
		userTabbedPane.addTab("로그인", null, loginPanel, null);
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
		userTabbedPane.addTab("정보수정", null, changePanel, null);
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
		
		JTabbedPane gongjiTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		centerPanel.add(gongjiTabbedPane, BorderLayout.CENTER);
		
		JPanel gongjiPanel = new JPanel();
		/*************************공지테이블호출***************************/
		gongjiPanel.addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent e) {
				try {
					gongjiListDisplay();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		/***************************************************************/
		gongjiTabbedPane.addTab("공지사항", null, gongjiPanel, null);
		gongjiPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 356, 165);
		gongjiPanel.add(scrollPane);
		
		gongjiTable = new JTable();
		/******************************************************/
		gongjiTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					int selectedRow = gongjiTable.getSelectedRow();
					int selectedGongjiNo = (int)gongjiTable.getValueAt(selectedRow,0);
					Gongji findGongji = gongjiService.selectByNo(selectedGongjiNo);
					String noStr = findGongji.getGongji_no()+"";
					g_noTF.setText(noStr);
					g_titleTF.setText(findGongji.getGongji_title());
					g_dateTF.setText(findGongji.getGongji_date().toLocaleString().substring(10));
					g_categoryTF.setText(findGongji.getGongji_category());
					g_contentTA.setText(findGongji.getGongji_content());
					
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		/******************************************************/
		gongjiTable.setToolTipText("");
		
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
		
		g_contentTA = new JTextArea();
		g_contentTA.setBounds(12, 247, 356, 236);
		gongjiPanel.add(g_contentTA);
		
		g_dateTF = new JTextField();
		g_dateTF.setBounds(275, 216, 93, 21);
		gongjiPanel.add(g_dateTF);
		g_dateTF.setColumns(10);
		
		JPanel faqPanel = new JPanel();
		/***********************faq테이블호출***********************/
		faqPanel.addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent e) {
				try {
					faqListDisplay();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		/********************************************************/
		gongjiTabbedPane.addTab("자주찾는질문", null, faqPanel, null);
		faqPanel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 10, 356, 165);
		faqPanel.add(scrollPane_1);
		
		faqTable = new JTable();
		/*******************************************************/
		faqTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					int selectedRow = faqTable.getSelectedRow();
					int selectedFaqNo = (int)gongjiTable.getValueAt(selectedRow,0);
					Faq findFaq = faqService.selectByNo(selectedFaqNo);
					String noStr = findFaq.getFaq_no()+"";
					m_noTF.setText(noStr);
					m_titleTF.setText(findFaq.getFaq_title());
					m_categoryTF.setText(findFaq.getFaq_category());
					m_contentTA.setText(findFaq.getFaq_content());
					
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		/*******************************************************/
		faqTable.setModel(new DefaultTableModel(
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
		faqTable.getColumnModel().getColumn(0).setPreferredWidth(37);
		faqTable.getColumnModel().getColumn(1).setPreferredWidth(81);
		faqTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		scrollPane_1.setViewportView(faqTable);
		
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
		
		m_contentTA = new JTextArea();
		m_contentTA.setBounds(12, 247, 356, 236);
		faqPanel.add(m_contentTA);
		
		JPanel questionPanel = new JPanel();
		gongjiTabbedPane.addTab("1대1 문의", null, questionPanel, null);
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
		q_insertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*********************문의등록***********************/
				//로그인해야만 쓸 수 있게 하고싶은데...
				
				try {
					String qTitle = q_titleTF.getText();
					String qCateOne = (String)q_oneCateCB.getSelectedItem();					
					String qCateTwo = (String)q_twoCateCB.getSelectedItem();					
					String qContent = q_contentTA.getText();
				
				Question newQuestion = new Question(0, null, qTitle, qContent, qCateOne, qCateTwo, null);
				int isSuccess = 
						questionService.addQuestion(newQuestion);
				if(isSuccess==1) {
					gongjiTabbedPane.setSelectedIndex(4);
				}else {
					JOptionPane.showMessageDialog(null, "죄송합니다.잠시 후 이용부탁드립니다.");
				}
					
				}catch(Exception e1) {
					
				}
				/*************************************************/
			}
		});
		q_insertBtn.setBounds(39, 432, 97, 23);
		questionPanel.add(q_insertBtn);
		
		JButton q_cancleBtn = new JButton("취소하기");
		q_cancleBtn.setBounds(242, 432, 97, 23);
		questionPanel.add(q_cancleBtn);
		
		JPanel personalQPanel = new JPanel();
		gongjiTabbedPane.addTab("문의목록", null, personalQPanel, null);
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

		gongjiService = new GongjiService();
		faqService = new FaqService();
	}//생성자끝
	/********************공지리스트*********************/
	public void gongjiListDisplay() throws Exception{
		List<Gongji> gongjiList = gongjiService.selectAll();
		Vector gongjiListVector = new Vector();
		
		for(Gongji gongji : gongjiList) {
			Vector rowVector = new Vector();
			rowVector.add(gongji.getGongji_no());
			rowVector.add(gongji.getGongji_title());
			rowVector.add(gongji.getGongji_category());
			rowVector.add(gongji.getGongji_date());
			
			gongjiListVector.add(rowVector);
		}
		
		Vector columnVector = new Vector();
		columnVector.add("번호");
		columnVector.add("내용");
		columnVector.add("분류");
		columnVector.add("게시날짜");
		
		DefaultTableModel defaultTableModel=
				new DefaultTableModel(gongjiListVector, columnVector);
		gongjiTable.setModel(defaultTableModel);
		
		
	}
	/***************************************************/
	/**********************Faq리스트**********************/
	public void faqListDisplay() throws Exception{
		List<Faq> faqList = faqService.selectAll();
		Vector faqListVector = new Vector();
		
		for(Faq faq : faqList) {
			Vector rowVector = new Vector();
			rowVector.add(faq.getFaq_no());
			rowVector.add(faq.getFaq_title());
			rowVector.add(faq.getFaq_category());
			
			faqListVector.add(rowVector);
		}
		
		Vector columnVector = new Vector();
		columnVector.add("번호");
		columnVector.add("제목");
		columnVector.add("카테고리");
		
		
		DefaultTableModel defaultTableModel=
				new DefaultTableModel(faqListVector, columnVector);
		faqTable.setModel(defaultTableModel);
		
		
	}
	/***************************************************/
	
	
	/*******************얘는 뭐임**********************/
	public  void productList() {
		foodListPanel.removeAll();
		for(int i=0;i<5;i++) {
			JPanel productItemPanel = new JPanel();
			productItemPanel.setLayout(null);
			productItemPanel.setPreferredSize(new Dimension(350, 130));
			
			
			JLabel productImageLB = new JLabel("");
			productImageLB.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/images/50shaipei.jpg")));
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
