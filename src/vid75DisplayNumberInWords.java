import java.util.Scanner;

public class vid75DisplayNumberInWords 
{
    public static String reverse(int n)
    {//123
        int rev=0;
        String str="";
        while (n>0)
        {
            rev=n%10;
            n=n/10;
            str=str+rev;
        }
        String value=String.valueOf(str);

        return value;
    }
    public static void convert(String str)
    {
        char c;
        for (int i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i);
            switch (c)
            {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;

            }
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any number");
        int num=sc.nextInt();
        String revNum=reverse(num);
       // System.out.println(revNum);
        convert(revNum);
    }

}
