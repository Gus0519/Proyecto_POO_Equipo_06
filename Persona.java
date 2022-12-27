//import java.io.IOException;
//import java.util.Scanner;

//import paqueteLectura.Lectura;

public abstract class Persona implements SerVivo{
	private String nombre; 
	private String nacionalidad;
	private Fecha fechaNacimiento;
	public paqueteLectura.Lectura lee;
	
	public Persona() {
		System.out.println("Se crea objeto de Persona");
		fechaNacimiento=new Fecha();
		this.lee=new paqueteLectura.Lectura();
	}
	
	public Persona(String nombre, String nacionalidad, Fecha fechaNacimiento) {
		System.out.println("Se crea objeto de Persona");
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
		this.fechaNacimiento=fechaNacimiento;
		this.lee=new paqueteLectura.Lectura();
	}
	public Persona(String nombre, String nacionalidad, byte dia, byte mes, short anho) {
		System.out.println("Se crea objeto de Persona");
		fechaNacimiento=new Fecha(dia,mes,anho);
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
		this.lee=new paqueteLectura.Lectura();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad=nacionalidad;
	}
	
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}
	
	public void caminar() {
		System.out.println(this.nombre + " camina");
	}
	public void correr() {
		System.out.println(this.nombre + " corre");
	}
	public void hablarPorTelefono() {
		System.out.println(this.nombre + " habla por telefono");
	}
	
	public void LeerDatos() {
		System.out.println("Ingresa nombre: ");
		this.nombre=lee.nextLine();
		System.out.println("Ingresa nacionalidad: ");
		this.nacionalidad=lee.nextLine();
		System.out.println("Ingresa fecha de nacimiento(dia): ");
		this.fechaNacimiento.setDia(lee.nextByte());
		System.out.println("Ingresa fecha de nacimiento(mes): ");
		this.fechaNacimiento.setMes(lee.nextByte());
		System.out.println("Ingresa fecha de nacimiento(anho): ");
		this.fechaNacimiento.setAnho(lee.nextShort());
		
	}
	public String toString() {
		return super.toString()+"\nNombre: "+this.nombre+
								"\nnacionalidad: "+this.nacionalidad;
	}
	public abstract void mostrarEstadisticas();

}
