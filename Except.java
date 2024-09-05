class A extends Exception {}
class B extends RuntimeException {}

public class Q2{
class Except {
    static int check(int n) {
        if(n<0){
            throw new RuntimeException();
        } else if (n == 0){
            throw new A();
        } else {
            throw new B();
        }
    }
}

public static void main(String[] args) {
    try{
    int x = args.length - 1;
    check(x);
    }catch (RuntimeException r) {
        System.out.println("runtime erro");
    }catch (A a) {
        System.out.println("a erro");
    }catch (B b) {
        System.out.println("b erro");
    }
}
}