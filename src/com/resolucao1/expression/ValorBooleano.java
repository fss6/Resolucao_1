package com.resolucao1.expression;

import com.resolucao1.util.Tipo;
import com.resolucao1.util.TipoPrimitivo;

/**
 * Este valor primitivo encapsula um valor booleano.
 */
public class ValorBooleano extends ValorConcreto<Boolean> {

	
	/**
	 * Cria um objeto encapsulando o valor booleano fornecido.
	 */
	public ValorBooleano(boolean valor) {
		super(valor);
	}

	
	/**
	 * Retorna os tipos possiveis desta expressao.
	 *
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo() {
		return TipoPrimitivo.BOOLEANO;
	}


}