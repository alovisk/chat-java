package sockets.trabalho;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import sockets.classesConcretas.Mensagem;

public class Servidor {

	private ServerSocket serve;
	private static Servidor servidor;

	private Servidor() {
	}

	public static synchronized Servidor getInstance() throws UnknownHostException, IOException {
		if (servidor == null)
			servidor = iniciarServidor();
		return servidor;
	}

	private static Servidor iniciarServidor() throws UnknownHostException, IOException {
		Servidor servidor = new Servidor();
		ServerSocket server = new ServerSocket(12123);
		servidor.setServe(server);
		return servidor;

	}

	public static void iniciar() throws IOException {
		Socket conect = servidor.getServe().accept();
		InputStream is = conect.getInputStream();
		Mensagem mensagem = new Mensagem();
		Integer valor = is.read();
		mensagem.setValor(valor.toString());
	}

	public ServerSocket getServe() {
		return serve;
	}

	public void setServe(ServerSocket serve) {
		this.serve = serve;
	}

}
