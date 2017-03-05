package de.tud.iptk;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResolverServlet
 */
@WebServlet("/ResolverServlet")
public class ResolverServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;    
	private String serverIpAddress;

    public ResolverServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Resolve the IP address of the server
		byte[] buffer = serverIpAddress.getBytes(StandardCharsets.UTF_8);
		try(OutputStream output = response.getOutputStream()){
			output.write(buffer);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Save the IP address sent by the Server
		serverIpAddress = request.getParameter("serverIpAddress");
	}

	public String getServerIpAddress() {
		return serverIpAddress;
	}

	public void setServerIpAddress(String serverIpAddress) {
		this.serverIpAddress = serverIpAddress;
	}

}
