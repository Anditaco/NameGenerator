public class Main {
    //Main method holder
    //Has a parser which takes data
    //Has a generator which processes data
    public static void main(String[] args){
        String[] data = {"John", "Stu", "Lucas", "Joe"};

        Collection collection = new Collection(5);
        Generator generator = new Generator(collection);
        Parser parser = new Parser(collection);

        parser.parse(data);
        collection.displayContents();
    }
}