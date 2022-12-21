public class ex1108 {
    class Solution {
        public String defangIPaddr(String address) {
            StringBuilder a = new StringBuilder();
            for (char i: address.toCharArray()){
                if (i == '.'){
                    a.append("[.]");
                } else {
                    a.append(i);
                }
            }
            return a.toString();
        }
    }
}
