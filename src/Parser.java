public class Parser {
    //The parser is responsible for loading the data into the collection
    //It does so by iterating over all possible segments in the datum and registering hits
    Collection collection;
    public Parser(Collection c){
        collection = c;
    }

    public void parse(String[] data){
        for(String datum : data){
            for(int i = 0; i < datum.length(); i++){
                int max = Math.min(datum.length()-i+1, collection.getDepth()+1);
                for(int l = 1; l < max; l++){
                    collection.put(toLowercase(datum.substring(i, i+l)));
                }
            }
        }
    }

    private String toLowercase(String s){
        String r = "";
        for(char c : s.toCharArray()){
            r += Character.toLowerCase(c);
        }
        return r;
    }
}