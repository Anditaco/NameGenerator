import java.util.ArrayList;

class Generator {
    //The generator is responsible for generating a string upon request
    //It builds a string by querying the collection for the next character
    private Collection collection;
    Generator(Collection c){
        collection = c;
    }

    void generate(){
        String name = " ";
        do{
            name = generateCharacter(name);
        }
        while(name.charAt(name.length()-1) != '.');
        System.out.println("Result: " + name);
    }

    private String generateCharacter(String name){
        ArrayList<Character> allPossiblities = new ArrayList<>();
        Layer[] layers = collection.getLayers();
        int[] weights = collection.getWeights();
        for(int i = 0; i < Math.min(layers.length-1, name.length()); i++){
            for(int w = 0; w < weights[i]; w++)
                allPossiblities.addAll(layers[i+1].possibilities(name.substring(name.length()-i-1)));
        }
        return name + allPossiblities.get((int)(Math.random()*allPossiblities.size()));
    }
}
