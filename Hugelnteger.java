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


public class Hugelnteger {
    private int []Array;
    public Hugelnteger()
    {
        Array=new int [40];
    }
  
    public Hugelnteger(String Num)
    {
        Array=new int[40];
        for (int i = 0; i < Num.length(); i++) {
            Array[39 - i] = Character.getNumericValue(Num.charAt(Num.length() - 1 - i));
        }
    }
    
    public void print()
    {
        boolean Flag=true;
        for(int i=0;i<Array.length;i++)
        {
            if(Array[i]!=0)
                Flag=false;
                if(!Flag)
                System.out.print(Array [i]+" ");
        }
        if(Flag)
        {
           System.out.print(0);
           System.out.println();
        }
    }
    public Hugelnteger add(Hugelnteger h1)
    {
        Hugelnteger result=new Hugelnteger();
        int k=0;
        for(int i=result.Array.length-1;i>=0;i--)
        {
            int sum=h1.Array[i]+this.Array[i]+k;
            result.Array[i]=sum%10;
            k=sum/10;
        }
        return result;
    }
    public static void main(String[]args)
    {
        Hugelnteger h1=new Hugelnteger("34789589347534589345");
        Hugelnteger h2=new Hugelnteger("4589347503498590348509345846");
        Hugelnteger sum=h1.add(h2);
        System.out.print("Sum= ");
        //System.out.println();
        sum.print();
        
    }
}
