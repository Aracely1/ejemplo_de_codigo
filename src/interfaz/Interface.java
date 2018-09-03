
package interfaz;

import java.rmi.*;
//public interface Interface extends Remote {
//    //en esta parte se hace la declaracion de todos metodos
//    public boolean validarAcceso(String usuario,String password);//boolean tipo primitivo
//    public String obtenerUsuario(String password);//String tipo object
//}
public interface Interface extends Remote {
    //en esta parte se hace la declaracion de todos metodos
    public boolean validarAcceso(String usuario,String password)throws RemoteException;//boolean tipo primitivo
    public String obtenerUsuario(String password)throws RemoteException;//String tipo object
}
