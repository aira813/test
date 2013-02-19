public class ComputerPlayer extends Player {


    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    Address next(FieldState[][] field) {
        int i = 0;
        for(FieldState[] fieldX: field){
            int j = 0;
            for (FieldState fieldXY: fieldX){
                if(fieldXY == FieldState.empty){
                    Address address = new Address();
                    address.setX(i);
                    address.setY(j);
                    return address;
                }
                j++;
            }
            i++;
        }
        return null;
    }
}
