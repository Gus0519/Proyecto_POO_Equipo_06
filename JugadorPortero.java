public class JugadorPortero extends Futbolista{
	
	private float altura;
	private int reflejos;
	
	public JugadorPortero() {
		System.out.println("Se crea el objeto de Jugador Campo");
	}
	public JugadorPortero(String nombre, String nacionalidad, Fecha fechaNacimiento, int numero, String valorActual, String perfil,String equipo, float altura, int reflejos) {
		super(nombre,nacionalidad,fechaNacimiento,numero,valorActual,perfil,equipo);
		System.out.println("Se crea el objeto de Jugador Portero");
		this.altura=altura; 
		this.reflejos=reflejos;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura=altura;
	}

	public float getReflejos() {
		return reflejos;
	}
	public void setReflejos(int reflejos) {
		this.reflejos=reflejos;
	}
	
	public void leerDatos() {
		super.LeerDatos();
		System.out.println("Ingrese la altura del portero (cm): ");
		this.altura=lee.nextFloat();
		System.out.println("Ingrese la calificacion de reflejos del portero (0-100): ");
		this.reflejos=lee.nextInt();
		
	}

	public void mostrarEstadisticas() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Nacionalidad: "+this.getNacionalidad());
		System.out.println("Fecha de nacimiento: "+this.getFechaNacimiento());
		System.out.println("Numero: "+this.getNumero());
		System.out.println("Valor actual: "+this.getValorActual());
		System.out.println("Pierna preferida: "+this.getPefil());
		System.out.println("Altura: "+this.getAltura());
		System.out.println("Reflejos: "+this.getReflejos()+"\n");
		
	}
	public String saqueDePorteria(){
		return this.getNombre() + "despeja el balon";
	}
	public String atajarTiro(){
		return "!" + this.getNombre() + " ataja el disparo!";	
	}
	public String toString(){
		return super.toString() + "\nAltura: " + this.getAltura() + "\nReflejos: " + this.getReflejos();
	}
	
} 
