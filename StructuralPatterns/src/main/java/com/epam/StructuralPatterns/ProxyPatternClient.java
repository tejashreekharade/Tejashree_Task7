package com.epam.StructuralPatterns;

public class ProxyPatternClient {

	public static void main(String[] args)
	{
		OfficeInternetAccess access = new ProxyInternetAccess("Steve Jobs");  
        access.grantInternetAccess();  
	}
}
