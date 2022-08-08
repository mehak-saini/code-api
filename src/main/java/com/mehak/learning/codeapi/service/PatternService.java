package com.mehak.learning.codeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatternService
{


    public StringBuilder printPattern(Integer num){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("<br>");
        }
        return sb;
    }
}
