class Segment {
    //A segment is a collection of letter (of any length)

    private String content;
    private int hitCount;

    Segment(String content){
        this.content = content;
        hitCount = 1;
    }

    String getContent(){
        return content;
    }

    void hit(){
        hitCount++;
    }

    int getHitCount(){
        return hitCount;
    }
}
