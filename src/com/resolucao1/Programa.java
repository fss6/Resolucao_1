package com.resolucao1;

import com.resolucao1.expression.Expressao;
import com.resolucao1.expression.Valor;

public class Programa{

	private Expressao exp;

	public Valor executar() {
		Valor result = exp.avaliar();
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
