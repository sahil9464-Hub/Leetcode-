class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for(String word :words){
            boolean consistent = true;

            for(char ch :word.toCharArray()){
                if(allowed.indexOf(ch) == -1){
                    consistent = false;
                    break;
                }
            }
            if(consistent) count++;
        }
        return count;
    }
}
