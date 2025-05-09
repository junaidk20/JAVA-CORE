package package1;


class A{
  int Q=10;
}
class b extends A{
    int P=Q;

}

public class mainer {
    public static void main(String[] args) throws Exception {
        A a = new b();//upcasting
        b bq=(b) a;//downcasting
        System.out.println(bq.P);



    }


}