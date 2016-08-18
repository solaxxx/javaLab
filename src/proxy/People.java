package proxy;

/**
 * Created by solax on 2016/8/18.
 */
public class People implements PeopleImp{

    private String name;

    private int count;

    People (String name) {
        this.name = name;
    }
    public void say () {
        System.out.println("im " + this.name);
    }
    public void count () {
        this.count ++;
        System.out.println("count = " + this.count);
    }
}
