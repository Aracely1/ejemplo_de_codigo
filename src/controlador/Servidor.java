
package controlador;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import modelo.Usuario;

public class Servidor {
    public static void main(String[] args) throws RemoteException {
        Registry reg= LocateRegistry.createRegistry(9999);
        Usuario login=new Usuario();
        reg.rebind("USR001", login);
        System.out.println("Server RMI escuchando solicitud...");
    }
   
}
