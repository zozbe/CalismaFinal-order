import java.sql.SQLOutput;

public class SpecialOrder extends Order {
    String date;
    String number;

    public SpecialOrder( String date, String number, Customer customer) {
        super(date, number, customer);
    }

    @Override
    public void confirm(){
        System.out.println("Siparişiniz Hazirlandi"+ customer.name);

    }
    @Override
    public void close(){

    }
    public void dispatch(){

    }
}
