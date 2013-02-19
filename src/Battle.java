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
        while (true) {
            Address firstPlayerAddress = firstPlayer.next(field, fieldLength);
            field[firstPlayerAddress.getX()][firstPlayerAddress.getY()] = FieldState.first;
            FieldUtil.print(field, fieldLength);
            if (FieldUtil.isWin(field, fieldLength)) {
                return;
            }
            Address secondPlayerAddress = secondPlayer.next(field, fieldLength);
            field[secondPlayerAddress.getX()][secondPlayerAddress.getY()] = FieldState.second;
            FieldUtil.print(field, fieldLength);
            if (FieldUtil.isWin(field, fieldLength)) {
                FieldUtil.print(field, fieldLength);
                return;
            }
            if (!FieldUtil.checkContinue(field, fieldLength)) {
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
