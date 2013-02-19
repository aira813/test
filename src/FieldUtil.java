public class FieldUtil {

    public static void print(FieldState[][] field){
        //print field
        System.out.println("-----");
        for(FieldState[] fieldX : field){
            for(FieldState fieldXY : fieldX){
                System.out.print(fieldXY.getMark());
            }
            System.out.println("");
        }
        System.out.println("-----");
    }

    public static FieldState isWin(FieldState[][] field,int fieldLength) {
        //tate
        for(int i = 0;i<fieldLength;i++){
            FieldState firstField = field[i][0];
            int j = 1;
            for(;j<fieldLength;j++){
                if(field[i][j] == FieldState.empty){
                    break;
                }
                if(firstField != field[i][j]){
                    break;
                }
            }
            if(j == fieldLength){
                return firstField;
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
                if(firstField != field[j][i]){
                    break;
                }
            }
            if(j == fieldLength){
                return firstField;
            }
        }
        //naname
        FieldState firstField = field[0][0];
        int i = 1;
        for(i = 1;i<fieldLength;i++){
            if(field[i][i] == FieldState.empty){
                break;
            }
            if(firstField != field[i][i]){
                break;
            }
        }
        if(i == fieldLength){
            return firstField;
        }

        firstField = field[0][fieldLength-1];
        i = 1;
        for(;i<fieldLength;i++){
            if(field[i][fieldLength-1-i] == FieldState.empty){
                break;
            }
            if(firstField != field[i][fieldLength-1-i]){
                break;
            }
        }
        if(i == fieldLength){
            return firstField;
        }

        return null;
    }


    public static boolean checkContinue(FieldState[][] field){
        for(FieldState[] fieldX: field){
            for(FieldState fieldXY : fieldX){
                if(fieldXY == FieldState.empty){
                    return true;
                }
            }
        }
        return false;
    }
}
