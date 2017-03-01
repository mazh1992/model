package modle.composite;

/**
 * Created by mazhenhua on 2017/2/27.
 */
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void dispaly(String depth); // 显示
    public abstract void lineOfDuty(); // 履行职责
}
