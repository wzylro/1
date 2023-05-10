/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author 27009
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
         try{
             in = new FileInputStream("C:\\Users\\27009\\Desktop\\打字练习.txt");
             out=new FileOutputStream("C:\\Users\\27009\\Desktop\\新建 文本文档.txt");
             int c;
             while((c= in.read())!=-1)
             {
                 out.write(c);
             }
         }finally{
             if(in !=null)
             {
                 in.close();
             }
             if(out!=null)
             {
                 out.close();
             }
         }
         
    }
            
    
}
