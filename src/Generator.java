public class Generator {
    //The generator is responsible for generating a string upon request
    //It builds a string by querying the collection for the next character
    Collection collection;
    public Generator(Collection c){
        collection = c;
    }

    public void generate(String pre){
        //Should ask each valid layer (given the size of pre) what the likely characters are
    }
}
