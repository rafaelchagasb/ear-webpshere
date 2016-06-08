package br.com.rafaelchagasb.was.ejb;

import javax.ejb.Stateless;

import br.com.rafaelchagasb.was.interfaces.ServiceLocal;
import br.com.rafaelchagasb.was.interfaces.ServiceRemote;

@Stateless
public class ServiceEJB implements ServiceLocal, ServiceRemote {

	public void call() {
		
		System.out.println("Method called");
		
	}

}
