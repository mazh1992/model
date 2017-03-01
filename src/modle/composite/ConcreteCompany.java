package modle.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mazhenhua on 2017/2/27.
 */
public class ConcreteCompany extends Company {


    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void dispaly(String depth) {
        System.out.println("-" + depth + name);
        for (Company company : children){
            company.dispaly(depth + "--");
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children){
            company.lineOfDuty();
        }
    }
}
