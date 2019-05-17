public class Segment {
    //A segment is a collection of letter (of any length)
    //It can be asked for the most likely next letter
    //It will be populated as initially even, then weighted by getting hits recieved from training

    private String content;
    private int hitCount;

    public Segment(String content){
        this.content = content;
        hitCount = 1;
    }

    public String getContent(){
        return content;
    }

    public void hit(){
        hitCount++;
    }

    public int getHitCount(){
        return hitCount;
    }
}
