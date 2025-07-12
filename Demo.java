public class Demo {
    void add(int a, int b){
        System.out.println("Sum is"+(a+b));
        
    }
    void sub(int a,int b){
        System.out.println("Difference is"+(a-b));
    }
    public static void main(String args[])
    {
        Demo obj1=new Demo();
        obj1.add(21, 22);
        Demo obj2=new Demo();
        obj2.sub(1,2);

    }
}
