//Find and print all Permutations of a string.

class Permutation{

    public static void findPermutations(String str, String ans){
        //base Condition
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion - O(n*n!)
        for(int i=0; i < str.length(); i++){
            char curr = str.charAt(i);
            // "abcde" = "ab" + "de"
            String str1 = str.substring(0,i) + str.substring(i+1); // i th character completely removed
            findPermutations(str1, ans + curr); // append curr in ans
        }
    }
    
    public static void main(String[] args){
        String str = "abc";
        findPermutations(str,"");    
    }
}