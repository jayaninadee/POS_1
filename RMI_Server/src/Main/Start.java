/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Service.Impl.ServiceImpl;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author x_cod3r
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        try {
            // TODO code application logic here
            Registry createRegistry = LocateRegistry.createRegistry(5050);
            createRegistry.rebind("RMI", (Remote) new ServiceImpl());
          
            System.out.println("Server working");
        } catch (RemoteException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
