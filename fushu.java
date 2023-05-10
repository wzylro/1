/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leiandduixiang;

/**
 *
 * @author 27009
 */

public class fushu {
    public double rp;
    public double ip;
    public fushu()
    {
        this.rp=0;
        this.ip=0;
    }
    public fushu(double rp,double ip)
    {
        this.ip =ip;
        this.rp=rp;
        
    }
    public double getrp()
    {
        return rp;
    }
    public void setrp(double rp)
    {
        this.rp=rp;
    }
    public double getuip()
    {
        return ip;
    }
    public void setip(double ip)
    {
        this.ip=ip;
    }
    public fushu add(fushu a,fushu b)
    {
        return new fushu(a.rp+b.rp,b.ip+a.ip);
    }
    public fushu  jianfa(fushu a,fushu b)
    {
         return new fushu(a.rp-b.rp,b.ip-a.ip);
    }
    public void print()
    {
        System.out.println(this.rp+"+"+this.ip+"i");
    }
    public static void main (String[] args)
    {
        fushu a=new fushu(2,3);
        fushu b=new fushu(3,3);
        a.print();
        b.print();
        fushu c=new fushu(0,0);
        c=c.add(a, b);
        c.print();
        c=c.jianfa(a, b);
        c.print();  
    }
}


