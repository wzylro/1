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
public class XiaoShouYuan extends people {

    int shuliang;

    public XiaoShouYuan(int age,int bace, String name,int shuliang) {
        super(age,bace,name);
        this.shuliang = shuliang;
    }
     
    @Override
    double getSalary() {
         double extra = shuliang*0.53;
      return extra;
    }
    
}
