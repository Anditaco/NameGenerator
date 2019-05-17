public class Collection {
    //A collection is a set of layers for each depth that is wished to be tested
    //It is responsible for processing a string into segments and compounding an ultimate probability
    //set for the next character

    Layer[] layers;

    public Collection(int depth){
         layers = new Layer[depth];
         for(int i = 0; i < depth; i++){ layers[i] = new Layer(i+1);}
    }

    public void put(String substring){
        layers[substring.length()-1].put(substring);
    }

    public int getDepth(){
        return layers.length;
    }

    public void displayContents(){
        for(Layer l : layers){
            System.out.println("l " + l.getSegmentSize());
            for(Segment s : l.getSegments()){
                System.out.println("    \"" + s.getContent() + "\" - " + s.getHitCount());
            }
        }
    }
}
