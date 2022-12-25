package clases;
import gui.Interfaz;

public class PruebaAlineacion {

	public JugadorCampo[] alineacion() {
		
		JugadorCampo arrayJugadores[]=new JugadorCampo[10];
		Fecha arrayFecha[]=new Fecha[10];
		
		arrayFecha[0]=new Fecha((byte)19, (byte)12, (short)1987);
		arrayJugadores[0]=new JugadorCampo("Karim Benzema", "Francia", arrayFecha[0], 9, "Delantero");
		
		arrayFecha[1]=new Fecha((byte)9, (byte)9, (short)1985);
		arrayJugadores[1]=new JugadorCampo("Luka Modric", "Croacia", arrayFecha[1], 10, "Centrocampista");
		
		arrayFecha[2]=new Fecha((byte)27, (byte)1, (short)2000);
		arrayJugadores[2]=new JugadorCampo("Aurelien Tchouameni", "Francia", arrayFecha[2], 18, "Centrocampista");
		
		arrayFecha[3]=new Fecha((byte)10, (byte)11, (short)2002);
		arrayJugadores[3]=new JugadorCampo("Eduardo Camavinga", "Angola", arrayFecha[3], 12, "Centrocampista");
		
		arrayFecha[4]=new Fecha((byte)4, (byte)1, (short)1990);
		arrayJugadores[4]=new JugadorCampo("Toni Kroos", "Alemania", arrayFecha[4], 8, "Centrocampista");
		
		arrayFecha[5]=new Fecha((byte)22, (byte)7, (short)1998);
		arrayJugadores[5]=new JugadorCampo("Federico Valverde", "Uruguay", arrayFecha[5], 15, "Centrocampista");
		
		arrayFecha[6]=new Fecha((byte)8, (byte)6, (short)1995);
		arrayJugadores[6]=new JugadorCampo("Ferland Mendy", "Francia", arrayFecha[6], 23, "Defensa");
		
		arrayFecha[7]=new Fecha((byte)3, (byte)3, (short)1993);
		arrayJugadores[7]=new JugadorCampo("Antonio Rudiger", "Alemania", arrayFecha[7], 22, "Defensa");

		arrayFecha[8]=new Fecha((byte)24, (byte)6, (short)1992);
		arrayJugadores[8]=new JugadorCampo("David Alaba", "Austria", arrayFecha[8], 4, "Defensa");
		
		arrayFecha[9]=new Fecha((byte)11, (byte)1, (short)1992);
		arrayJugadores[9]=new JugadorCampo("Daniel Carvajal", "España", arrayFecha[9], 2, "Defensa");
		
		
		
		
		//int i;
		//for (i=0;i<10;i++) {
		//	arrayJugadores[i].mostrarEstadisticas();
		//}
		
		//p1.mostrarEstadisticas();
		//Interfaz miVentana=new Interfaz();
		//miVentana.setVisible(true);
		return  arrayJugadores;
		
	}
	
	public JugadorPortero alineacionPortero() {
		
		Fecha fechaPortero=new Fecha((byte)11, (byte)5, (short)1992);
		JugadorPortero p1=new JugadorPortero("Thibaut Courtois", "Belgica", fechaPortero, 1,200);
		return p1;
	}
	
	public JugadorCampo[] bancaCampo() {
		
		JugadorCampo arrayBancaCampo[]=new JugadorCampo[3];
		
		arrayBancaCampo[0]=new JugadorCampo();
		arrayBancaCampo[0].leerDatos();
		
		arrayBancaCampo[1]=new JugadorCampo();
		arrayBancaCampo[1].leerDatos();
		
		arrayBancaCampo[2]=new JugadorCampo();
		arrayBancaCampo[2].leerDatos();
		
		return arrayBancaCampo;
	} 
	
	public static void main(String[] args) {

		
		Interfaz miVentana=new Interfaz();
		miVentana.setVisible(true);
	}

}
