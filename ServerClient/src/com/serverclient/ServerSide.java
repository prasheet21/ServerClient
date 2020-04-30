/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serverclient;

//import java.io.Exception;
import java.net.* ;

public class ServerSide {        
    
    public static void main(String args[])
    {
    try
    {
    System.out.println("Waiting for clients ..") ;
    ServerSocket ss = new ServerSocket(9806) ;
    Socket soc= ss.accept() ;
    System.out.println("Connection Established ...") ;
    }
    catch(Exception e)
    {
       e.printStackTrace();
//        System.out.println("h") ;
    }
    }
    
}

