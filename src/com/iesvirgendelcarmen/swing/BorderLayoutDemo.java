package com.iesvirgendelcarmen.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

public class BorderLayoutDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutDemo window = new BorderLayoutDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BorderLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creamos los paneles
		JPanel panelNorte = new JPanel();
		panelNorte.setBackground(Color.RED);
		panelNorte.setForeground(new Color(255, 0, 0));
		JPanel panelSur = new JPanel();
		panelSur.setBackground(Color.MAGENTA);
		JPanel panelEste = new JPanel();
		panelEste.setBackground(Color.YELLOW);
		
		//creamos los componenentes
		JButton boton1 = new JButton("Boton1");
		JButton boton2 = new JButton("Boton 2");
		JTextField texto1 = new JTextField();
		texto1.setColumns(10);
		
		//añadimos los paneles a la ventana
		frame.getContentPane().add(panelNorte,BorderLayout.NORTH);
		frame.getContentPane().add(panelEste,BorderLayout.EAST);
		frame.getContentPane().add(panelSur,BorderLayout.SOUTH);
		
		//añadimos los componenentes a los paneles
		panelNorte.add(boton1);
		panelEste.add(boton2);
		panelSur.add(texto1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
	}

}
