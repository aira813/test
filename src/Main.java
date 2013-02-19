public class Main {

    public static void main(String[] args) {
        Player firstPlayer = new ComputerPlayer(">>1");
        Player secondPlayer = new ComputerPlayer(">>2");
        Battle battle = new Battle(firstPlayer,secondPlayer);
        battle.start();
    }
}
