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
public class HourlyWorkwers  extends people{
    int hours;

    public HourlyWorkwers(int hours,int age, int bace, String name) {
        super(age,bace, name);
        this.hours = hours;
    }

    @Override
    double getSalary() {
        double extra = hours>40?hours*6*1.5:hours*6;
        return bace+extra;
    }
    
    
    
    
}
