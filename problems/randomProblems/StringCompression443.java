package randomProblems;
class StringCompression443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
        
         
    }

    public static int compress(char[] chars) {
        StringBuilder output = new StringBuilder(""); 
        int count = 1;
        char previousChar = chars[0];
        for(int i=1; i< chars.length; i++ ) {
            if (chars[i] == previousChar) {
                count++;
            } else {
                output.append(previousChar);
                if(count > 1)
                    output.append(count);
                previousChar = chars[i];
                count = 1;
            }
        }
        output.append(previousChar);
        if(count > 1)
            output.append(count);

        
        for(int  i = 0 ; i < output.length(); i++){
            chars[i] = output.charAt(i);
        }
        return output.length();
    }
}