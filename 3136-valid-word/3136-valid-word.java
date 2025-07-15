class Solution {
    public boolean isValid(String word) {
        int c=0,c2=0,c3=0,c1=0;
        ArrayList<Character> ls=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        word=word.toLowerCase();
       for(Character ch:word.toCharArray()){
        if(ch==64 || ch==35 || ch==36 ){
            System.out.println(ch);
            return false;
        }else{
            if(ch>=97&&ch<=122){
            if(ls.contains(ch))c1=1;
            else c2=1;
            }
             c++;
        }
       }
       System.out.println("HI");
        if(c<3)return false;
        if(c2==0 || c1==0)return false;
        return true;
    }
}