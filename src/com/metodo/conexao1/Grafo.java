package com.metodo.conexao1;

import java.util.ArrayList;

public class Grafo {
	
	private ArrayList<Vertice> vertices;
	
	public Grafo(){
		this.vertices = new ArrayList<>();
	}
	
	public void addVertice(Vertice v){
		this.vertices.add(v);
	}
	
}
