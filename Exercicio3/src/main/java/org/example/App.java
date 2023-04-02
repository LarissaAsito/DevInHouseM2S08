package org.example;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Larissa");
        System.out.println(cliente.toString());
    }
}
