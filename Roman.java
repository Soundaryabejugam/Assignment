import java.util.*;
public class Roman
{
    public static void main(String[] args)
     {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Roman numeral (must be CAPITAL):");
        String st=s.next();
        int n=0;
        int p=0; 
        for (int i=st.length()-1;i>=0;i--)
         {
            char c=st.charAt(i);
            int ans=hm.get(String.valueOf(c));
            if (ans<p)
            {
                n-=ans;
            }
             else 
             {
                n+=ans;
            }

            p=ans;
        }
        System.out.println(n);
    }
}
