//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer c= new Customer("Berfin", "Mersin");
        Customer c2= new Customer("İrem","Adana");
        SpecialOrder s= new SpecialOrder("bugün","1",c);
        SpecialOrder s2=new SpecialOrder("yarın","2",c2);
        s.confirm();
        s2.confirm();
    }
}