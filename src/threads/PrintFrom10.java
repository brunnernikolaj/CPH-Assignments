/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikolaj
 */
public class PrintFrom10 implements Runnable{

    @Override
    public void run() {
        int count = 10;
        try {
            while (true) {
                Thread.sleep(3000);
                System.out.println(count++);
            }
        } catch (InterruptedException ex) {
            System.out.print("PrintFrom10 interupted");
        }
    }
    
}
