package sockets.trabalho;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class servidor {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket conect = iniciarServidor().accept();
		InputStream is = conect.getInputStream();
		System.out.println(is.read());
		is.close();
		conect.close();
	}
	
	
public static ServerSocket iniciarServidor() throws UnknownHostException, IOException {
		ServerSocket servidor =  new ServerSocket(12123);
		
		return servidor;
		
	}

}
