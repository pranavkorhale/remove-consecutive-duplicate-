import java.util.*;
public class Main
{
    public static void duplicate(char[]arr,int first)
    {
        if(arr[first]=='0')
        {
            return;
        }
        if(arr[first]!=arr[first+1])
        {
            duplicate(arr,first+1);
        }else{
            for(int i=first;i<arr.length-1;i++)
            {
                arr[i] = arr[i+1];
            }
            duplicate(arr,first);
        }
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str+'0';
		
		char[]arr = str.toCharArray();
		duplicate(arr,0);
		for(char ch:arr)
		{
		    if(ch!='0')
		        {
		            System.out.print(ch);
		        }
		}
	}
}
