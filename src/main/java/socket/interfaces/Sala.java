package socket.interfaces;

public interface Sala {
	String entrar(Usuario usuario);
	String sair(Usuario usuario);
	void notificar();
}
