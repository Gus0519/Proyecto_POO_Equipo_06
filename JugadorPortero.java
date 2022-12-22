
public class JugadorPortero extends Futbolista{
	
	private float altura;
	
	public JugadorPortero() {
		System.out.println("Se crea el objeto de Jugador Campo");
	}
	public JugadorPortero(String nombre, String nacionalidad, Fecha fechaNacimiento, int numero, float altura) {
		super(nombre,nacionalidad,fechaNacimiento,numero);
		System.out.println("Se crea el objeto de Jugador Portero");
		this.altura=altura; 
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura=altura;
	}
	
	public void leerDatos() {
		super.LeerDatos();
		System.out.println("Ingrese la altura del portero (cm): ");
		this.altura=lee.nextFloat();
		
	}

	public void mostrarEstadisticas() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Nacionalidad: "+this.getNacionalidad());
		System.out.println("Fecha de nacimiento: "+this.getFechaNacimiento());
		System.out.println("Numero: "+this.getNumero());
		System.out.println("Altura: "+this.getAltura()+"\n");
		
	}
	
	
}
