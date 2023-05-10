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
public interface Jiekou {
   public static final int a=0;
   public abstract void doSome();
   default public void dosome (){
                                                    //                    默认方法     静态方法和default 都可以写方法   后面可以重新覆盖
   }
   public static void main(String[]args)
    {
        
        
    }
    
}
