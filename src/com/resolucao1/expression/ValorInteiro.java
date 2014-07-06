package com.resolucao1.expression;

import com.resolucao1.util.Tipo;
import com.resolucao1.util.TipoPrimitivo;

/**
 * Objetos desta classe encapsulam valor inteiro.
 */
public class ValorInteiro extends ValorConcreto<Integer> {
	
	public ValorInteiro(int valor) {
		super(valor);
	}
	
	/**
	 * Retorna os tipos possiveis desta expressao.
	 *
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo() {
		return TipoPrimitivo.INTEIRO;
	}

}
