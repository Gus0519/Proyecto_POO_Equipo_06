
public class PruebaAlineacion {

	public static void main(String[] args) {
		
		JugadorCampo arrayJugadores[]=new JugadorCampo[10];
		Fecha arrayFecha[]=new Fecha[11];
		
		arrayFecha[0]=new Fecha((byte)19, (byte)12, (short)1987);
		arrayJugadores[0]=new JugadorCampo("Karim Benzema", "Francia", arrayFecha[0], 9, "13.2 millones de euros","Derecha", "Delantero","Real madrid", 180, 82, 80);
		
		arrayFecha[1]=new Fecha((byte)9, (byte)9, (short)1985);
		arrayJugadores[1]=new JugadorCampo("Luka Modric", "Croacia", arrayFecha[1], 10, "10 millones de euros", "Derecha","Centrocampista","Real madrid", 120, 94, 85);
		
		arrayFecha[2]=new Fecha((byte)27, (byte)1, (short)2000);
		arrayJugadores[2]=new JugadorCampo("Aurelien Tchouameni", "Francia", arrayFecha[2], 18, "90 millones de euros", "Derecha", "Centrocampista","Real madrid", 195, 83, 91);
		
		arrayFecha[3]=new Fecha((byte)10, (byte)11, (short)2002);
		arrayJugadores[3]=new JugadorCampo("Eduardo Camavinga", "Angola", arrayFecha[3], 12, "50 millones de euros", "Izquierda", "Centrocampista","Real madrid", 173, 86, 97);
		
		arrayFecha[4]=new Fecha((byte)4, (byte)1, (short)1990);
		arrayJugadores[4]=new JugadorCampo("Toni Kroos", "Alemania", arrayFecha[4], 8, "20 millones de euros", "Derecha", "Centrocampista","Real madrid", 169, 89, 94);
		
		arrayFecha[5]=new Fecha((byte)22, (byte)7, (short)1998);
		arrayJugadores[5]=new JugadorCampo("Federico Valverde", "Uruguay", arrayFecha[5], 15, "100 millones de  euros", "Derecho", "Centrocampista","Real madrid", 183, 90, 84);
		
		arrayFecha[6]=new Fecha((byte)8, (byte)6, (short)1995);
		arrayJugadores[6]=new JugadorCampo("Ferland Mendy", "Francia", arrayFecha[6], 23, "40 millones de euros", "Izquierdo", "Defensa","Real madrid", 193, 88, 96);
		
		arrayFecha[7]=new Fecha((byte)3, (byte)3, (short)1993);
		arrayJugadores[7]=new JugadorCampo("Antonio Rudiger", "Alemania", arrayFecha[7], 22, "40 millones de euros", "Derecho", "Defensa","Real madrid", 178, 93, 99);

		arrayFecha[8]=new Fecha((byte)24, (byte)6, (short)1992);
		arrayJugadores[8]=new JugadorCampo("David Alaba", "Austria", arrayFecha[8], 4, "55 millones de euros", "Izquierda", "Defensa","Real madrid", 168, 96, 95);
		
		arrayFecha[9]=new Fecha((byte)11, (byte)1, (short)1992);
		arrayJugadores[9]=new JugadorCampo("Daniel Carvajal", "España", arrayFecha[9], 2, "18 millones de euros", "Derecha", "Defensa","Real madrid", 181, 80, 89);
		
		arrayFecha[10]=new Fecha((byte)11, (byte)5, (short)1992);
		JugadorPortero p1=new JugadorPortero("Thibaut Courtois", "Belgica", arrayFecha[10], 1,"60 millones de euros", "Izquierda","Real madrid", 200, 93);
		
		
		int i;
		for (i=0;i<10;i++) {
			arrayJugadores[i].mostrarEstadisticas();
		}
		
		p1.mostrarEstadisticas();
		//JugadorCampo j1=new JugadorCampo();
	}

}
