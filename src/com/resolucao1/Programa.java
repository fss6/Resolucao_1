package com.resolucao1;

import java.util.ArrayList;

import com.resolucao1.expression.*;

public class Programa{

	private Expressao exp;
	private ArrayList<Expressao> expressoes;
	
	public Programa(Expressao exp){
		this.exp = exp;
		this.expressoes = new ArrayList<>();
	}

	public Expressao executar() {
		
		
		System.out.println("EXP: " + exp);
		Expressao result = exp.avaliar(exp);
		System.out.println("FNC: " + result);
		System.out.println("----------");
		result = new ExpNot(result);
		System.out.println("Por refutacao: " + result);
		result = result.avaliar(result);
		System.out.println("Result Refutacao: " + result);
		System.out.println("----------");
		teste(result);
		
		return  result;		
 	}
	
	public void teste(Expressao exp){
		
		
		this.expressoes.add(exp);
		int index = 0;
		
		while( index < expressoes.size()){
			
			exp = this.expressoes.get(index);
			
			if(exp instanceof ExpAnd){
				
				Expressao esq = ((ExpAnd) exp).getEsq();
				this.expressoes.add(esq);
				Expressao dir = ((ExpAnd) exp).getDir();
				this.expressoes.add(dir);
				this.expressoes.remove(exp);
				//index -= 1;
			}else{
				index += 1;
			}
			
			
		}
		
		int i = 0;
		
		for (Expressao expressao : this.expressoes) {
			System.out.println( i +": "+ expressao);
			i += 1;
		}
		
		
		System.out.println("Agrupar -----------------------");
		
		ArrayList<String[]> conjunto = new ArrayList<>();
		
		for (Expressao expressao : this.expressoes) {
			
			conjunto.add(expressao.expressionToString().split(","));
		}
		
		for (String[] strings : conjunto) {
			System.out.print("{");
			for (String string : strings) {
				System.out.print(" " + string + " ");
			}
			System.out.print("}\n");
		}
		
		
	}

	public boolean checaTipo() {
		return exp.checaTipo();
 	}
	
	public Expressao getExpressao() {
		return exp;
	}

}
