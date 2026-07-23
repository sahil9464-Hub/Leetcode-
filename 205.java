lass Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sIndex = new int[256];
        int[] tIndex = new int[256];

        for(int i=0; i < s.length(); i++){

            char a = s.charAt(i);
            char b = t.charAt(i);

            if(sIndex[a] != tIndex[b]){
                return false;
  
            } else{
                sIndex[a] = i+1;
                tIndex[b] = i+1;
            }
        }
        return true;
    }
}
