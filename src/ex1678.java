public class ex1678 {
    class Solution {
        public String interpret(String command) {
            StringBuilder a = new StringBuilder();
            for (char i: command.toCharArray()){
                if (i == '('){
                    if(i+1 == ')'){
                        a.append("o");
                    } else if(i+1 != ')'){
                        a.append("");
                    }
                } else if(i == ')'){
                    a.append("");
                }else{
                    a.append(i);
                }
            }
            return a.toString();
        }

    }
}
