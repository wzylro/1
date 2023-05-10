/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.zuoye;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author 27009
 */
//public class NewClasszuoye {
//public static void main(String[] args) {
/*float t=0,i;
       int a =1;
       for(i =1;i<9999999;i//
       {
           t+=4/(2*i-1)*a;
           a=-a;
       }
        System.out.println(t);
    };  
 
    
    
    
    
    int [][]b = new int[5][];
    for(int i=0;i<b.length;i++)
    {   
        b[i]=new int [i+1];
        for(int j=1;j<b[i].length;j++)
        {
            if (j==0||j==b[i].length -1)
            {
                b[i][j]=1;
            }
            else{
                b[i][j]=b[i-1][j]+b[i-1][j-1];
            }
        }
    }
    for(int i=0;i<b.length;i++)
    {
        for(int j=0;j<b[i].length;j++)
        {
           System.out.println(b[i][j]+"\t");
        }
        //System.out,println("\t");
    }
    
    
    
    
    
};*/
 /*public class  NewClasszuoye{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int deep = 5;
		int[][] a = new int[deep][]; 
		for (int i = 0; i < deep; i++) { 
			a[i] = new int[i + 1];
		}
		for (int i = 0; i < deep; i++) { 
			a[i][0] = 1;
			a[i][a[i].length - 1] = 1;
		}
		for (int i = 2; i < deep; i++) {  
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
			}
		}
 
		for (int i = 0; i < deep; i++) { 
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
 
	}
};
 */
 /*import java.util.Scanner;
 
public class  NewClasszuoye{
	
public static int rollDice()
{
 int dice1=(int)(1+Math.random()*6);
 int dice2=(int)(1+Math.random()*6);
 return dice1+dice2;
 }
 
public static void main(String[] args){
	int size=0;
	Scanner input=new Scanner(System.in);
	
	do{
 
		System.out.print("请输入抛双骰的次数（输入-1退出）：");
		size=input.nextInt();
		if(size==-1){
			System.out.printf("exist");
			break;
		}
			
		int rollingResult=0;
		int[] frequency=new int[13];
		double[] possibility=new double[13];
		double possibilityTotal=0.0;
		double percentTotal=0.0;
		int totalRolling=0;
		
		System.out.println("start：");
		for (int i=0;i<size;i++){
		   rollingResult=rollDice();
		   ++frequency[rollingResult]; 
	   }
		System.out.println("over：");
		
		for (int i=2;i<13;i++){
			possibility[i]=(double)frequency[i]/size;
		}
		

		System.out.println("Value\t \tTimes\t\tFrequency：");
		for (int i=2;i<13;i++){
		
			System.out.printf("%d\t\t%d\t\t%.2f%%%n",i,frequency[i],(double)(possibility[i]*10000)/100);
			
		}
		
		for(double p:possibility){
			possibilityTotal+=p;
			percentTotal+=(p*10000)/100;
		}
		
		for(int f:frequency)
			totalRolling+=f;
 
	}while(size!=-1);
	
	input.close();
}
}*/
 /*
public class  NewClasszuoye{
	static final char BLACK_CHESS = '●';
    static final char WHITE_CHESS = '○';
    static final char BLANK = '\u253c';
public static void main(String[ ] args) {
	char[][] chessboard =new char [20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                chessboard[i][j] = BLANK;
            }
        }
        for (int m = 1; m < 5000; m++) {
            int K = (int) (Math.random()*(14-0+1)-0 );
            int L = (int) (Math.random()*(14-0+1)-0 );
            int N = (int) (Math.random()*10 );
            if(N%2==0&&chessboard[K][L]==BLANK)
             { chessboard[K][L]=BLACK_CHESS; }
            else if(chessboard[K][L]!=BLACK_CHESS)
             { chessboard[K][L]=WHITE_CHESS; }
        }
        for (int I = 0; I < 15; I++) {
            System.out.println();
            for (int J = 0; J < 15; J++) {
                System.out.print(chessboard[I][J]);
            }
        }
}
}
 */
 /*
public class NewClasszuoye {

    public static void main(String[] arge) {
        String arr[]={"oliver smith ", "noath bush", "harry brown", "jack wood", "charlie nixon", "jacob Weber", "lily Sandall", "emil Goodwin", "sophis eberhrdt", "ella Parker"};
        //StringBuilder aryys =new StringBuilder (String arr[]); //{"oliver smith ", "noath bush", "harry brown", "jack wood", "charlie nixon", "jacob Weber", "lily Sandall", "emil Goodwin", "sophis eberhrdt", "ella Parker"}
        for (int i = 0; i <= 9; i++) {
            System.out.println(arr[i].toUpperCase ());
        }
    }
}
 */
 /*public interface Doit{
    
    方法名称；
default 前缀    类似与cc++虚函数；
}*/
//注意父类与子类构造方法；
//super 可以调用被隐藏的父类变量和方法；
//abstract  前缀 抽象   抽象类 和抽象方法

/*public class NewClasszuoye {

    public static void main(String[] arge) {

      
        Scanner sc = new Scanner(System.in);
        //给个提示
        System.out.println("请输入你要查看的日期：（提示：请按照 1997-12-13 的格式录入）");
        
        String date1 = sc.next();  
    
        java.sql.Date date2 = java.sql.Date.valueOf(date1);
       
        Calendar cal1 = new GregorianCalendar();
      
        cal1.setTime(date2);
       
        int year3 = cal1.get(Calendar.YEAR);
        int month3 = cal1.get(Calendar.MONTH);  
        int date3 = cal1.get(Calendar.DATE);
        int weekday3 = cal1.get(Calendar.DAY_OF_WEEK);  
        int count3 = cal1.getActualMaximum(Calendar.DATE);
        
        int count1 = 0;
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        
        int count2 = 0;
        for (int i = 0; i < 7; i++) {
            if ((date3 % 7 + i) % 7 == weekday3) {  
                count2 = i;
                break;
            }
        }
        
        cal1.set(Calendar.DATE, 1);
        count2 = cal1.get(Calendar.DAY_OF_WEEK) - 1;

        for (int i = 1; i <= count2; i++) {
            System.out.print("\t");
            count1++; 
        }
        for (int i = 1; i <= count3; i++) {
            if (i != date3) {    
                System.out.print(i + "\t");
            } else {
               
                System.out.print(i + "*\t");
            }
            count1++;
            if (count1 % 7 == 0) {
                System.out.println("\n");
            }
        }
    }

}
 

import java.net.URL;
 
public class NewClasszuoye {
   public static void main(String[] args) 
   throws Exception {
      URL url = new URL("http://baidu.com:8080/system/login.jsp?user=admin&password=123#top");
      System.out.println("URL 是 " + url.toString());
      System.out.println("协议是 " + url.getProtocol());
      System.out.println("文件名是 " + url.getFile());
      System.out.println("主机是 " + url.getHost());
      System.out.println("路径是 " + url.getPath());
      System.out.println("端口号是 " + url.getPort());
      System.out.println("默认端口号是 " 
      + url.getDefaultPort());
   }
}
      */
public class NewClasszuoye {
    public static void main(String[]arg){
    String str [] = {"oliver smith","noath bush","harry brown","jack wood","charlie nixo","jacob Weber","lilty sandal","emil goodwin","sophis eberhrdt","ella Parker"};
    
    for(int i=0;i<10;i++){
        System.out.println(str[i].toUpperCase());
}
}
}
 