/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Sujan
 */
public class variableEx1 {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=a+b;
        float f=a;//widning
        System.out.println(c);
        System.out.println(a);
        System.out.println(f);
        //narrowing / Typecasting
        
        float d=20.5f;
        int x=(int)d;
        System.out.println(d);
        System.out.println(x);
        
        //overflow
        int k=130;
        byte j=(byte)k;
        System.out.println(k);
        System.out.println(j);
        //adding lower type
        byte q=40;
        byte w=50;
        byte e=(byte)(q+w);
        System.out.println(e);
}
}
