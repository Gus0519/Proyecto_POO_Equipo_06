package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.JugadorCampo;
import clases.JugadorPortero;
import clases.PruebaAlineacion;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Interfaz extends JFrame implements ActionListener{

	private JPanel panelPrincipal;
	JButton btnMostrarEquipo;
	PruebaAlineacion miAlineacion=new PruebaAlineacion();
	JugadorCampo[] arrayJugadores=miAlineacion.alineacion();
	JugadorPortero portero=miAlineacion.alineacionPortero();
	//JugadorCampo[] arrayJugadoresBanca=miAlineacion.bancaCampo();
	
	public Interfaz() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 503);
		setTitle("Partido");
		setLocationRelativeTo(null);
		iniciarComponentes();

	}
	

	
	
	private void iniciarComponentes() {
		
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imagenes\\\\Real madrid.png"));
		lblNewLabel.setBounds(10, 0, 89, 94);
		panelPrincipal.add(lblNewLabel);
		
		JLabel lblEquipo = new JLabel("Real Madrid");
		lblEquipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblEquipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEquipo.setBounds(10, 90, 118, 25);
		panelPrincipal.add(lblEquipo);
		
		btnMostrarEquipo = new JButton("Mostrar equipo");
		btnMostrarEquipo.addActionListener(this);
		btnMostrarEquipo.setBounds(548, 155, 89, 123);
		panelPrincipal.add(btnMostrarEquipo);
		
		JLabel lblMarcador = new JLabel("Marcador");
		lblMarcador.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarcador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcador.setBounds(10, 90, 667, 25);
		panelPrincipal.add(lblMarcador);
		
		JLabel lblPsg = new JLabel("PSG  ");
		lblPsg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPsg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPsg.setBounds(616, 90, 61, 25);
		panelPrincipal.add(lblPsg);
		
		
		
		
		JLabel lblJugador0 = new JLabel();
		lblJugador0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador0.setBounds(10, 126, 191, 19);
		panelPrincipal.add(lblJugador0);
		lblJugador0.setText(arrayJugadores[0].getNumero()+" "+arrayJugadores[0].getNombre());
		
		JLabel lblJugador1 = new JLabel();
		lblJugador1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador1.setBounds(10, 150, 191, 19);
		panelPrincipal.add(lblJugador1);
		lblJugador1.setText(arrayJugadores[1].getNumero()+" "+arrayJugadores[1].getNombre());
		
		JLabel lblJugador2 = new JLabel();
		lblJugador2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador2.setBounds(10, 174, 191, 19);
		panelPrincipal.add(lblJugador2);
		lblJugador2.setText(arrayJugadores[2].getNumero()+" "+arrayJugadores[2].getNombre());
		
		JLabel lblJugador3 = new JLabel();
		lblJugador3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador3.setBounds(10, 198, 191, 19);
		panelPrincipal.add(lblJugador3);
		lblJugador3.setText(arrayJugadores[3].getNumero()+" "+arrayJugadores[3].getNombre());
		
		JLabel lblJugador4 = new JLabel();
		lblJugador4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador4.setBounds(10, 222, 191, 19);
		panelPrincipal.add(lblJugador4);
		lblJugador4.setText(arrayJugadores[4].getNumero()+" "+arrayJugadores[4].getNombre());
		
		JLabel lblJugador5 = new JLabel();
		lblJugador5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador5.setBounds(10, 246, 191, 19);
		panelPrincipal.add(lblJugador5);
		lblJugador5.setText(arrayJugadores[5].getNumero()+" "+arrayJugadores[5].getNombre());
		
		JLabel lblJugador6 = new JLabel();
		lblJugador6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador6.setBounds(10, 270, 191, 19);
		panelPrincipal.add(lblJugador6);
		lblJugador6.setText(arrayJugadores[6].getNumero()+" "+arrayJugadores[6].getNombre());
		
		JLabel lblJugador7 = new JLabel();
		lblJugador7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador7.setBounds(10, 294, 191, 19);
		panelPrincipal.add(lblJugador7);
		lblJugador7.setText(arrayJugadores[7].getNumero()+" "+arrayJugadores[7].getNombre());
		
		JLabel lblJugador8 = new JLabel();
		lblJugador8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador8.setBounds(10, 318, 191, 19);
		panelPrincipal.add(lblJugador8);
		lblJugador8.setText(arrayJugadores[8].getNumero()+" "+arrayJugadores[8].getNombre());

		JLabel lblJugador9 = new JLabel();
		lblJugador9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugador9.setBounds(10, 342, 191, 19);
		panelPrincipal.add(lblJugador9);
		lblJugador9.setText(arrayJugadores[9].getNumero()+" "+arrayJugadores[9].getNombre());
		
		JLabel lblJugadorPortero = new JLabel();
		lblJugadorPortero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJugadorPortero.setBounds(10, 366, 191, 19);
		panelPrincipal.add(lblJugadorPortero);
		lblJugadorPortero.setText(portero.getNumero()+" "+portero.getNombre());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnMostrarEquipo==e.getSource()) {
			JOptionPane.showMessageDialog(null,arrayJugadores[0].getNombre()+"\n"+arrayJugadores[0].getNacionalidad()+"\n"+arrayJugadores[0].getFechaNacimiento()+"\n"+arrayJugadores[0].getNumero()+"\n"+arrayJugadores[0].getPosicion());
	
		}
		
	}
}
