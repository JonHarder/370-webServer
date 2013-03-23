import java.io.*;
import java.net.*;
import java.util.*;

public class HttpHandler implements Runnable {
	String CRLF = "\r\n";  // this is specifically used in the HTTP protocol
	Socket socket;

	public HttpHandler(Socket socket) throws Exception {
		this.socket = socket;
	}

	public void run() { // run() method of Runnable interface
		try {
			processRequest();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void processRequest() throws Exception {
		System.out.println("*********** Processing Request ***************");
		// TODO: get references to the socket's input and output streams
		InputStream is = ;
		DataOutputStream os = ;

		// set up input stream filters
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		// get the request line of the HTTP request message
		String requestLine = br.readLine();

		// display the request line
		System.out.println(requestLine);

		// -get and display the header lines
		// -note that the requests contain variying number of header lines
		// -Q:when the headerLine has a length of zero,
		// 		what does it mean? see HTTP protocol
		String headerLine = null;
		while ((headerLine = br.readLine()).length() != 0) {
			System.out.println(headerLine);
		}

		// close everything
		os.close();
		br.close();
		socket.close();
	}
}
