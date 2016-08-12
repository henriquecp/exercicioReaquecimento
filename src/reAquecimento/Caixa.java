package reAquecimento;

import java.util.ArrayList;

public class Caixa {
	
	private Client client;

	private ArrayList<Client> lst;
	
	public Caixa() {
		
	}
	
	public boolean isEmpty(){
		return true;
	}
	
	public Client current(){
		return client;
	}
	
	public void startClient(Client client){
		if(!isEmpty()){
			client = this.client;
		}
		else
		{
			client = null;
			System.out.println("");
		}
		
		
		
		
		int count=0;
	}
	
}
