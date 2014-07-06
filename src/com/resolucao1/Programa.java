package com.resolucao1;

import com.resolucao1.expression.Expressao;

public class Programa{

	private Expressao exp;

	public Expressao executar() {
		Expressao result = exp.avaliar();
		System.out.println(result);
		return  result;		
 	}

	public boolean checaTipo() {
		return exp.checaTipo();
 	}

	public Programa(Expressao exp){
		this.exp = exp;
	}

	public Expressao getExpressao() {
		return exp;
	}

}
