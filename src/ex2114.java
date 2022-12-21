public class ex2114 {
    class Solution {
        public int mostWordsFound(String[] sentences) {
            int x = 0;
            int y = 0;
            for( String i : sentences){
                for( int j = 0 ; j < i.length(); j++){
                    if(i.charAt(j) == ' '){
                        x++;
                    }
                }
                y = Math.max(x,y);
                x = 0;
            }
            return y + 1;
        }
    }
}
