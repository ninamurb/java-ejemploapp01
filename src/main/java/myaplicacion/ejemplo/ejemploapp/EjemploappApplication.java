package myaplicacion.ejemplo.ejemploapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploappApplication {


	public static void main(String[] args) {
class Estudiante{
		String nombre;
		String apellido;
		String carnet;
		string saludar(){
			return "Buenas";
		}
}

 System.out.println("Acelerando el deportivo...");
 Estudiante estudiante1 = new Estudiante(nombre:"Juan",apellido:"perez",carnet:"12345");

 estudiante1.nombre = "Estudiante # 1";
 estudiante1.apellido = "apellido #1";
 estudiante1.setCarnet(carnet:"09876");

System.out.println("Estudiante: "+estudiante1.nombre +"apellido: "+estudiante1.apellido+"carnet:" + estudiante1.getCarnet());
System.out.println("el estudiante dice: "+estudiante1.Saludar() );

		SpringApplication.run(EjemploappApplication.class, args);
	}

}
