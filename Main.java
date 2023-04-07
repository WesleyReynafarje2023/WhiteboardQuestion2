//Whiteboard question 2: 
//implement an algorithm to determine if a string has all unique characters


















public class Main
{
    public boolean hasAllUniq(String str)
    {
        char[] word = str.toCharArray();
        for(int i=0; i<word.length-1; i++)
            for(int b=i+1; b<word.length; b++){
                if(word[i]==word[b])
                    return false;
            }
        return true;
    }
}






























