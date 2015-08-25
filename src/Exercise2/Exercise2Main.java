/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author Nikolaj
 */
public class Exercise2Main {
    private static final Even obj = new Even();
    
    public static void main(String[] args) {
        new Thread(new TestThread(obj)).start();
        
        new Thread(new TestThread(obj)).start();
        
        System.out.println(obj.next());
    }
    
    
    
    
}


