package com.epam.BehavioralPatterns;

public class Multiplication implements Strategy{
	@Override  
    public float calculation(float a, float b){  
        return a*b;  
    }  

}
