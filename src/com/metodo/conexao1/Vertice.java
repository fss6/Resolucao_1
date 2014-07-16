package com.metodo.conexao1;

import java.beans.Expression;
import java.util.ArrayList;

public class Vertice {
	
	private ArrayList<Aresta> arestas;
	private Expression expressao;
	
	public Vertice(Expression e){
		this.expressao = e;
		this.arestas = new ArrayList<>();
	}
	
	public void addAresta(Aresta a){
		this.arestas.add(a);
	}
	
}
