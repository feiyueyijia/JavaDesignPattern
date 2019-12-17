package com.yfny.pattern.visitor.example1.concreteVisitor;

import com.yfny.pattern.visitor.example1.concreteElement.FulltimeEmployee;
import com.yfny.pattern.visitor.example1.concreteElement.ParttimeEmployee;
import com.yfny.pattern.visitor.example1.visitor.Department;

/**
 * Created by jisongZhou on 2019/10/21.
 **/
public class HRDepartment extends Department {

    //实现财务部对全职员工的访问
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
        } else if (workTime < 40) {
            System.out.println("正式员工" + employee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
        }
    }

    //实现财务部对兼职员工的访问
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
    }
}
