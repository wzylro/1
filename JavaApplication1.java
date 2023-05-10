/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author 27009
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        System.out.println("hello world");// TODO code application logic here
        boolean result =true;
        byte a=-6;               //默认int
        byte b=127;
        b++;
        long d=100l;
        float pi=3.14f;
        char  e='f';
        char g='\\'; 
        byte c=(byte)0b1111111;   //0b表示后面为2进制
        byte h=0b01111111;
        System.out.println(~h);//10000000
        byte i= (byte)0b1010101;// a|b=   |  或  置1    与0或保持原样；                       a&b=      & 与  与1与，保持原有   与0与 置0；               a^b=  ^异或 取反 。     与1异或取反    与0异或保持原样
        System.out.println(a);
        System.out.println(b);
        Scanner scanner=new Scanner(System .in);
        System.out.println("请输入你的名字");
        String name =scanner.next();
        System.out.println("你好："+name);
        System.out.println("");
        int []arr=null;
        int arrd[]=new int[5];
        for(int j=0;j<5;j++)
        {
            arr[j]=j*1;
        }
        System.out.println(a);
        int [][]arrc=null;
        arrc =int new double [4][5];
        for(int i=0;i<arrc.length;i++){
            for(int j=0;j<a[i].length;j++)
                
        }
        //System.arraycopy(      )
       // Sysetm.exit(0);退出循环
        long startTime =System.currentTimeMillis();
        for(int k=0;k<100000000;k++)
        {
            ;
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)+("ms 已运行"));
    }
    
}
*/












