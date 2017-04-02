public class PatternMatching
{
public static void main(String args[])
{
String text ="MICR Code: Magnetic Ink Character Recognition as printed on cheque book to facilitate the processing of cheques.";
String pattern="hello";
boolean result=text.contains(pattern);
if(result)
{
System.out.println("pattern found");
}
else 
System.out.println("pattern not found");


}
}