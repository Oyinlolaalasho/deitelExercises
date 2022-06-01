package Composition;

public class PapaNoso {
    private Pray pray;
    private Walk walk;

    public PapaNoso(Pray pray, Walk walk) {
        this.pray = pray;
        this.walk = walk;
    }

    public void pray(){
        this.pray.pray();
    }

    public void setPray(Pray pray){
        this.pray = pray;
    }

    public void walk(){
        this.walk.walk();
    }

    public void setWalk(Walk walk) {
        this.walk = walk;
    }
}
