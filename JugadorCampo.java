import gui.Interfaz;

public class JugadorCampo extends Futbolista{
	private String posicion;
	
	public JugadorCampo() {
		System.out.println("Se crea el objeto de Jugador Campo");
		mostrarVentana();
	}
	public JugadorCampo(String nombre, String nacionalidad, Fecha fechaNacimiento, int numero, String posicion) {
		super(nombre,nacionalidad,fechaNacimiento,numero);
		System.out.println("Se crea el objeto de Jugador Campo");
		this.posicion=posicion; 
	}
	
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion=posicion;
	}
	
	public void leerDatos() {
		super.LeerDatos();
		System.out.println("Ingrese posicion del jugador (Defensa, Centrocampista, Delantero): ");
		this.posicion=lee.nextLine();
		
	}

	public void mostrarEstadisticas() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Nacionalidad: "+this.getNacionalidad());
		System.out.println("Fecha de nacimiento: "+this.getFechaNacimiento());
		System.out.println("Numero: "+this.getNumero());
		System.out.println("Posicion: "+this.getPosicion()+"\n");
	}
	
	public void mostrarVentana() {
		Interfaz miVentana=new Interfaz();
		 miVentana.setVisible(true);
	}
}
