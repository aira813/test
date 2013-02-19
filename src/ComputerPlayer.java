public class ComputerPlayer extends Player {


    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    Address next(FieldState[][] field, int fieldLength) {
        for(int i = 0;i<fieldLength;i++){
            for(int j = 0;j<fieldLength;j++){
                if(field[i][j] == FieldState.empty){
                    Address address = new Address();
                    address.setX(i);
                    address.setY(j);
                    return address;
                }
            }
        }
        return null;
    }
}
