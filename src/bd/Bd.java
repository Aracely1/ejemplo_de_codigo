package bd;

import java.rmi.RemoteException;
import java.util.ArrayList;
import modelo.Usuario;

public class Bd {
    public static ArrayList<Usuario> bdUsuarios=new ArrayList<Usuario>();
    
    public static ArrayList<Usuario> getBdUsuarios(){
        return bdUsuarios; 
    }
    public static void setUsuario (ArrayList<Usuario> bdUsuarios){
        Bd.bdUsuarios=bdUsuarios; 
    }
     public static void agregarUsuarios() throws RemoteException{
         
          Usuario u=new Usuario();
         u.setUsuario("admin");
         u.setPassword("123"); 
         bdUsuarios.add(u);
         
     }
     public static void obtenerUsuarios() throws RemoteException{
         for (int i = 0; i < bdUsuarios.size(); i++) {
             System.out.println("\nUsuario "+(i+1)+"\n"+bdUsuarios.get(i));
         }
     }
     public static void main(String[] args) throws RemoteException {
     agregarUsuarios();
//     obtenerUsuarios();

                   
    }
}
