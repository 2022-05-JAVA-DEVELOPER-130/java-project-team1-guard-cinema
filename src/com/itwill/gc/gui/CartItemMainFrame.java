package com.itwill.gc.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class CartItemMainFrame extends JFrame {

	private JPanel contentPane;
	private JTabbedPane FoodtabbedPane;
	private JPanel panel_2;
	private JButton goToCartBtn;
	private JButton goToBuyBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartItemMainFrame frame = new CartItemMainFrame();
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
	public CartItemMainFrame() {
		setTitle("맛있는 팝콘");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		FoodtabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(FoodtabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		FoodtabbedPane.addTab("상품 목록", null, panel, null);
		panel.setLayout(null);
		
		goToCartBtn = new JButton("장바구니");
		goToCartBtn.setBounds(30, 398, 97, 23);
		panel.add(goToCartBtn);
		
		goToBuyBtn = new JButton("구매하기");
		goToBuyBtn.setBounds(192, 398, 97, 23);
		panel.add(goToBuyBtn);
		
		JPanel panel_1 = new JPanel();
		FoodtabbedPane.addTab("장바구니", null, panel_1, null);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		FoodtabbedPane.addTab("구매목록", null, panel_2, null);
		panel_2.setLayout(null);
	}

}
