public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int tempature){
        if (summer == true){
            if (tempature < 25 || tempature > 45){
                return false;
            }else{
                return true;
            }
        }else{
            if (tempature < 25 || tempature > 35){
                return false;
            }else{
                return true;
            }
        }
    }
}
