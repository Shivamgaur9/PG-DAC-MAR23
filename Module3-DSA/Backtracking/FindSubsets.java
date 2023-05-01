// Find and print all subsets of a given string

class FindSubsets {

    public static void findSubsets(String str, int i ,String ans){ // i= index
        //base case
        if(i == str.length()) {
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                 System.out.println(ans);
            } 
            return;
        }
        //Yes Choice 
        findSubsets(str, i+1 , ans+str.charAt(i) );
        //No Choice
        findSubsets(str, i+1, ans );
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,0,""); //  "" empty String
    }
}

