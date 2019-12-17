package com.yfny.pattern.visitor.example1.concreteElement;

import com.yfny.pattern.visitor.example1.element.Employee;
import com.yfny.pattern.visitor.example1.visitor.Department;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class FulltimeEmployee implements Employee {

    private String name;            //员工姓名
    private double weeklyWage;      //员工周薪
    private int workTime;           //工作时间

    public FulltimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
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
