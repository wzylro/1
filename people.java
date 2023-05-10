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
public abstract class people {
    int bace;
    int age;
    final String NAME;
    
    public int getage() {
        return bace;
    }

    public void setage(int age) {
        this.age = age;
    }


    public int getBace() {
        return bace;
    }

    public void setBace(int bace) {
        this.bace = bace;
    }

    public people(int age,int bace, String name) {
        super();
        this.bace = bace;
        this.age=age;
        this.NAME = name;
    }
     
    /*
    public String getNAME() {
        return this.NAME;
    }*/
    
    abstract double getSalary();
    public String toString(){
        return  NAME +"年龄"+this.age+ " "+"的工资是:" + getSalary();           
    }  
    
}

