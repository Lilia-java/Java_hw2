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

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorNames(){
        return "authorName1, authorName2";
    }
    public String toString(){
        return "Book [name="+name+" ,authors=" + authors + ", price="+ price+", quantity="+qty+"]";
    }
   /* String toString(String name, Author[] authors, int price, int qty){
        return "Book [name="+name+" ,authors=" + authors + ", price="+ price+", quantity="+qty+"]";
    }*/
}
