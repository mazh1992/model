package modle.status;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class Test {

    public static void main(String[] args) {

        VoteManager vm = new VoteManager();
        for(int i=0;i<10;i++){
            vm.vote("u1","A");
        }
    }
}
