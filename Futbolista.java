public abstract class Futbolista extends Persona{
	private int numero;
	private String valorActual;
	private String perfil;
	private String Equipo;
	public Futbolista() {
		System.out.println("Se crea el objeto de Futbolista");
	}

	public Futbolista(String nombre, String nacionalidad, Fecha fechaNacimiento, int numero, String valorActual, String perfil,String equipo ) {
		super(nombre,nacionalidad,fechaNacimiento);
		System.out.println("Se crea el objeto de Futbolista");
		this.numero=numero;
		this.valorActual=valorActual;
		this.perfil=perfil;
		this.equipo = equipo;
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
	public String getEquipo(){
		return this.equipo;
	}
	public void setEquipo(String equipo){
		this.equipo = equipo;
	}

	public void LeerDatos() {
		super.LeerDatos();
		System.out.println("Ingresa numero del jugador: ");
		this.numero=lee.nextInt();
		System.out.println("Ingresa el valor actual del jugador: ");
		this.valorActual=lee.nextLine();
		System.out.println("Ingresa el equipo del jugador: ");
		this.equipo = lee.nextLine();
		System.out.println("Ingresa la pierna de preferencia del jugador: ");
		this.perfil=lee.nextLine();

	}
	public void serAmonestado(){
		System.out.println("El jugador: " + this.getNombre() + " ha sido amonestado");
	}
	public void serExpulsado(){
		System.out.printn("El jugador: " + this.getNombre() + "ha sido expulsado");
	}
	public void lesionarse(){
		System.out.println(this.getNombre() + " esta lesionado");
	}
	public void pasaBalon(){
		System.out.println(this.getNombre() + " realiza un pase");
	}
	public void reclamar(){
		System.out.println(this.getNombre() + " reclama al arbitro");
	}
	public void tiroLibre(String resultado){ // El resultado puede ser gol o errar
		System.out.println(this.getNombre() + " ejecuta el tiro libre y... " + resultado);
	}

	public abstract void mostrarEstadisticas();
}
