public class Pokemon {
    String type="";
    int power=0;
    String owner="";
    String town="";
    public static void main(String args[]){
        Pokemon obj1=new Pokemon();
        obj1.type="Water";
        obj1.power=199;
        obj1.owner="ash";
        obj1.town="ballet";
        System.out.println(obj1.owner);
        Pokemon obj2=new Pokemon();
        obj2.type="Pshycic";
        System.out.println(obj2.type);
    }
}
