/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikolaj
 */
public class Print1To5 implements Runnable {

    
    @Override
    public void run() {
        int count = 1;
        try {
            while (count <= 5) {
                Thread.sleep(2000);
                System.out.println(count++);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Print1To5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
