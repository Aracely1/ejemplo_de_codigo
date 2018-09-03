
package modelo;
import bd.Bd;
import interfaz.Interface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Usuario1 extends UnicastRemoteObject implements Interface{
    private String usuario;
    private String password;

    public Usuario1() throws RemoteException{
        super();
    }

    public Usuario1(String usuario, String password) throws RemoteException {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {

        return "Usuario = " + usuario + "\nPassword = " + password;
    }

    @Override
    public boolean validarAcceso(String usuario, String password) throws RemoteException{
        boolean res=false;
        Bd.agregarUsuarios(); 
        ArrayList<Usuario> lista=Bd.bdUsuarios;
        for(Usuario u:lista){
        String us=u.getUsuario();
        String ps=u.getPassword();
        }
  
        if (usuario.equals("admin")&&password.equals("123")) {
         
        res=true;
        }
        
        return res;
    }

    @Override
    public String obtenerUsuario(String password) throws RemoteException{

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
