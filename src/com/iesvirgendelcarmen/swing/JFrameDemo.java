package com.iesvirgendelcarmen.swing;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameDemo extends JFrame {

	int contador = 0;
	JLabel etiqueta;
	String mensaje = "Número de clicks: ";
	public JFrameDemo(){
		inicializar();
	}
	
	public void inicializar() {
		setTitle("Mi primera Aplicacion");
		setSize(new Dimension(400, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//setLocation(new Point(500, 200));
		//centra la ventana en el escritorio
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		//creamos el boton
		JButton boton = new JButton();
		boton.setText("Boton Contar");
		boton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				contador++;
				etiqueta.setText(mensaje+contador);
				int suma = 0;
				for (int i = 0; i <10; i++) {
					suma+=1;
				}
			}
			
		});
		panel.add(boton);
		
		etiqueta = new JLabel(mensaje+contador);
		panel.add(etiqueta);
		
		
		
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrameDemo ventana = new JFrameDemo();				
			}
		});
	}

}
