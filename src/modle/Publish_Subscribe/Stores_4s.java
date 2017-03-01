package modle.Publish_Subscribe;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public interface Stores_4s {

    /**
     * 增加订阅者
     * @param observer
     */
    public void attach(Observer observer);
    /**
     * 删除订阅者
     * @param observer
     */
    public void detach(Observer observer);
    /**
     * 通知订阅者更新消息
     */
    public void notify(String message);

}
