package com.resolucao1.expression;

import com.resolucao1.util.Tipo;
import com.resolucao1.util.TipoPrimitivo;

/**
 * Este valor primitivo encapsula um String.
 */
public class ValorString extends ValorConcreto<String>{

 	public ValorString(String valor) {
		super(valor);
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 *
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo() {
		return TipoPrimitivo.STRING;
	}

}
