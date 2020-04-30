
package com.serverclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket ;

public class ClientSide {
    
    public static void main(String args[])
    {
        System.out.println("Client Started .... ") ;
        try{
            Socket soc = new Socket("localhost" , 9806) ;
//            BufferedReader bfs = new BufferedReader(new InputStreamReader(System.in)) ;
//            System.out.println("Enter any string") ;
//            String str = bfs.readLine() ;
//            PrintWriter out = new PrintWriter(soc.getOutputStream() , true) ; // true - auto flush
//            
           // out.println(str) ;
        }catch(Exception e)
        {
            System.out.println(e.getMessage()) ;
            System.out.println("fail client");
        }
    }
    
}
