
package eva3_2_stack;

public class EVA3_2_STACK {

    public static void main(String[] args) {
        A();
    }
    public static void A(){
        B();
    }
    public static void B(){
        C();
    }
    public static void C(){
        int x = 100, y = 0, resu;
        resu = x / y;
        System.out.println("Division: " + resu);
    }
    
}
