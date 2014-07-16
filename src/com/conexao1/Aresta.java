package com.conexao1;

public class Aresta {
	
	private Vertice vertice;
	
	public Aresta(Vertice v){
		this.vertice = v;
	}
	
	public Vertice getProximo(){
		return this.vertice;
	}
}
