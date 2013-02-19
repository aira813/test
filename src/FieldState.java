public enum FieldState {
    empty("　"),
    first("○"),
    second("×");

    private String mark;

    private FieldState(String mark){
        this.mark = mark;
    }

    public String getMark(){
        return this.mark;
    }
}
