package clases;
import gui.Interfaz;

public class JugadorCampo extends Futbolista{
	private String posicion;
	private int fuerzaTiro;
	
	public JugadorCampo() {
		System.out.println("Se crea el objeto de Jugador Campo");
		mostrarVentana();
	}

	public JugadorCampo(String nombre, String nacionalidad, Fecha fechaNacimiento, int numero, String valorActual, String perfil, String posicion, int fuerzaTiro ) {
		super(nombre,nacionalidad,fechaNacimiento,numero,valorActual,perfil);
		System.out.println("Se crea el objeto de Jugador Campo");
		this.posicion=posicion; 
		this.fuerzaTiro=fuerzaTiro;
	}
	
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion=posicion;
	}
	
	public int getFuerzaTiro() {
		return fuerzaTiro;
	}
	public void setFuerzaTiro(int fuerzaTiro) {
		this.fuerzaTiro=fuerzaTiro;
	}

	public void leerDatos() {
		super.LeerDatos();
		System.out.println("Ingrese posicion del jugador (Defensa, Centrocampista, Delantero): ");
		this.posicion=lee.nextLine();
		System.out.println("Ingrese la fuerza de tiro del jugador: ");
		this.fuerzaTiro=lee.nextInt();
		
	}

	public void mostrarEstadisticas() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Nacionalidad: "+this.getNacionalidad());
		System.out.println("Fecha de nacimiento: "+this.getFechaNacimiento());
		System.out.println("Numero: "+this.getNumero());
		System.out.println("Valor actual: "+this.getValorActual());
		System.out.println("Pierna preferida: "+this.getPefil());
		System.out.println("Posicion: "+this.getPosicion());
		System.out.println("Fuerza de Tiro: "+this.getFuerzaTiro()+"\n");
	}
	
	public void mostrarVentana() {
		Interfaz miVentana=new Interfaz();
		 miVentana.setVisible(true);
	}
}
