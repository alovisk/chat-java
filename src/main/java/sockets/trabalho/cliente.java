package sockets.trabalho;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		iniciarCliente();
	}
	
	
	public static Socket iniciarCliente() throws UnknownHostException, IOException {
		
		Socket cliente = new Socket("localhost",12123);
		OutputStream outputCliente =  cliente.getOutputStream();
		String mensagem = "teste";
		outputCliente.write(mensagem.getBytes());
		
		
		return cliente;
		
	}

}
