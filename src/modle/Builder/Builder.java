package modle.Builder;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public abstract class Builder {

    public abstract void buildEngine(String engine);
    public abstract void buildTransmission(String transmission);
    public abstract void buildChassis(String chassis);

    public abstract Car create();
}
