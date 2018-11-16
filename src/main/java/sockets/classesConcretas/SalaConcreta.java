package sockets.classesConcretas;

import java.util.ArrayList;
import socket.interfaces.Sala;
import socket.interfaces.Usuario;

public class SalaConcreta implements Sala{
	
	ArrayList<Usuario> contatos = new ArrayList<Usuario>();
	ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
	
	public void notificar() {
		contatos.forEach(usuario->{
			usuario.update(mensagens);
		});
		
	}

	public String entrar(Usuario usuario) {
		contatos.add(usuario);
		return null;
	}



	public String sair(Usuario usuario) {
		contatos.remove(usuario);
		return null;
	}

	

}
