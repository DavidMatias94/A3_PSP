package serviciorest;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import serviciorest.entidad.Videojuego;
import serviciorest.persistencia.DaoVideojuego;



//AQUÍ ARRANCARÁ NUESTRA APLICACIÓN 
//CON LA ANOTACIÓN @SpringBootApplication HACEMOS QUE SPRINGBOOT:
//1. BUSQUE ANOTACIONES .
//2. SE AUTOCONFIGURE
//3. BUSCA METODOS CON @BEAN

@SpringBootApplication
public class Application {	
	
	
	 
	
	public static void main(String[] args) {
		System.out.println("Servicio Rest -> El contexto de Spring se está cargando, espere unos instantes....");
		//CON EL MÉTODO RUN ARRANCAREMOS EL CONTEXTO SPRING
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println("Servicio Rest -> Contexto de Spring cargado!");
		
		 List<Videojuego> listaVideojuegos;
		 listaVideojuegos = new ArrayList<Videojuego>();
		 
		 
		
		
		
		
		
		
		
		System.out.println("ELIJA UNA OPCIÓN:\n\n"
				+ "  1. Dar de alta un videojuego \n"
				+ "  2. Dar de baja un videojuego por ID \n"
				+ "  3. Modificar un videojuego por ID\n"
				+ "  4. Obtener un videojuego por ID\n"
				+ "  5. Listar todos los videojuegos \n"
				+ "  6. Salir");
				
		
		Scanner sc = new Scanner(System.in);
		
		int leer = sc.nextInt();
		
		
		switch (leer) {
		
		
		case 1:
			
			System.out.println("Va a dar de alta un videojuego...");
			
			
			
			
			System.out.println("Escriba el nombre del videojuego:");
			
			Scanner sce = new Scanner(System.in);
			String nombreVideojuego = sce.nextLine();
			
			System.out.println("Escriba la compañía del videojuego: ");
			Scanner sca = new Scanner(System.in);
			String nombreCompañia = sca.nextLine();
			
			System.out.println("Introduzca la nota :");
			Scanner sci = new Scanner(System.in);
			int nota = sci.nextInt();
			
			int id =(int)(Math.random()*50);
			
			Videojuego v1 = new Videojuego(id, nombreVideojuego, nombreCompañia, nota);
			
			listaVideojuegos.add(v1);	
			
			System.out.println(listaVideojuegos.toString());
			
			
			
			break;
			
		case 2:
			
			break;
		
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			
			
			break;
		
		
		case 6:
			 
			System.out.println("Cerrando la aplicación....");
			ctx.close();
		
			break;
			
		}
			
		
		
			
		
				
	}

	
}
