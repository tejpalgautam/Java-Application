import java.io.*;
class charTest{
public static void main(String aa[])
throws IOException
{
char ch;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
while(true) 
{
System.out.println("Enter a charecter : ");
ch = (char)br.read();
System.out.print("You Entered : ");

if(Character.isDigit(ch))
{
	System.out.println("a digit");
	}

else if (Character.isUpperCase(ch))
{
	System.out.println("Uppercharecter : ");
	}

else if (Character.isLowerCase(ch))
{
	System.out.println("a LoewrCase");
	}
	else if(Character.isSpaceChar(ch))
	{
		System.out.println("SpaceCharacter : ");
		}
else 
{
	System.out.println("sorry i dont recognise it");
}

br.skip(2);
}
}
}
