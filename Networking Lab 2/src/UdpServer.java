import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.IOException;


public class UdpServer 
{

	public static void main(String[] args) throws IOException 
	{
		DatagramSocket ds = new DatagramSocket(40119);
        byte[] b1 = new byte[65535];
        DatagramPacket dp = null;
        
        while(true)
        {
         dp = new DatagramPacket(b1, b1.length); 
         ds.receive(dp);
         System.out.println("Client:-" + data(b1));
         if (data(b1).toString().equals("bye"))
         {
          System.out.println("Client sent bye");
          break; 
         }
         b1 = new byte[65535];
        }
		
	}
	
    public static StringBuilder data(byte[] a) 
    { 
       if (a == null) 
           return null; 
       StringBuilder ret = new StringBuilder(); 
       int i = 0; 
       while (a[i] != 0) 
       { 
           ret.append((char) a[i]); 
           i++; 
       } 
       return ret; 
     } 


}
