package serviciorest.controlador;
import org.springframework.http.MediaType;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//ESTE OBJETO SERÁ EL PUNTO DE ENTRADA PARA EL SERVICIO REST PARA ELLO UTILIZAREMOS @RestController


@RestController
public class ControladorMensaje {
	
	
	@GetMapping(value = "mensaje")
	public String obtenerMensaje() {
		return "Esto es una prueba";
	}
	
	@GetMapping(value = "mensajeHTML", produces = MediaType.TEXT_HTML_VALUE)
	public String obtenerMensajeHTML() {
		//Esta clase es muy buena para concatenar Strings
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!DOCTYPE html>");
		buffer.append("<html>");
		buffer.append("<head>");
		buffer.append("<title> html</title>");
		buffer.append("</head>");
		buffer.append("<body>");
		buffer.append("<h1 style='color:blue'>MENSAJE HTML</h1>");
		buffer.append("</body>");
		buffer.append("</html>");
		
		return buffer.toString();
	}

}
