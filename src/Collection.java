class Collection {
    //A collection is a set of layers for each depth that is wished to be tested
    //It is responsible for processing a string into segments and compounding an ultimate probability
    //set for the next character

    private Layer[] layers;
    private int[] weights;

    Collection(int[] weights){
        this.weights = weights;
        layers = new Layer[weights.length];
        for(int i = 0; i < weights.length; i++){ layers[i] = new Layer(i+1);}
    }

    void put(String substring){
        layers[substring.length()-1].put(substring);
    }

    int[] getWeights(){
        return weights;
    }

    int getMaximumSize(){
        return weights.length;
    }

    Layer[] getLayers(){
        return layers;
    }

    void displayContents(){
        for(Layer l : layers){
            System.out.println("L" + l.getSegmentSize());
            for(Segment s : l.getSegments()){
                System.out.println("    \"" + s.getContent() + "\" - " + s.getHitCount());
            }
        }
    }
}
