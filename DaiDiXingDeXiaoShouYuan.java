/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuangonggangzi;

/**
 *
 * @author 27009
 */
public class DaiDiXingDeXiaoShouYuan extends people{
     int shuliang;
     public DaiDiXingDeXiaoShouYuan(int shuliang, int age,int bace, String name) {
        super(age,bace, name);
        this.shuliang = shuliang;
    }
    

    
    @Override
    double getSalary() {
         double extra = shuliang*0.03;
      return bace+extra;
    }
    
}
 