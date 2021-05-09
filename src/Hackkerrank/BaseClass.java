package Hackkerrank;

interface BaseInterface {void method();}


public class BaseClass {
    public void method(){
        System.out.println("Inside BaseC::method");
    }
}
class ImplementationClass extends BaseClass implements BaseInterface {
    public static void main(String[] args) {
        (new ImplementationClass()).method();
    }
}
