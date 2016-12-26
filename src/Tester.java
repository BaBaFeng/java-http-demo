import httplib.*;

public class Tester {
	
	public static void main(String[] args) {
		HTTPRequest request = new HTTPRequest();
		
		String xget = request.get("http://192.168.0.254:65534");
		System.out.println("xget: " + xget);
		
		String xpost = request.post("http://192.168.0.254:65534", "Hello World");
		System.out.println("xpost: " + xpost);
		
	}
}