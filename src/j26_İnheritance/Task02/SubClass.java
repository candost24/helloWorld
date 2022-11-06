package j26_İnheritance.Task02;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.my_method();
    }
    int num=10;
public void my_method(){
    goster();//sub class call
    System.out.println("sub clas num"+num);
    System.out.println("super clas num"+super.num);

}
   @Override
    public void goster() {
        System.out.println("bu method sub classın görüntülenme methodlarıdır");
    }
}
