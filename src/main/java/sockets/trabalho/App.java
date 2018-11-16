package sockets.trabalho;

import java.io.IOException;
import java.net.UnknownHostException;

import sockets.classesConcretas.SalaConcreta;
import sockets.classesConcretas.UsuarioConcreto;

public class App 
{
    public static void main( String[] args ) throws UnknownHostException, IOException
    {
    	Servidor.getInstance().iniciar();
    	
        SalaConcreta sala = new SalaConcreta();
        UsuarioConcreto usuario = new UsuarioConcreto();
        sala.entrar(usuario);
        sala.notificar();
    }
}
