package reAquecimento;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String args[]){
	ArrayList<Caixa> caixas = new ArrayList<>();
	ArrayList<Client> clientes = new ArrayList<>();
	Random r = new Random();
	
		for(int i = 0; i < 10; i++){
			caixas.add(new Caixa());
		}
		
		for(int i = 0; i < 10; i++){
			clientes.add(new Client("Joao" + i, r.nextInt(11) + 60));
		}
		
	}
	
}