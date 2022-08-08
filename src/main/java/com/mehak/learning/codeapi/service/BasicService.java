package com.mehak.learning.codeapi.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicService {

   public List<Integer> getFibonacciSeries(Integer num){
       int a = 0;
       int b = 1;
       List<Integer> fib = new ArrayList<>();
       fib.add(a);
       fib.add(b);
       for(int i = 2;i<num;i++ ) {
           int next = a + b;
           fib.add(next);
           a = b;
           b = next;
       }

       return fib;
   }

   public Boolean isArmstrongNumber(Integer num){
       int temp = num;
       int sum = 0;
       while (temp > 0) {
           sum += (int) Math.pow((temp % 10), num.toString().length());
           temp = temp / 10;
       }
       return num.equals(sum);
   }
}
