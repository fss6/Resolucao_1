package com.resolucao1;

import java.util.ArrayList;
import com.resolucao1.expression.*;

public class Programa{

	private Expressao expressao;
	private ArrayList<Expressao> clausulas;
	private ArrayList<ArrayList<Expressao>> clausulas2;
	
	public Programa(Expressao expressao){
		this.expressao = expressao;
		this.clausulas = new ArrayList<>();
	}

	public Expressao executar() {
		
		printExpressao("Expressao", expressao);
		printExpressao("FNC",expressao.avaliar(expressao));
		printExpressao("Por refutacao",(new ExpNot(expressao)).avaliar(expressao));
		separarClausulas(expressao);
		
		return  expressao;		
 	}
	
	private void printExpressao(String titulo, Expressao exp){
		
		this.expressao = exp;
		System.out.println("----------------- " + titulo + " -----------------");
		System.out.println();
		System.out.println(this.expressao);
		System.out.println();
		
	}
	
	private void printClausulas(String titulo){
		
		System.out.println("----------------- " + titulo + " -----------------");
		System.out.println();
		int count = 0;
		System.out.print("{");
		
		for (ArrayList<Expressao> clausula : this.clausulas2) {
			
			System.out.print("[ ");
			
			for (int i = 0 ; i < clausula.size() ; i++) {
				
				if( i < clausula.size() - 1){
					System.out.print(clausula.get(i) +", ");
				}else{
					System.out.print(clausula.get(i));
				}
				
			}
			
			if(count < this.clausulas2.size() - 1){
				System.out.print(" ], ");
				count += 1;
			}else{
				System.out.print(" ]");
			}
			
		
		}
		
		System.out.println("}");
		System.out.println();
		
	}
	
	private void separarClausulas(Expressao exp){
		
		
		this.clausulas.add(exp);
		int index = 0;
		
		while( index < clausulas.size()){
			
			exp = this.clausulas.get(index);
			
			if(exp instanceof ExpAnd){
				Expressao esq = ((ExpAnd) exp).getEsq();
				this.clausulas.add(esq);
				Expressao dir = ((ExpAnd) exp).getDir();
				this.clausulas.add(dir);
				this.clausulas.remove(exp);
			}else{
				index += 1;
			}
			
			
		}
		
		ArrayList<ArrayList<Expressao>> conjunto = new ArrayList<>();
		
		for (Expressao expressao : this.clausulas) {
			
			conjunto.addAll(expressao.expressionToString());
		}
		
			this.clausulas2 = conjunto;
		
		printClausulas("Clausulas");
		
	}

	public boolean checaTipo() {
		return expressao.checaTipo();
 	}
	
	public Expressao getExpressao() {
		return expressao;
	}

}
