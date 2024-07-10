class LeetCode1598 {
    public static void main(String args[]){
	String logs[] = {"d1/","d2/","../","d21/","./"};
        int output = 0;
        for(int i = 0;i<logs.length;i++){
            if(logs[i].equals("../")){
                output -= 1;
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else{
                output+=1;
            }
            if(output>0){
                continue;
            }
            else{
                output=0;
            }
        }
	System.out.println(output);
    }
}