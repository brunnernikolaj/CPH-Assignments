/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Nikolaj
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final ExecutorService service = Executors.newFixedThreadPool(1);
        final Future<Long> task = service.submit(new CalcSum(0,1000000000));
         

        try {
            System.out.println(task.get());
        } catch(final InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }
        
        new Thread(new Print1To5()).start();
        
        Thread t = new Thread(new PrintFrom10());
        
        t.start();
        
        long startTime = System.currentTimeMillis();
        long patience = 10000;
        while (t.isAlive())
        {
        if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                t.interrupt();
            }
        }
        service.shutdownNow();        
    }
    
}
