/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Aracelly
 */
public class Server {
    public static void main(String[] args)throws RemoteException {
        Registry reg=LocateRegistry.createRegistry(9999);
        Usuario login= new Usuario();
        reg.rebind("USR001", login);
        System.out.println("server RMI:/n exportando solicitud....");
    }
}
