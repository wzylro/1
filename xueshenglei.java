/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 27009
 */
class Student{
    private String name;
    private int grade;
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public Student(){
    }
    public Student(String name,int grade){
        this.name=name;
        this.grade=grade;
        System.out.println("我叫"+name+"成绩为:"+grade);
    }


    public static void main(String[] args){
        Student student1=new Student();
        Student student2=new Student("李四",80);
        student1.setName("张三");
        student1.setGrade(100);
        System.out.println("我叫"+student1.getName()+"成绩为:"+student1.getGrade());
        
    }
    
}
