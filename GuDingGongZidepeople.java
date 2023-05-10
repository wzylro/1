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
public class GuDingGongZidepeople extends people {

    public GuDingGongZidepeople(int age, int bace,String name) {
        super(age,bace, name);
    }

    @Override
    double getSalary() {
        return bace;
    }
    
    
    
}
