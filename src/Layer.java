import java.util.ArrayList;

class Layer {
    //A Layer is a collection of segments of a known length
    //it is responsible for organizing the segments and distributing their probabilities upon request

    private ArrayList<Segment> segments = new ArrayList<>();
    private int segmentSize;

    Layer(int size) {
        segmentSize = size;
    }


    ArrayList<Character> possibilities(String pre){
        ArrayList<Character> possibilities = new ArrayList<>();
        for(Segment s : segments){
            if(s.getContent().substring(0,segmentSize-1).equals(pre)){
                for(int i = 0; i < s.getHitCount(); i++){
                    possibilities.add(s.getContent().toCharArray()[segmentSize-1]);
                }
            }
        }
        return possibilities;
    }

    void put(String substring){
        if(!containsString(substring)) segments.add(new Segment(substring));

    }

    private boolean containsString(String s){
        for(Segment segment : segments){
            if(segment.getContent().equals(s)) {
                segment.hit();
                return true;
            }
        }
        return false;
    }

    ArrayList<Segment> getSegments(){
        return segments;
    }

    int getSegmentSize(){
        return segmentSize;
    }
}