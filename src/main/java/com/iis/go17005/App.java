package com.iis.go17005;

/**
 * Hello world!
 *
 */
public class App 
{
	public String hello() {
		return "Hello World";
	}
	
    public static void main( String[] args )
    {
    	App hw = new App();
        System.out.println( hw.hello() );
    }
}
