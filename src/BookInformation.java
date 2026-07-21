public class BookInformation {
    public  static   void main(String []args){

        System.out.println("Book Information");
        System.out.println("------------");
        String firstname = "Java";
        String lastname = "Programming";
        String fullname = firstname + lastname;
        System.out.println("Title:"+ fullname);

        //author
        String authorfname = "John";
        String authorlname = "Smith";
        String fullauthor  = authorfname + authorlname;
        System.out.println("Author:"+ fullauthor);

        //pages

        Integer page = 350;
        System.out.println("Pages:"+ page);

        double price = 19.99;
        System.out.println("Price:"+ price);


    }
}
