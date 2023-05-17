
public class Child extends Mother{
    int y;
    /*void show(){
        System.out.println("HELLO THIS IS CHILD CLASS");
    }*/
    static void show(){
        System.out.println("HELLO THIS IS CHILD CLASS");//error: show() in Child cannot override show() in Mother
    }
}