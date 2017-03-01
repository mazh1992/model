package modle.composite;

/**
 * Created by mazhenhua on 2017/2/27.
 */
public class Test {

    public static void main(String[] args) {
        ConcreteCompany rootChrldren = new ConcreteCompany("北京总公司");
        rootChrldren.add(new HRDepartment("总公司人力资源部"));
        rootChrldren.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany children = new ConcreteCompany("上海华东分公司");
        children.add(new HRDepartment("上海华东分公司人力资源部"));
        children.add(new FinanceDepartment("上海华东分公司财务部"));

        rootChrldren.add(children);

        System.out.println("结构图：");

        rootChrldren.dispaly("-");

        System.out.println("职责：");

        rootChrldren.lineOfDuty();
    }
}
