package package1;
class A{
   A getClasses(){
     return this;
    }
}

public class mainer {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.getClasses());
    }

}
