public class Phone {
  void phone(){
    System.out.println("THis is phone");
  }   
 static class Telephone extends Phone{
    void phone(){
        System.out.println("This is telephone");

  }
public static void main(String [] args){
Phone obj=new Phone();
obj.phone();
Telephone obj1 = new Telephone();
obj1.phone();
}
}
}
