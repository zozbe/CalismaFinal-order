public class NormalOrder extends Order {
    String date;
    String number;

   public NormalOrder( String date, String number, Customer customer){
        super(date,number,customer);
    }

    @Override
    public void confirm(){
        System.out.println("");
    }
    @Override
    public void close(){
    }

    public void dispatch(){
    }
    public void receive(){
    }
}
