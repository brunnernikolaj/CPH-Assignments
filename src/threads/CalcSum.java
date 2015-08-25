/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.Callable;

/**
 *
 * @author Nikolaj
 */
public class CalcSum implements Callable<Long>{

    private final long start, end;
    
    public CalcSum(long start, long end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public Long call() throws Exception {
        long sum = 0; 
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    
}
