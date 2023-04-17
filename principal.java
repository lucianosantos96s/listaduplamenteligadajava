package ac3_4_5;

import java.util.*;

//A Lisca Encadeada, a Fila e a Pilha operam sobre varáveis diferentes.

public class principal {

	public static void main(String[] args) {
		int valor = 0;
		int valor_lista;
		no inicio_lista = null;
		no fim_lista = null;
		no aux_lista = null;
		
		no inicio_pilha = null;
		no fim_pilha = null;
		
		no inicio_fila = null;
		no fim_fila = null;
		
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Lista duplamente encadeara circular");
			System.out.println("");
			System.out.println("1 para inserir no inicio da lista");
			System.out.println("2 para inserir no meio da lista");
			System.out.println("3 para inserir no fim da lista");
			System.out.println("4 para remover no inicio da lista");
			System.out.println("5 para remover no meio da lista");
			System.out.println("6 para remover no fim da lista");
			System.out.println("7 para exibir a lista no inicio ao fim");
			System.out.println("8 para exibir a lista do fim ao comeco");
			System.out.println("");
			System.out.println("");
			
			System.out.println("Fila");
			System.out.println("");
			System.out.println("9 para inserir na fila");
			System.out.println("10 para remover da fila");
			System.out.println("11 para exibir a fila");
			System.out.println("");
			System.out.println("");
			
			System.out.println("Pilha");
			System.out.println("");
			System.out.println("12 para inserir na pilha");
			System.out.println("13 para remover na pilha");
			System.out.println("14 para exibir a pilha");
			System.out.println("");
			System.out.println("");
			
			System.out.println("0 para sair");
			
			menu = sc.nextInt();
			
			switch(menu){
			case 1:
				
				if(inicio_lista == null & fim_lista == null) {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					inicio_lista = novo;
					fim_lista = novo;
					novo.ant = inicio_lista;
					novo.prox = fim_lista;
					
				} else {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					novo.prox = inicio_lista;
					inicio_lista.ant = novo;
					inicio_lista = novo;
					inicio_lista.ant = fim_lista;
				}	
				break;
			case 2:
				if(inicio_lista == null & fim_lista == null) {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					inicio_lista = novo;
					fim_lista = novo;
					novo.ant = inicio_lista;
					novo.prox = fim_lista;
					
				} else {
					System.out.println("Digite antes de qual valor deseja inserir");
					valor_lista = sc.nextInt();
					aux_lista = inicio_lista;
					while(aux_lista.valor != valor_lista) {
						aux_lista = aux_lista.prox;
						if(aux_lista == fim_lista && valor_lista != fim_lista.valor) {
							System.out.println("Valor não encontrado");
							break;
						}
					}
										
					no novo = new no();
					System.out.println("Digite o valor a ser inserido");
					novo.valor = sc.nextInt();
					
					novo.prox = aux_lista.prox;
					novo.ant = aux_lista;
					aux_lista.prox = novo;
					
				}
				break;
				
			case 3:
				if(inicio_lista == null & fim_lista == null) {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					inicio_lista = novo;
					fim_lista = novo;
					novo.ant = inicio_lista;
					novo.prox = fim_lista;
					
				} else {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					fim_lista.prox = novo;
					novo.ant = fim_lista;
					fim_lista = novo;
					
				}
				break;
				
			case 4:
				if (inicio_lista == null && fim_lista == null) {
					System.out.println("Lista Vazia");
				} else if(inicio_lista == fim_lista) {
					System.out.println("Apagando item");
					inicio_lista = null;
					fim_lista = null;
				} 
				
				else {
					System.out.println("Apagando inicio");
					inicio_lista.prox.ant = fim_lista;
					inicio_lista = inicio_lista.prox;
				}
				
				break;
				
			case 5:
				if (inicio_lista == null && fim_lista == null) {
					System.out.println("Lista Vazia");
				} else if (inicio_lista == fim_lista) {
					System.out.println("Apagando item");
					inicio_lista = null;
					fim_lista = null;
				} else {
					System.out.println("Digite qual valor deseja remover");
					valor_lista = sc.nextInt();
					aux_lista = inicio_lista;
					while(aux_lista.valor != valor_lista) {
						aux_lista = aux_lista.prox;
						if(aux_lista == fim_lista && valor_lista != fim_lista.valor) {
							System.out.println("Valor não encontrado");
							break;
						}		
					}
					
					aux_lista.ant.prox = aux_lista.prox;
					aux_lista.prox.ant = aux_lista.ant;
					
				}
				break;
			
			case 6:
				if (inicio_lista == null && fim_lista == null) {
					System.out.println("Lista Vazia");
				} else if (inicio_lista == fim_lista) {
					System.out.println("Apagando item");
					inicio_lista = null;
					fim_lista = null;
				} else {
					fim_lista = fim_lista.ant;
				}
				break;
				
			case 7:
				if (inicio_lista == null && fim_lista == null) {
					System.out.println("Lista Vazia");
				}else {
				aux_lista = inicio_lista;
				while(aux_lista != fim_lista) {
					System.out.println(aux_lista.valor);
					aux_lista = aux_lista.prox;
				}
				System.out.println(aux_lista.valor);
			}
				break;
			
			case 8:
				if (inicio_lista == null && fim_lista == null) {
					System.out.println("Lista Vazia");
				}else {
					aux_lista = fim_lista;
					while(aux_lista != inicio_lista) {
						System.out.println(aux_lista.valor);
						aux_lista = aux_lista.ant;
					}
				}
				System.out.println(aux_lista.valor);
			break;
			
			
			case 9:
				
				if(inicio_fila == null & fim_fila == null) {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					inicio_fila = novo;
					fim_fila = novo;
					novo.ant = inicio_fila;
					novo.prox = fim_fila;
					
				} else {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					novo.prox = inicio_fila;
					inicio_fila.ant = novo;
					inicio_fila = novo;
					inicio_fila.ant = fim_fila;
				}
				break;
				
			case 10:
				
				if (inicio_fila == null && fim_fila == null) {
					System.out.println("Fila Vazia");
				} else if (inicio_fila == fim_fila) {
					System.out.println("Apagando item");
					inicio_fila = null;
					fim_fila = null;
				} else {
					fim_fila = fim_fila.ant;
				}
				break;
				
			case 11:
				if (inicio_fila == null && fim_fila == null) {
					System.out.println("Fila Vazia");
				}else {
				aux_lista = inicio_fila;
				while(aux_lista != fim_fila) {
					System.out.println(aux_lista.valor);
					aux_lista = aux_lista.prox;
				}
				System.out.println(aux_lista.valor);
			}
				break;
			
			case 12:
				
				if(inicio_pilha == null) {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					inicio_pilha = novo;
					fim_pilha = novo;
					novo.ant = inicio_pilha;
					novo.prox = fim_pilha;
					
				} else {
					no novo = new no();
					System.out.println("Digite o valor");
					novo.valor = sc.nextInt();
					novo.prox = inicio_pilha;
					inicio_pilha.ant = novo;
					inicio_pilha = novo;
					inicio_pilha.ant = fim_pilha;
				}
				
				
				break;
				
			case 13:
				if (inicio_pilha == null && fim_pilha == null) {
					System.out.println("Pilha Vazia");
				} else if(inicio_pilha == fim_pilha) {
					System.out.println("Apagando item");
					inicio_pilha = null;
					fim_pilha = null;
				} 
				
				else {
					System.out.println("Apagando pilha");
					inicio_pilha.prox.ant = fim_pilha;
					inicio_pilha = inicio_pilha.prox;
				}
				
				break;
				
			case 14:
				if (inicio_pilha == null && fim_pilha == null) {
					System.out.println("Pilha Vazia");
				}else {
				aux_lista = inicio_pilha;
				while(aux_lista != fim_pilha) {
					System.out.println(aux_lista.valor);
					aux_lista = aux_lista.prox;
				}
				System.out.println(aux_lista.valor);
			}
				
				break;
		}
			
		} while(menu != 0);
		
		System.out.println("Encerrado");
	}

}
