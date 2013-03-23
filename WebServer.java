import java.io.*;
import java.net.*;

public class WebServer {
	public static void main(String argv[]) throws Exception {
		// set the port number to sumething higher than 1024
		int port;

		// create and establish the main server socket
		ServerSocket serverSocket = null;
		//TODO: Make sure you bind the socket to the port#
		//		refer to lecture slides for an example...

		// handle incoming http requests
		while (true) {
			// listen and accept TCP connection request off the main serverSocket
			Socket requestSock = null;
			//TODO: You need to accept the connection from the server socket and
			//	    have it bound to this new socket.
			//	    Make sure you also do some error handling here as well (try - catch)

			// constructthe HttpHandler object to process the incoming request
			HttpHandler x = new HttpHandler(requestSock);

			// pass it off to a new thread so that it runs in parallel
			Thread thread = new Thread(x);
			thread.start();
		}
	}
}
