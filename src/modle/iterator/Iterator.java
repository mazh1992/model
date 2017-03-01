package modle.iterator;

/**
 * Created by mazhenhua on 2017/2/27.
 */
public interface Iterator {

    public void first(); // 移动到第一个元素

    public void next();  // 移动到下一个元素

    public boolean isDone(); // 是否为最后一个元素

    public Object currentItem(); // 返还当前元素
}
