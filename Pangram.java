import java.util.*;
public class Pangram
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String st="abcdefghijklmnopqrstuvwxyz";
        System.out.println("enter some text:");
        String s=sc.nextLine().toLowerCase();
        int ans=MyPangram(s,st);
        if(ans>=25)
        {
            System.out.println("It's a pangram");
        }
        else{
            System.out.println("It's not a pangram");
        }
    }
        public static int MyPangram(String s,String st)
        {
            int count=0;
            for(int j=0;j<st.length();j++)
            {
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)==st.charAt(j))
                    {
                        count++;
                        break;
                    }
                }
            }
return count;
    }
}
