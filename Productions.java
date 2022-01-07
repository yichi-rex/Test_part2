public class Productions{
    private String category;
    private double price;
    private int people;

    public Productions(String category, double price, int people){
        this.category = category;
        this.price = price;
        this.people = people;
    }
    public String getCategory(){
        return category;
    } 
    public double getPrice(){
        return price;
    }
    public int getPeople(){
        return people;
    }
}