public class Main {
    //Main method holder
    //Has a parser which takes data
    //Has a generator which processes data
    public static void main(String[] args){
        int[] weights = {5,50,25, 15, 5};

        Collection collection = new Collection(weights);
        Generator generator = new Generator(collection);
        Parser parser = new Parser(collection);


        Formater formater = new Formater();

        try {
            parser.parse(formater.format("Boy_Names"));
            //collection.displayContents();
            for(int i = 0; i < 1000; i++)
                generator.generate();
        }
        catch (Exception e){
            System.out.println("Error reading file");
            System.out.println(e.getMessage());
        }
    }
}