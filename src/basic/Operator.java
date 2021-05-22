package basic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sujan
 */
public class Operator {
    public static void main(String[] args){
        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        
        int a=10;
        int b=-10;
        System.out.println("sujan");
        
       /* System.out.println(++a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(++a + ++a);//12+13=25
        System.out.println(a++ + ++a);//10+12=22
        */
        /*System.out.println(a++ + b++ );
        System.out.println(++a + ++b);
        */
        //operator ~
        boolean c=true;
        boolean d=false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);
        
        //arithmetic operators
        int t=10;
        int y=5;
        System.out.println(t+y);
        System.out.println(t-y);
        System.out.println(t/y);
        System.out.println(t*y);
        System.out.println(t%y);
        
        //left shift
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<5);//10*2^5=10*32=320
        
        //right shift
        System.out.println(10>>2);
        System.out.println(10>>3);
        System.out.println(10>>4);
        
        //>>>
        System.out.println(10>>2);
        System.out.println(10>>>2);
        System.out.println(20>>>3);
        
        //and / && operators
        int p=10;
        int o=5;
        int m=20;
        System.out.println(p<o&&a<m);
        System.out.println(p>o&&p<m);
        System.out.println(m>p&&m>o);
        
        //or operators
        System.out.println(p>o||o>m);
        System.out.println(o>p||o>m);
        
        //java ternary operators
        int f=10;
        int h=5;
        
        int min=(f<h)?f:h;
        System.out.println(min);
        
        //Assignment Operators
        f+=10;
        System.out.println(f);
        h-=2;
         System.out.println(h);
        f*=2;
         System.out.println(f);
        f/=5;
         System.out.println(f);
         
         //short operators
         
         short u=10;
         short i=10;
         //u=u+i;  we cant compile
         
         u=(short)(u+i);
         System.out.println(u);
        
       
        
        
}
}
