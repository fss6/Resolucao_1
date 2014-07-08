package com.resolucao1;

import com.resolucao1.expression.ExpNot;
import com.resolucao1.expression.Expressao;

public class Programa{

	private Expressao exp;
	
	public Programa(Expressao exp){
		this.exp = exp;
	}

	public Expressao executar() {
		
		System.out.println("Init: " + exp);
		Expressao result = exp.avaliar(exp);
		System.out.println("Result exp: " + result);
		result = new ExpNot(result);
		System.out.println("Refutacao: " + result);
		System.out.println("Result Refutacao: " + result.avaliar(result));
		
		return  result;		
 	}

	public boolean checaTipo() {
		return exp.checaTipo();
 	}
	
	public Expressao getExpressao() {
		return exp;
	}

}
