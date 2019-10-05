import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient 
{

	public static void main(String[] args) throws IOException
	{
		  Scanner sc = new Scanner(System.in);

		  DatagramSocket ds = new DatagramSocket();
		  InetAddress ia = InetAddress.getLocalHost();
		  byte buf[] = null;
		  
		  while (true)
		  {
		   String inp = sc.nextLine();
		   buf = inp.getBytes();
		   DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 40119);
		   ds.send(dp); 
		   
		   if (inp.equals("bye"))
		    break;
		  }
		  
	}

}
