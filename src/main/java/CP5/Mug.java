package CP5;

/**
 * Created by 10235 on 2017/7/24.
 */
public class Mug {
    Mu mug1;
    Mu mug2;

    {
        System.out.println("Mug1 2 init");
    }

    Mug() {
        System.out.println("mug");
    }

    Mug(int i) {
        System.out.println("mug" + i);
    }

    public static void main(String[] args){
        System.out.println("Inside main");
        new Mug();
        System.out.println("new Mugs() conplete");
        new Mug(1);
        System.out.println("new Mugs(1) conplete");
    }
}

class Mu {
    Mu(int marker) {
        System.out.println("mug" + marker);
    }

    void f(int marker) {
        System.out.println("mug  f" + marker);
    }
}
