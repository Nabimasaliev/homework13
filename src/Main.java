public class Main {
    public static void main(String[] args) {
        
        System.out.println("First variant!!!");

       MyClass myClass =new MyClass("Nabi", "Masaliev",19,"Plov");
       System.out.println(myClass.toString());

       System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("Second variant!!!");

        MyClass myClass1=new MyClass("Nabi","Masaliev",19,new String[]{"English","Java","Soft Skills"});
        System.out.println(myClass1.toString());
    }
}