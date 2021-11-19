package author;

public class Book {

    private String title; // գրքի վերնագիրն է
    private String description; //գրքի նկարագրությունն է
    private double price; //գրքի գինն է
    private int count; //գրքի քանակն է, թե քանի հատ ունենք տվյալ գրքից

    public Book() {
    }

    public Book(String title, String description, double price, int count) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
