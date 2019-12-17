package com.yfny.pattern.visitor.example1.concreteElement;

import com.yfny.pattern.visitor.example1.element.Employee;
import com.yfny.pattern.visitor.example1.visitor.Department;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class ParttimeEmployee implements Employee {

    private String name;            //员工姓名
    private double hourWage;      //员工时薪
    private int workTime;           //工作时间

    public ParttimeEmployee(String name, double hourWage, int workTime) {
        this.name = name;
        this.hourWage = hourWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourWage() {
        return hourWage;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public void accept(Department handler) {
        handler.visit(this);
    }
}
