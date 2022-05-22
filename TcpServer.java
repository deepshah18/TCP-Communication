import java.io.*; 
import java.net.*; 
public class TCPServer
{
public static void main(String args[]) throws Exception
{

ServerSocket ss = new ServerSocket(2134); Socket s2 = ss.accept();;
while(true)
{

BufferedReader br = new BufferedReader(new InputStreamReader(s2.getInputStream()));
String msg = br.readLine(); 
System.out.println("Client Message : " + '\n' + msg); 
System.out.println("Send Reply : ");

BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
String reply = r1.readLine(); 
DataOutputStream outToClient = new
DataOutputStream(s2.getOutputStream());
outToClient.writeBytes(reply + '\n');
}
}
}
