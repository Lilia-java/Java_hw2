import java.util.Arrays;

public class Book extends Author {
    public String name;
    Author[] authors;
    public int price;
    public int qty;

    public Book(String name, int price, Author[] authors) {
        //Author[] arrAuth = {auth1,auth2};
        this.authors = authors;
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, int price, int qty) {
        //super(autName,email,gender);
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (price != book.price) return false;
        if (qty != book.qty) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + price;
        result = 31 * result + qty;
        return result;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                ", autName='" + autName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorNames(){
        return "authorName1, authorName2";
    }

}
