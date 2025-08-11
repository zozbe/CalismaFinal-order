public abstract class Order {
    String date;
    String number;
    Customer customer;

    public Order(String date, String number, Customer customer){
        this.date=date;
        this.number=number;
        this.customer=customer;

    }
    public abstract void confirm();
    public abstract void close();




}
