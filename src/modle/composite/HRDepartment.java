package modle.composite;

/**
 * Created by mazhenhua on 2017/2/27.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void dispaly(String depth) {
        System.out.println("-" + depth + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 员工招聘培训管理" );
    }
}
