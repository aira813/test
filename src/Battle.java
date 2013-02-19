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
            Address firstPlayerAddress = firstPlayer.next(field);
            field[firstPlayerAddress.getX()][firstPlayerAddress.getY()] = FieldState.first;
            FieldUtil.print(field);
            winner = FieldUtil.isWin(field, fieldLength);
            if (winner != null) {
                System.out.println("winner is " + winner.getMark());
                return;
            }
            Address secondPlayerAddress = secondPlayer.next(field);
            field[secondPlayerAddress.getX()][secondPlayerAddress.getY()] = FieldState.second;
            FieldUtil.print(field);
            winner = FieldUtil.isWin(field, fieldLength);
            if (winner != null) {
                System.out.println("winner is " + winner.getMark());
                return;
            }
            if (!FieldUtil.checkContinue(field)) {
                System.out.println("no more te");
                return;
            }

        }
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
