package server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class HelloImpl extends UnicastRemoteObject implements Hello {

	protected HelloImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Hello World!";
	}

}
