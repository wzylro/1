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
class Rectangle  extends lei  {
    public int width;
    private int height;//不写权限默认为  package   在包内可以访问到；
    int a;
    {
        //初始化块；此处可以初始化a;
    }
    public Rectangle(){
        width =10;
        height=20;                                                     ///////////////////////类的成员加static 是属于类的，不是属于对象的；    静态方法无法访问实例变量        实例方法可以访问类的变量和方法
                                                                      
    }
     public Rectangle(int width,int height){
         this.width=width;
         this.height=height;
        
    }
    
    public int calArea(){
         int area=width*height;
         return area;
    }
    ///////////////////类里可以嵌套类，    分为static  和 non static;       外部定义对象用的时候    先new一个外部类的对象     需要依附于一个对象   类名1.类名2
    
    
    
    
    
    
}

