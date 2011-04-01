package client;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
	public static void main(String[] args) {
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			Hello stub = (Hello) registry.lookup("hello");
			String msg = stub.sayHello();
			System.out.println("Server Reply: " + msg);
		} catch (RemoteException e) {
			System.err.println("RemoteException Error " + e.toString());
			e.printStackTrace();
		} catch (NotBoundException e) {
			System.err.println("NotBoundException Error " + e.toString());
			e.printStackTrace();
		}
	}

}
