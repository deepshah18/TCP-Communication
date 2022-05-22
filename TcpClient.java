import java.io.*; 
import java.net.*; 
class TCPClient
{
public static void main(String args[])
{

try {

Socket s1 = new Socket("localhost",2134); 
String sentence;
while(true)
{
BufferedReader inFromUser = new BufferedReader(new  InputStreamReader(System.in));
System.out.println("Enter a message : ");
sentence = inFromUser.readLine();
DataOutputStream outToServer = new DataOutputStream(s1.getOutputStream());
outToServer.writeBytes(sentence + '\n');


BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
String msg = br.readLine(); System.out.println("From Server : " + '\n' + msg);

if(msg.equals("Exit"))
{

System.exit(1);

s1.close();
}
}
}

catch(Exception e) {}
}
}
