package sockets.trabalho;

import sockets.classesConcretas.SalaConcreta;
import sockets.classesConcretas.UsuarioConcreto;

public class App 
{
    public static void main( String[] args )
    {
        SalaConcreta sala = new SalaConcreta();
        UsuarioConcreto usuario = new UsuarioConcreto();
        sala.entrar(usuario);
        sala.notificar();
    }
}
