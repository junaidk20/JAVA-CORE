package package1;


class A{
  int Q=10;
}
class b extends A{
    int P=Q;

}

public class mainer {
    public static void main(String[] args) throws Exception {
      int i=20;
      byte j=(byte) i;  //explicit
      byte l=20;
        int k=l;//implcit
        System.out.println(j);
        System.out.println(k);




    }


}