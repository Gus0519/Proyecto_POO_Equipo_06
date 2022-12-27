
public abstract class Futbolista extends Persona{
	private int numero;
	public Futbolista() {
		System.out.println("Se crea el objeto de Futbolista");
	}
	public Futbolista(String nombre, String nacionalidad, Fecha fechaNacimiento, int numero) {
		super(nombre,nacionalidad,fechaNacimiento);
		System.out.println("Se crea el objeto de Futbolista");
		this.numero=numero;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	
	public void LeerDatos() {
		super.LeerDatos();
		System.out.println("Ingresa numero del jugador: ");
		this.numero=lee.nextInt();
	}
	public abstract void mostrarEstadisticas();
}
