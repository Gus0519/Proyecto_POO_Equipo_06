package clases;

public abstract class Futbolista extends Persona{
	private int numero;
	private String valorActual;
	private String perfil;
	public Futbolista() {
		System.out.println("Se crea el objeto de Futbolista");
	}

	public Futbolista(String nombre, String nacionalidad, Fecha fechaNacimiento, int numero, String valorActual, String perfil ) {
		super(nombre,nacionalidad,fechaNacimiento);
		System.out.println("Se crea el objeto de Futbolista");
		this.numero=numero;
		this.valorActual=valorActual;
		this.perfil=perfil;
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public String getValorActual() {
		return valorActual;
	}

	public void setValorActual(String valorActual) {
		this.valorActual=valorActual;
	}

	public String getPefil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil=perfil;
	}

	public void LeerDatos() {
		super.LeerDatos();
		System.out.println("Ingresa numero del jugador: ");
		this.numero=lee.nextInt();
		System.out.println("Ingresa el valor actual del jugador: ");
		this.valorActual=lee.nextLine();
		System.out.println("Ingresa la pierna de preferencia del jugador: ");
		this.perfil=lee.nextLine();
	}
	public abstract void mostrarEstadisticas();
}

