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
import com.itwill.gc.service.UserService;
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
import java.util.ArrayList;
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
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Component;
import java.awt.Container;

import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Insets;

public class GuardMainFrame extends JFrame {
   
   /********************객체선언**********************/
   private GongjiService gongjiService;
   private FaqService faqService;
   private QuestionService questionService;
   private MovieItem movieItem = new MovieItem();
   private MovieReserveService movieReserveService =null;
   private MovieReserve movieReserve = null;
   private User loginUser = null;
   private UserService userService;
   private JLabel messageLB; 
   private JLabel loginMessageLB;
   private JLabel updateLB;
   private JPanel panel;

   /**************************
    *************************/
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
   private JTextField c_idTF;
   private JTextField c_passwordTF;
   private JTextField c_nameTF;
   private JTextField c_juminTF;
   private JTextField c_phoneTF;
   private JTextField c_emailTF;
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
   private JTable gongjiTable;
   private JTextArea g_contentTA;
   private JTextArea m_contentTA;
   private JTable reserveTable;
   private JLabel updateMessageLB;
   private JTabbedPane userTabbedPane;
   private JTabbedPane gongjiTabbedPane;
   private JTabbedPane movieTabbedPane;
   private JTabbedPane tabbedPane;
   private JMenuItem logoutMenuItem;
   private JButton reserveBtn1;
   private JButton reserveBtn2;
   private JButton reserveBtn3;
   private JButton reserveBtn4;
   private JTextArea p_contentTA;
   private JButton questionDeleteBtn;
   private JPanel changePanel;

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
      
      JMenuBar menuBar = new JMenuBar();
      menuBar.setAlignmentX(Component.LEFT_ALIGNMENT);
      setJMenuBar(menuBar);
      
      JMenuItem mntmNewMenuItem = new JMenuItem("");
      menuBar.add(mntmNewMenuItem);
      
      JMenu mainMenu = new JMenu("");
      mainMenu.setHorizontalAlignment(SwingConstants.RIGHT);
      mainMenu.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_icon/menu1 (1).png")));
      mainMenu.setHorizontalTextPosition(SwingConstants.RIGHT);
      menuBar.add(mainMenu);
      
      JMenuItem movieMenuItem = new JMenuItem("영화");
      movieMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
      mainMenu.add(movieMenuItem);
      
      JSeparator separator = new JSeparator();
      mainMenu.add(separator);
      
