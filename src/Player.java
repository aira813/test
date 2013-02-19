public abstract class Player {

    protected String name;

    public Player(String name){
        this.name = name;

    }


    abstract Address next(FieldState[][] field,int fieldLength);
}
