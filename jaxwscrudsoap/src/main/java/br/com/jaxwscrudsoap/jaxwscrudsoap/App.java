package br.com.jaxwscrudsoap.jaxwscrudsoap;

import br.com.jaxwscrudsoap.jaxwscrudsoap.service.NoticiaSIB;
import jakarta.xml.ws.Endpoint;

public class App {
	public static void main(String[] args) {

		String porta = "8088";
		System.out.println("Publicando o serviço na porta: " + porta);
		Endpoint.publish("http://localhost:" + porta + "/noticias", new NoticiaSIB());
		System.out.println("Serviço publicado na porta: " + porta);
	}
}
