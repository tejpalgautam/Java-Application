import java.io.*;
import java.net.*;
class IpAddress {
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a website :");
String site = br.readLine();
try {
InetAddress ip = InetAddress.getByName(site);
System.out.println("The ip Address is : " + ip);
}
catch(UnknownHostException ue)
{
System.out.println("Website not found !");
}
}
}