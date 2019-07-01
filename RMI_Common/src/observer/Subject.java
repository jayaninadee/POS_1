/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.rmi.Remote;

/**
 *
 * @author x_cod3r
 */
public interface Subject extends Remote{
     public void register(Observer ob)throws Exception;
     public void unregister(Observer ob) throws Exception;
     public void notify(String message) throws Exception;
}
