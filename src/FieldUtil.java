public class FieldUtil {

    public static void print(FieldState[][] field,int fieldLength){
        //print field
        System.out.println("-----");
        for(int i = 0; i<fieldLength;i++){
            for(int j = 0;j<fieldLength;j++){
                printMark(field[i][j]);
            }
            System.out.println("");
        }
        System.out.println("-----");
    }

    private static void printMark(FieldState state){
        if(state == FieldState.empty){
            System.out.print("　");
        }
        if(state == FieldState.first){
            System.out.print("○");
        }
        if(state == FieldState.second){
            System.out.print("×");
        }
    }


    public static boolean isWin(FieldState[][] field,int fieldLength) {
        //tate
        for(int i = 0;i<fieldLength;i++){
            FieldState firstField = field[i][0];
            int j = 1;
            for(;j<fieldLength;j++){
                if(field[i][j] == FieldState.empty){
                    break;
                }
                if(firstField == field[i][j]){
                    continue;
                }else {
                    break;
                }
            }
            if(j == fieldLength){
                System.out.println("winner is ");
                printMark(firstField);
                return true;
            }
        }
        //yoko
        for(int i = 0;i<fieldLength;i++){
            FieldState firstField = field[0][i];
            int j = 1;
            for(;j<fieldLength;j++){
                if(field[j][i] == FieldState.empty){
                    break;
                }
                if(firstField == field[j][i]){
                    continue;
                }else {
                    break;
                }
            }
            if(j == fieldLength){
                System.out.println("winner is ");
                printMark(firstField);
                return true;
            }
        }
        //naname
        FieldState firstField = field[0][0];
        int i = 1;
        for(i = 1;i<fieldLength;i++){
            if(field[i][i] == FieldState.empty){
                break;
            }
            if(firstField == field[i][i]){
                continue;
            }else {
                break;
            }
        }
        if(i == fieldLength){
            System.out.println("winner is ");
            printMark(firstField);
            return true;
        }

        firstField = field[0][fieldLength-1];
        i = 1;
        for(;i<fieldLength;i++){
            if(field[i][fieldLength-1-i] == FieldState.empty){
                break;
            }
            if(firstField == field[i][fieldLength-1-i]){
                continue;
            }else {
                break;
            }
        }
        if(i == fieldLength){
            System.out.println("winner is ");
            printMark(firstField);
            return true;
        }

        return false;
    }


    public static boolean checkContinue(FieldState[][] field,int fieldLength){
        for(int i=0;i<fieldLength;i++){
            for(int j= 0;j<fieldLength;j++){
                if(field[i][j] == FieldState.empty){
                    return true;
                }
            }
        }
        return false;
    }
}