      JMenuItem loginMenuItem = new JMenuItem("로그인");
      loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				userTabbedPane.setSelectedIndex(1);
			}
		});
      mainMenu.add(loginMenuItem);
      
      logoutMenuItem = new JMenuItem("로그아웃");
      logoutMenuItem.setHorizontalTextPosition(SwingConstants.LEFT);
      logoutMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
     /*********************로그아웃*********************/
      logoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoutProcess();
			}
		});
     /***************************************************/ 
      mainMenu.add(logoutMenuItem);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
      
      tabbedPane = new JTabbedPane(JTabbedPane.TOP);
      contentPane.add(tabbedPane, BorderLayout.CENTER);
      
      JPanel moviePanel = new JPanel();
      tabbedPane.addTab("영화", null, moviePanel, null);
      moviePanel.setLayout(new BorderLayout(0, 0));
      
      movieTabbedPane = new JTabbedPane(JTabbedPane.TOP);
      moviePanel.add(movieTabbedPane);
      
      JPanel movieListIngPanel = new JPanel();
      movieTabbedPane.addTab("상영영화", null, movieListIngPanel, null);
      movieListIngPanel.setLayout(new BorderLayout(0, 0));
      
      JScrollPane scrollPane_3_1 = new JScrollPane();
      scrollPane_3_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      movieListIngPanel.add(scrollPane_3_1);
      
      JPanel movieListPanel = new JPanel();
      movieListPanel.addComponentListener(new ComponentAdapter() {
      	@Override
      	public void componentShown(ComponentEvent e) {
      		//movieItem = new MovieItem();
      	}
      });
      movieListPanel.setLayout(null);
      movieListPanel.setPreferredSize(new Dimension(10, 800));
      movieListPanel.setBackground(Color.DARK_GRAY);
      scrollPane_3_1.setViewportView(movieListPanel);
      
      JPanel movieOnePanel = new JPanel();
      movieOnePanel.setLayout(null);
      movieOnePanel.setBounds(12, 154, 337, 131);
      movieListPanel.add(movieOnePanel);
      
      JLabel lblNewLabel_12 = new JLabel("");
      lblNewLabel_12.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_movie_image/범죄도시2.jpg")));
      lblNewLabel_12.setBounds(12, 10, 94, 87);
      movieOnePanel.add(lblNewLabel_12);
      
      JLabel lblNewLabel_13 = new JLabel("범죄도시2");
      lblNewLabel_13.setBounds(118, 10, 74, 22);
      movieOnePanel.add(lblNewLabel_13);
      
      JLabel lblNewLabel_14 = new JLabel("<html>스포 방지</html>");
      lblNewLabel_14.setBounds(118, 67, 178, 45);
      movieOnePanel.add(lblNewLabel_14);
      
      JLabel lblNewLabel_15 = new JLabel("액션/15세 이용가");
      lblNewLabel_15.setBounds(118, 42, 114, 15);
      movieOnePanel.add(lblNewLabel_15);
      
      reserveBtn2 = new JButton("예매");
      reserveBtn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 movieItem = new MovieItem(); 
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
      lblNewLabel_12_1.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_movie_image/마녀.jpg")));
      lblNewLabel_12_1.setBounds(12, 10, 94, 87);
      movieTwoPanel.add(lblNewLabel_12_1);
      
      JLabel lblNewLabel_13_1 = new JLabel("마녀2");
      lblNewLabel_13_1.setBounds(118, 10, 74, 22);
      movieTwoPanel.add(lblNewLabel_13_1);
      
      JLabel lblNewLabel_14_1 = new JLabel("<html>스포 방지</html>");
      lblNewLabel_14_1.setBounds(118, 67, 178, 45);
      movieTwoPanel.add(lblNewLabel_14_1);
      
      JLabel lblNewLabel_15_1 = new JLabel("액션/15세 이용가");
      lblNewLabel_15_1.setBounds(118, 42, 114, 15);
      movieTwoPanel.add(lblNewLabel_15_1);
      
      /**********************************예매1**********************/
      reserveBtn1 = new JButton("예매");
      reserveBtn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
             movieItem = new MovieItem(); 
             movieItem.setI_code(1);
             System.out.println(movieItem.getI_code());
             movieTabbedPane.setSelectedIndex(2);
            
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
      lblNewLabel_12_1_1.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_movie_image/브로커2.jpg")));
      lblNewLabel_12_1_1.setBounds(12, 10, 94, 87);
      movieThreePanel.add(lblNewLabel_12_1_1);
      
      JLabel lblNewLabel_13_1_1 = new JLabel("브로커");
      lblNewLabel_13_1_1.setBounds(118, 10, 74, 22);
      movieThreePanel.add(lblNewLabel_13_1_1);
      
      JLabel lblNewLabel_14_1_1 = new JLabel("<html>스포 방지</html>");
      lblNewLabel_14_1_1.setBounds(118, 67, 178, 45);
      movieThreePanel.add(lblNewLabel_14_1_1);
      
      JLabel lblNewLabel_15_1_1 = new JLabel("드라마/12세 이용가");
      lblNewLabel_15_1_1.setBounds(118, 42, 114, 15);
      movieThreePanel.add(lblNewLabel_15_1_1);
      
      reserveBtn3 = new JButton("예매");
      reserveBtn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 movieItem = new MovieItem();
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
      lblNewLabel_12_1_1_1.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_movie_image/탑건.jpg")));
      lblNewLabel_12_1_1_1.setBounds(12, 10, 94, 87);
      movieLastPanel.add(lblNewLabel_12_1_1_1);
      
      JLabel lblNewLabel_13_1_1_1 = new JLabel("탑건");
      lblNewLabel_13_1_1_1.setBounds(118, 10, 74, 22);
      movieLastPanel.add(lblNewLabel_13_1_1_1);
      
      JLabel lblNewLabel_14_1_1_1 = new JLabel("<html>스포 방지</html>");
      lblNewLabel_14_1_1_1.setBounds(118, 67, 178, 45);
      movieLastPanel.add(lblNewLabel_14_1_1_1);
      
      JLabel lblNewLabel_15_1_1_1 = new JLabel("액션/12세 이용가");
      lblNewLabel_15_1_1_1.setBounds(118, 42, 114, 15);
      movieLastPanel.add(lblNewLabel_15_1_1_1);
      
      reserveBtn4 = new JButton("예매");
      reserveBtn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 movieItem = new MovieItem();
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
      lblNewLabel_12_2.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_movie_image/한산 용의 출현.jpg")));
      lblNewLabel_12_2.setBounds(12, 10, 94, 87);
      movieOnePanel_1.add(lblNewLabel_12_2);
      
      JLabel lblNewLabel_13_2 = new JLabel("한산 용의 출현");
      lblNewLabel_13_2.setBounds(118, 10, 80, 22);
      movieOnePanel_1.add(lblNewLabel_13_2);
      
      JLabel lblNewLabel_14_2 = new JLabel("<html>스포 방지</html>");
      lblNewLabel_14_2.setBounds(118, 67, 178, 45);
      movieOnePanel_1.add(lblNewLabel_14_2);
      
      JLabel lblNewLabel_15_2 = new JLabel("액션/12세 이용가");
      lblNewLabel_15_2.setBounds(118, 42, 114, 15);
      movieOnePanel_1.add(lblNewLabel_15_2);
      
      JPanel movieTwoPanel_1 = new JPanel();
      movieTwoPanel_1.setLayout(null);
      movieTwoPanel_1.setBounds(12, 10, 337, 131);
      movieListPanel_1.add(movieTwoPanel_1);
      
      JLabel lblNewLabel_12_1_2 = new JLabel("");
      lblNewLabel_12_1_2.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_movie_image/토르 러브 앤 썬더.jpg")));
      lblNewLabel_12_1_2.setBounds(12, 10, 94, 87);
      movieTwoPanel_1.add(lblNewLabel_12_1_2);
      
      JLabel lblNewLabel_13_1_2 = new JLabel("토르 러브 앤 썬더");
      lblNewLabel_13_1_2.setBounds(118, 10, 96, 22);
      movieTwoPanel_1.add(lblNewLabel_13_1_2);
      
      JLabel lblNewLabel_14_1_2 = new JLabel("<html>스포 방지</html>");
      lblNewLabel_14_1_2.setBounds(118, 67, 178, 45);
      movieTwoPanel_1.add(lblNewLabel_14_1_2);
      
      JLabel lblNewLabel_15_1_2 = new JLabel("액션/12세 이용가");
      lblNewLabel_15_1_2.setBounds(118, 42, 114, 15);
      movieTwoPanel_1.add(lblNewLabel_15_1_2);
      
      JPanel movieThreePanel_1 = new JPanel();
      movieThreePanel_1.setLayout(null);
      movieThreePanel_1.setBounds(12, 299, 337, 131);
      movieListPanel_1.add(movieThreePanel_1);
      
      JLabel lblNewLabel_12_1_1_2 = new JLabel("");
      lblNewLabel_12_1_1_2.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_movie_image/헤어질 결심.jpg")));
      lblNewLabel_12_1_1_2.setBounds(12, 10, 94, 87);
      movieThreePanel_1.add(lblNewLabel_12_1_1_2);
      
      JLabel lblNewLabel_13_1_1_2 = new JLabel("헤어질 결심");
      lblNewLabel_13_1_1_2.setBounds(118, 10, 74, 22);
      movieThreePanel_1.add(lblNewLabel_13_1_1_2);
      
      JLabel lblNewLabel_14_1_1_2 = new JLabel("<html>스포 방지</html>");
      lblNewLabel_14_1_1_2.setBounds(118, 67, 178, 45);
      movieThreePanel_1.add(lblNewLabel_14_1_1_2);
      
      JLabel lblNewLabel_15_1_1_2 = new JLabel("미스터리,멜로/15세 이용가");
      lblNewLabel_15_1_1_2.setBounds(118, 42, 154, 15);
      movieThreePanel_1.add(lblNewLabel_15_1_1_2);
      
      JPanel movieLastPanel_1 = new JPanel();
      movieLastPanel_1.setLayout(null);
      movieLastPanel_1.setBounds(12, 444, 337, 131);
      movieListPanel_1.add(movieLastPanel_1);
      
      JLabel lblNewLabel_12_1_1_1_1 = new JLabel("");
      lblNewLabel_12_1_1_1_1.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/team1_movie_image/버즈 라이트이어.jpg")));
      lblNewLabel_12_1_1_1_1.setBounds(12, 10, 94, 87);
      movieLastPanel_1.add(lblNewLabel_12_1_1_1_1);
      
      JLabel lblNewLabel_13_1_1_1_1 = new JLabel("버즈 라이트이어");
      lblNewLabel_13_1_1_1_1.setBounds(118, 10, 94, 22);
      movieLastPanel_1.add(lblNewLabel_13_1_1_1_1);
      
      JLabel lblNewLabel_14_1_1_1_1 = new JLabel("<html>스포 방지</html>");
      lblNewLabel_14_1_1_1_1.setBounds(118, 67, 178, 45);
      movieLastPanel_1.add(lblNewLabel_14_1_1_1_1);
      
      JLabel lblNewLabel_15_1_1_1_1 = new JLabel("애니메이션/전체이용가");
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
             movieItem.setI_day("7월8일");
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
      seatPanel.addComponentListener(new ComponentAdapter() {
      	@Override
      	public void componentShown(ComponentEvent e) {
      		 try {
				seatListDisplay(movieItem.getI_code(),movieItem.getI_day(),movieItem.getI_daytime(),movieItem.getI_cname(),movieItem.getI_cplace());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
      	}
      });
      seatPanel.setBackground(Color.WHITE);
      movieTabbedPane.addTab("좌석", null, seatPanel, null);
      seatPanel.setLayout(null);
      
      panel = new JPanel();
      panel.setBounds(12, 10, 356, 404);
      seatPanel.add(panel);
      panel.setLayout(new GridLayout(0, 5, 5, 5));
      
      JButton btnNewButton_3 = new JButton("1");
      btnNewButton_3.setMargin(new Insets(2, 0, 2, 0));
      btnNewButton_3.setBorderPainted(false);
      btnNewButton_3.setBorder(new EmptyBorder(0, 0, 0, 0));
      btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      btnNewButton_3.setBackground(Color.WHITE);
      btnNewButton_3.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/images/seat.png")));
      panel.add(btnNewButton_3);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(12, 424, 356, 59);
      seatPanel.add(panel_2);
      panel_2.setLayout(null);
      
      JButton btnNewButton_23 = new JButton("예매!!");
      btnNewButton_23.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            movieReserve = new MovieReserve(0,movieItem.getI_day(),movieItem.getI_seat(),movieItem.getI_daytime(),movieItem.getI_price(),movieItem.getI_cname(),movieItem.getI_cplace(),
                  new Movie(movieItem.getI_code()),new User(loginUser.getUserId()));
            System.out.println(movieReserve);
            try {
               MovieReserveService movieRe = new MovieReserveService();
               movieRe.movieReserve(movieReserve);
               movieItem = null;
            } catch (Exception e1) {
               e1.printStackTrace();
            }
            movieTabbedPane.setSelectedIndex(4);
         }
      });
      btnNewButton_23.setBounds(129, 10, 97, 39);
      panel_2.add(btnNewButton_23);
      
      JPanel reserveListPanel = new JPanel();
      /************************************************/
      reserveListPanel.addComponentListener(new ComponentAdapter() {
          public void componentShown(ComponentEvent e) {
             try {
                movieRListDisplay();
             }catch(Exception e1) {
                e1.printStackTrace();
             }
          }
       });
      /************************************************/
      movieTabbedPane.addTab("예매내역", null, reserveListPanel, null);
      reserveListPanel.setLayout(null);
      
      JScrollPane scrollPane_3 = new JScrollPane();
      scrollPane_3.setBounds(12, 10, 356, 216);
      reserveListPanel.add(scrollPane_3);
      
      reserveTable = new JTable();
      reserveTable.setModel(new DefaultTableModel(
         new Object[][] {
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
         },
         new String[] {
            "\uC601\uD654\uC81C\uBAA9", "\uC0C1\uC601\uB0A0\uC9DC", "\uC0C1\uC601\uC2DC\uAC04", "\uC601\uD654\uAD00", "\uC0C1\uC601\uAD00", "\uC88C\uC11D"
         }
      ));
      scrollPane_3.setViewportView(reserveTable);
      
     /*************************************productItemPanel*******************/
      
      
      
      
      
      JPanel userPanel = new JPanel();
      tabbedPane.addTab("회원", null, userPanel, null);
      userPanel.setLayout(new BorderLayout(0, 0));
      
      userTabbedPane = new JTabbedPane(JTabbedPane.TOP);
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
    /**********************회원가입**************************/
         public void actionPerformed(ActionEvent e) {
            try {

                 String id = idTF.getText();
                 String password = passwordTF.getText();
                 String name = nameTF.getText();
                 String jumin = juminTF.getText();
                 String phone = phoneTF.getText();
                 String email = emailTF.getText();
                 
                 if (id.equals("") || password.equals("") || name.equals("") || jumin.equals("") || phone.equals("")
                       || email.equals("")) {
                    messageLB.setText("* 내용을 입력하세요");
                    return;
                 }else {
                    User createUser = new User(id,name,phone,jumin,email,password);
                    UserService userservice = new UserService();
              
                    int isSuccess = 
                    userservice.create(createUser);
                if(isSuccess==1) {
                   userTabbedPane.setSelectedIndex(1);
                }else {
                   JOptionPane.showMessageDialog(null, "다시 시도해주십시오.");
                   idTF.requestFocus();
               idTF.setSelectionStart(0);
               idTF.setSelectionEnd(id.length());
                }
                 }
              } catch (Exception e1) {
                 e1.printStackTrace();
              }
            /******************************/
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
      loginBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
      /********************로그인**********************/
            try {
                String id = loginIdTF.getText();
                String password = loginPasswordTF.getText();
                UserService loginService = new UserService();
                int result = loginService.login(id, password);
                if (result == 1) {
                   loginMessageLB.setText("로그인완료");
                   loginProcess(id);
                  
                } else if (result == 0) {
                   loginMessageLB.setText("로그인실패");
                }
             } catch (Exception e1) {

             }
          }
       });
        loginMessageLB = new JLabel("");
      loginMessageLB.setBounds(141, 235, 181, 21);
      loginPanel.add(loginMessageLB);

      loginBtn.setBounds(64, 303, 97, 23);
      loginPanel.add(loginBtn);
      
      JButton cancleBtn2 = new JButton("취소");
      cancleBtn2.setBounds(214, 303, 97, 23);
      loginPanel.add(cancleBtn2);
      
      changePanel = new JPanel();
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
      
      c_idTF = new JTextField();
      c_idTF.setBounds(182, 46, 116, 21);
      changePanel.add(c_idTF);
      c_idTF.setColumns(10);
      
      c_passwordTF = new JTextField();
      c_passwordTF.setColumns(10);
      c_passwordTF.setBounds(182, 92, 116, 21);
      changePanel.add(c_passwordTF);
      
      c_nameTF = new JTextField();
      c_nameTF.setColumns(10);
      c_nameTF.setBounds(182, 142, 116, 21);
      changePanel.add(c_nameTF);
      
      c_juminTF = new JTextField();
      c_juminTF.setColumns(10);
      c_juminTF.setBounds(182, 196, 116, 21);
      changePanel.add(c_juminTF);
      
      c_phoneTF = new JTextField();
      c_phoneTF.setColumns(10);
      c_phoneTF.setBounds(182, 253, 116, 21);
      changePanel.add(c_phoneTF);
      
      c_emailTF = new JTextField();
      c_emailTF.setColumns(10);
      c_emailTF.setBounds(182, 307, 116, 21);
      changePanel.add(c_emailTF);
      
      JButton memberUpdateBtn = new JButton("수정");
      memberUpdateBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
                c_idTF.setText(loginUser.getUserId());
                c_juminTF.setText(loginUser.getUserJumin());
                String password = c_passwordTF.getText();
                String email = c_emailTF.getText();
                String name = c_nameTF.getText();
                String phone = c_phoneTF.getText();
                
               loginUser.setUserPassword(password);
               loginUser.setUserEmail(email);
               loginUser.setUserName(name);
               loginUser.setUserPhNum(phone);
               
                UserService upservice = new UserService();
                upservice.update(loginUser);
                updateMessageLB.setText("수정완료");

             } catch (Exception e1) {
                updateMessageLB.setText("수정실패");
             }
          }
       });

      memberUpdateBtn.setBounds(64, 396, 97, 23);
      changePanel.add(memberUpdateBtn);
      
      JButton memberDeleteBtn = new JButton("삭제");
      memberDeleteBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
                String c_id = c_idTF.getText();
                userService.remove(c_id);

             } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
             }
          }
       });

      memberDeleteBtn.setBounds(210, 396, 97, 23);
      changePanel.add(memberDeleteBtn);
      
      updateMessageLB = new JLabel("");
      updateMessageLB.setBounds(98, 352, 200, 21);
      changePanel.add(updateMessageLB);
      
      JPanel centerPanel = new JPanel();
      tabbedPane.addTab("고객센터", null, centerPanel, null);
      centerPanel.setLayout(new BorderLayout(0, 0));
      
      gongjiTabbedPane = new JTabbedPane(JTabbedPane.TOP);
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
            //아이디가 입력되어야하는데...
            
            try {
               String qTitle = q_titleTF.getText();
               String qCateOne = (String)q_oneCateCB.getSelectedItem();               
               String qCateTwo = (String)q_twoCateCB.getSelectedItem();               
               String qContent = q_contentTA.getText();
            
            Question newQuestion = new Question(0, new User(loginUser.getUserId()), qTitle, qContent, qCateOne, qCateTwo, null);
            QuestionService questionService = new QuestionService();

            System.out.println("dd");
            int isSuccess = 

                  questionService.addQuestion(newQuestion);
            	  JOptionPane.showMessageDialog(null, "문의등록이 완료되었습니다.");
            	  gongjiTabbedPane.setSelectedIndex(3);
            	  
               
            }catch(Exception e1) {
               e1.printStackTrace();
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
      personalQPanel.addComponentListener(new ComponentAdapter() {
    /*******************1대1문의***********************/
      	@Override
      	public void componentShown(ComponentEvent e) {
      		try {
				questionListDisplay();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
      	}
      });
      /**************************************************/
    
      gongjiTabbedPane.addTab("문의목록", null, personalQPanel, null);
      personalQPanel.setLayout(null);
      
      JScrollPane scrollPane_2 = new JScrollPane();
      scrollPane_2.setBounds(12, 10, 356, 202);
      personalQPanel.add(scrollPane_2);
      
      questionListTable = new JTable();
      /*******************************************************/
      questionListTable.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
            try {
               int selectedRow = questionListTable.getSelectedRow();
               int selectedQuestionNo = (int)questionListTable.getValueAt(selectedRow,0);
               String UserId = loginUser.getUserId();
               Question findQuestion = questionService.selectByNo(UserId, selectedQuestionNo);
               String noStr = findQuestion.getQuestion_no()+"";
               
               p_noTF.setText(noStr);
               p_oneCateTF.setText(findQuestion.getQuestion_cate_one());
               p_twoCateTF.setText(findQuestion.getQuestion_cate_two());
               p_titleTF.setText(findQuestion.getQuestion_title());
               p_contentTA.setText(findQuestion.getQuestion_content());
              
               
            }catch(Exception e1) {
               e1.printStackTrace();
            }
         }
      });
      /*******************************************************/
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
      
      p_contentTA = new JTextArea();
      p_contentTA.setBounds(12, 282, 356, 201);
      personalQPanel.add(p_contentTA);
      
      questionDeleteBtn = new JButton("삭제");
      /*****************1:1문의삭제버튼******************/
      questionDeleteBtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String p_no = p_noTF.getText();
				questionService.deleteQuestion(Integer.parseInt(p_no));
				questionListDisplay();
				
				p_noTF.setText("");
	            p_oneCateTF.setText("");
	            p_twoCateTF.setText("");
	            p_titleTF.setText("");
	            p_contentTA.setText("");
	            questionDeleteBtn.setSelected(false);
				
				
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
			
		}
	});
      
      
      questionDeleteBtn.setBounds(298, 250, 58, 23);
      personalQPanel.add(questionDeleteBtn);
      //productList();

      gongjiService = new GongjiService();
      faqService = new FaqService();
      questionService = new QuestionService();
      movieReserveService=new MovieReserveService();

      movieItem = new MovieItem();
      seatListDisplay(movieItem.getI_code(),movieItem.getI_day(),movieItem.getI_daytime(),movieItem.getI_cname(),movieItem.getI_cplace());
      logoutProcess();

   }//생성자끝
   /******************* 좌석리스트 *************/
	
   JButton[] buttonArray = new JButton[20];

	public void seatListDisplay(int movieCode,String movieDay,String movieDT,String movieCname,String movieCplace) throws Exception {
		
		
		List<MovieReserve> final_mv=new ArrayList<MovieReserve>();
		
		//String cinema_place="1관";
		//String cinema_name = movieItem.getI_cname();
		//int mov_code = movieItem.getI_code();
		//String daytime="09시~11시";
		//String dayd =movieItem.getI_day();
		
		List<MovieReserve> mv1= movieReserveService.myReserve("guard1");
		List<MovieReserve> mv2= movieReserveService.myReserve("guard2");
		List<MovieReserve> mv3= movieReserveService.myReserve("guard3");
		List<MovieReserve> mv4= movieReserveService.myReserve("guard4");
		List<MovieReserve> mv5= movieReserveService.myReserve("guard5");
		List<MovieReserve> mv6= movieReserveService.myReserve("guard6");
		
		mv1.addAll(mv2);
		mv1.addAll(mv3);
		mv1.addAll(mv4);
		mv1.addAll(mv5);
		mv1.addAll(mv6);
		
		
		System.out.println(mv1.size());
		for(MovieReserve mv:mv1) {
			
			if(mv.getCinema_place().equals(movieCplace) && mv.getMovie_daytime().equals(movieDT)&& mv.getMovie_day().equals(movieDay) && mv.getMovie().getMovie_code() == movieCode && mv.getCinema_name().equals(movieCname)) {
				final_mv.add(mv);
				System.out.println(final_mv.size());
				
			}
		}
		
		
		
		
		
		
		panel.removeAll();
		for (int i = 0; i < 20; i++) {
			int b=i+1;
			JButton btnNewButton_3 = new JButton((i + 1) + "");
			btnNewButton_3.setIcon(new ImageIcon(GuardMainFrame.class.getResource("/images/seat.png")));
			btnNewButton_3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton selectecButton = (JButton) e.getSource();
					System.out.println(selectecButton.getText() + "번좌석");
				
					movieItem.setI_seat(b);
				}
			});
			panel.add(btnNewButton_3);
			buttonArray[i] = btnNewButton_3;
		}
		System.out.println(final_mv.size());
		for(int i=0;i<20;i++) {
			int seat_no=i+1;
			for (MovieReserve movieReserve : final_mv) {
				if(seat_no == movieReserve.getMovie_seat_num()) {
					System.out.println("좌석번호-->"+seat_no);
					
					/*
					if(movieReserve.getUser().getUserId().equals(loginUser.getUserId())) {
						buttonArray[i+1].setText(buttonArray[i+1].getText()+"[내 예약]");
					}
					*/
					
					buttonArray[seat_no-1].setEnabled(false);
				}
			}
		}
		
	}

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
   /**********************Question리스트**********************/
   public void questionListDisplay() throws Exception{
      List<Question> questionList = questionService.selectAll(loginUser.getUserId());
      Vector questionListVector = new Vector();
      
      for(Question question : questionList) {
         Vector rowVector = new Vector();
         rowVector.add(question.getQuestion_no());
         rowVector.add(question.getQuestion_cate_one());
         rowVector.add(question.getQuestion_cate_two());
         rowVector.add(question.getQuestion_title());
         rowVector.add(question.getQuestion_date());
         
         questionListVector.add(rowVector);
      }
      
      Vector columnVector = new Vector();
      columnVector.add("번호");
      columnVector.add("대분류");
      columnVector.add("소분류");
      columnVector.add("문의제목");
      columnVector.add("문의날짜");
      
      
      DefaultTableModel defaultTableModel=
            new DefaultTableModel(questionListVector, columnVector);
      questionListTable.setModel(defaultTableModel);
      
      
   }
   /***************************************************/
   /**********************에매내역리스트***********************/
   public void movieRListDisplay() throws Exception{
	   List<MovieReserve> movieReserveList = movieReserveService.myReserve(loginUser.getUserId());
	   Vector movieRListVector = new Vector();
	   
	   for(MovieReserve movieReserve : movieReserveList) {
		   Vector rowVector = new Vector();
		   rowVector.add(movieReserve.getMovie().getMovie_title());
		   rowVector.add(movieReserve.getMovie_day());
		   rowVector.add(movieReserve.getMovie_daytime());
		   rowVector.add(movieReserve.getCinema_name());
		   rowVector.add(movieReserve.getCinema_place());
		   rowVector.add(movieReserve.getMovie_seat_num());
	       
	       movieRListVector.add(rowVector);
	   }
	   	Vector columnVector = new Vector();
	       columnVector.add("영화제목");
	       columnVector.add("상영날짜");
	       columnVector.add("상영시간");
	       columnVector.add("영화관");
	       columnVector.add("상영관");
	       columnVector.add("좌석");
	       
	       DefaultTableModel defaultTableModel=
	               new DefaultTableModel(movieRListVector, columnVector);
	         reserveTable.setModel(defaultTableModel);
	         
   }
   
   /***********************************************************/
   /*****************로그인시 호출할메소드********************/
   public void loginProcess(String id)throws Exception {
      /*
       * 1.로그인멤버객체 저장
       * 2.MemberMainFrame타이틀변경
       * 3.로그인,회원가입 tab 불활성화 
       * 4.로그아웃메뉴아이템 활성화
       * 5.상영영화페이지로 이동
       */
      UserService inService = new UserService();
      User loginSuccessUser=inService.finduserInfo(id);
      loginUser = loginSuccessUser;
      setTitle(loginUser.getUserId());
      
      reserveBtn1.setEnabled(true);
	  reserveBtn2.setEnabled(true);
	  reserveBtn3.setEnabled(true);
	  reserveBtn4.setEnabled(true);
      userTabbedPane.setEnabledAt(0, false);
      userTabbedPane.setEnabledAt(1, false);
      userTabbedPane.setEnabledAt(2, true);
      movieTabbedPane.setEnabledAt(2, true);
	  movieTabbedPane.setEnabledAt(3, true);
	  movieTabbedPane.setEnabledAt(4, true);
      gongjiTabbedPane.setEnabledAt(2, true);
      gongjiTabbedPane.setEnabledAt(3, true);
      tabbedPane.setSelectedIndex(0);
      
      //setTitle(loginSuccessUser.getUserName());
      //memberTabbedPane.setEnabledAt(0, false);
      //memberTabbedPane.setEnabledAt(1, false);
      //memberTabbedPane.setEnabledAt(2, true);
      //memberTabbedPane.setSelectedIndex(2);
   }
   /*******************로그아웃시호출할메쏘드******************/
	public void logoutProcess() {
		/*
		 * 1.로그인멤버객체 삭제
		 * 2.MemberMainFrame타이틀변경
		 * 3.로그인,회원가입 tab 활성화
		 * 4.로그아웃메뉴아이템 불활성화
		 * 5.회원리스트탭 불활성화
		 */
		this.loginUser = null;
		setTitle("");
		
		reserveBtn1.setEnabled(false);
		reserveBtn2.setEnabled(false);
		reserveBtn3.setEnabled(false);
		reserveBtn4.setEnabled(false);
		userTabbedPane.setEnabledAt(0, true);
	    userTabbedPane.setEnabledAt(1, true);
	    userTabbedPane.setEnabledAt(2, false);
	    movieTabbedPane.setEnabledAt(2, false);
	    movieTabbedPane.setEnabledAt(3, false);
	    movieTabbedPane.setEnabledAt(4, false);
	    gongjiTabbedPane.setEnabledAt(2, false);
	    gongjiTabbedPane.setEnabledAt(3, false);
	    tabbedPane.setSelectedIndex(0);
	      
		
		
	}
   
   /*******************얘는 뭐임**********************/
   /*
   public  void productList() {
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
   */
}