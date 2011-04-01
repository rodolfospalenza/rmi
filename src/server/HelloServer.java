package server;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
	public static void main(String[] args) {
		try {
			Hello obj = new HelloImpl();
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("hello", obj);
			System.out.println("HelloServer Running.");
		} catch (RemoteException e) {
			System.err.println("RemoteException Error " + e.toString());
			e.printStackTrace();
		}
	}
}
