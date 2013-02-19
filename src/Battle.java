public class Battle {

    private Player firstPlayer;

    private Player secondPlayer;

    private FieldState[][] field;

    private int fieldLength = 3;

    public Battle(Player first, Player second) {
        this.firstPlayer = first;
        this.secondPlayer = second;
        initField(fieldLength);
    }

    public void start() {
        FieldState winner = null;
        while (true) {
            put(firstPlayer,FieldState.first);
            FieldUtil.print(field);
            if(check()){
                return;
            }
            put(secondPlayer,FieldState.second);
            FieldUtil.print(field);
            if(check()){
                return;
            }
            if (!FieldUtil.checkContinue(field)) {
                System.out.println("no more te");
                return;
            }
        }
    }

    private void put(Player player,FieldState state){
        Address firstPlayerAddress = firstPlayer.next(this.field);
        field[firstPlayerAddress.getX()][firstPlayerAddress.getY()] = state;
    }

    private boolean check(){
        FieldState winner = FieldUtil.isWin(this.field, this.fieldLength);
        if (winner != null) {
            System.out.println("winner is " + winner.getMark());
            return true;
        }
        return false;
    }

    private void initField(int length) {
        field = new FieldState[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                field[i][j] = FieldState.empty;
            }
        }
    }


}
