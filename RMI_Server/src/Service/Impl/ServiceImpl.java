/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Impl;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import observer.Observer;
import servise.Service;

/**
 *
 * @author x_cod3r
 */
public class ServiceImpl extends UnicastRemoteObject implements  Service{
    public static ArrayList<Observer>observer=new ArrayList<Observer>();
    public ServiceImpl()throws Exception{}
    @Override
    public String chek(String message) throws Exception {
        notify(message);
        return message;
        
    }

    @Override
    public void register(Observer ob) throws Exception {
        observer.add(ob);
    }

    @Override
    public void unregister(Observer ob) throws Exception {
        observer.remove(ob);  
    }

    @Override
    public void notify(String message) throws Exception {
 

        for (Observer observer1 : observer) {
            new Thread(
            new Runnable() {
                @Override
                public void run() {     
                    try {
                        observer1.update(message);
                    } catch (Exception ex) {
                        Logger.getLogger(ServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            ).start();
        }
    }

   
    
    
}
