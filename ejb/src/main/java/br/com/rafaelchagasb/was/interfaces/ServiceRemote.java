package br.com.rafaelchagasb.was.interfaces;

import javax.ejb.Remote;

@Remote
public interface ServiceRemote {
	
	void call();
	
}
