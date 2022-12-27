import gui.Interfaz;


public class JugadorCampo extends Futbolista{
	private String posicion;
	private int fuerzaTiro;
	private int precisionPases;
	private int estadoFisico;
	
	public JugadorCampo() {
		System.out.println("Se crea el objeto de Jugador Campo");
		mostrarVentana();
	}

	public JugadorCampo(String nombre, String nacionalidad, Fecha fechaNacimiento, int numero, String valorActual, String perfil, String posicion, int fuerzaTiro, int precisionPases, int estadoFisico ) {
		super(nombre,nacionalidad,fechaNacimiento,numero,valorActual,perfil);
		System.out.println("Se crea el objeto de Jugador Campo");
		this.posicion=posicion; 
		this.fuerzaTiro=fuerzaTiro;
		this.precisionPases=precisionPases;
		this.estadoFisico=estadoFisico;
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

	public int getPrecisionPases() {
		return precisionPases;
	}
	public void setPrecisionPases(int precisionPases) {
		this.precisionPases=precisionPases;
	}

	public int getEstadoFisico() {
		return estadoFisico;
	}
	public void setEstadOFisico(int estadoFisico) {
		this.estadoFisico=estadoFisico;
	}


	public void leerDatos() {
		super.LeerDatos();
		System.out.println("Ingrese posicion del jugador (Defensa, Centrocampista, Delantero): ");
		this.posicion=lee.nextLine();
		System.out.println("Ingrese la fuerza de tiro del jugador: ");
		this.fuerzaTiro=lee.nextInt();
		System.out.println("Ingrese la precision de pases del portero (0-100): ");
		this.precisionPases=lee.nextInt();
		System.out.println("Ingrese el estado fisico del portero (0-100): ");
		this.estadoFisico=lee.nextInt();
		
	}

	public void mostrarEstadisticas() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Nacionalidad: "+this.getNacionalidad());
		System.out.println("Fecha de nacimiento: "+this.getFechaNacimiento());
		System.out.println("Numero: "+this.getNumero());
		System.out.println("Valor actual: "+this.getValorActual());
		System.out.println("Pierna preferida: "+this.getPefil());
		System.out.println("Posicion: "+this.getPosicion());
		System.out.println("Fuerza de Tiro: "+this.getFuerzaTiro());
		System.out.println("Precision de pases: "+this.getPrecisionPases());
		System.out.println("Estado fisico: "+this.getEstadoFisico()+"\n");
	}
	
	public void mostrarVentana() {
		Interfaz miVentana=new Interfaz();
		 miVentana.setVisible(true);
	}
}
