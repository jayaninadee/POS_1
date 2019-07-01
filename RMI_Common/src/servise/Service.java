/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servise;

import java.rmi.Remote;
import observer.Subject;

/**
 *
 * @author x_cod3r
 */
public interface Service extends Remote,Subject{
    public String chek(String message) throws Exception;
}
