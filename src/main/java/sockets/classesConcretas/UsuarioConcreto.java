package sockets.classesConcretas;



import java.util.List;

import socket.interfaces.Usuario;

public class UsuarioConcreto implements Usuario{

	@Override
	public void update(List<Mensagem> mensagem) {
		System.out.println("mensagem nova");
		
	}


}
