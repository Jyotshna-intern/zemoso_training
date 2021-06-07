import java.util.*;
public class CheckForAllLetters {

    public static void main(String arg[])
    {
        //time complexity O(n+26)
        //Space complexity O(26);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string");
        char[] inputString=scanner.next().toCharArray();

        boolean presenceFlag[] =new boolean[26];
        CheckForAllLetters checkForAllLetters =new CheckForAllLetters();

        for (char inputChar:inputString)
        {
            if(Character.isUpperCase(inputChar))
                checkForAllLetters.updateFlag(presenceFlag,inputChar-65);
            else
                checkForAllLetters.updateFlag(presenceFlag,inputChar-97);
        }

        if(checkForAllLetters.verifyAllLetters(presenceFlag))
            System.out.println("Given Input String consists of all the english alphabets");
        else
            System.out.println("Given input does not contain all the english character");

    }

    public  void updateFlag(boolean[] presenceFlag,int index)
    {
        presenceFlag[index]=true;
    }

    public boolean verifyAllLetters(boolean[] presenceFlag)
    {
        for(int index =0;index<26;index++) {
            if (!presenceFlag[index])
                return false;
        }
        return true;



    }
}
