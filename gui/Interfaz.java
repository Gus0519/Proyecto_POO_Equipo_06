package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnMostrarEquipo;
	
	public Interfaz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Partido");
		setLocationRelativeTo(null);
		
		JLabel lblTitulo = new JLabel("Partido");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(10, 11, 579, 32);
		contentPane.add(lblTitulo);
		
		JLabel lblEquipo = new JLabel("Real Madrid");
		lblEquipo.setBounds(29, 71, 72, 14);
		contentPane.add(lblEquipo);
		
		btnMostrarEquipo = new JButton("Mostrar equipo");
		btnMostrarEquipo.addActionListener(this);
	
		btnMostrarEquipo.setBounds(23, 135, 89, 123);
		contentPane.add(btnMostrarEquipo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnMostrarEquipo==e.getSource()) {
			JOptionPane.showMessageDialog(null,"Hola");
		}
		
	}
}
