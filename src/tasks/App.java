package tasks;

public class App {
    int s;
    int r;

    public App(int s, int r) {
        this.s = s;
        this.r = r;
    }
    int add(){
        return s + r;
    }
    void minus(){
        System.out.println(s-r);
    }
}
