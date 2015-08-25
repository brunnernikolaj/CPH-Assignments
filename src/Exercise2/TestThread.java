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
public class TestThread implements Runnable{

    private Even obj;
    
    public TestThread(Even obj) {
        this.obj = obj;
    }
       
    @Override
    public void run() {
       System.out.println( obj.next());
    }   
}
