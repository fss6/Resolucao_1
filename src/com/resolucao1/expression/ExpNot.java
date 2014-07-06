package com.resolucao1.expression;

import com.resolucao1.util.Tipo;
import com.resolucao1.util.TipoPrimitivo;

/**
 * Um objeto desta classe representa uma Expressao de Negacao logica.
 */
public class ExpNot extends ExpUnaria{

	/**
	 * Controi uma Expressao de negacao logica com expressao
	 * especificada
	 * @param exp Expressao a ser negada. Assume-se que sua avaliacao resulta
	 *  em <code>ValorBooleano</code>.
	 */
	public ExpNot( Expressao exp) {
		super(exp, "~");
	}

	/**
	 * Retorna o valor da Expressao de negacao logica.
	 */
	public Expressao avaliar() {
		
		return new ValorBooleano(!((ValorBooleano) getExp().avaliar()).valor());
	}

	/**
	 * Realiza a verificacao de tipos desta expressao.
	 *
	 * @return <code>true</code> se os tipos da expressao sao validos;
	 *          <code>false</code> caso contrario.
	 */
	protected boolean checaTipoElementoTerminal() {
		return (getExp().getTipo().eBooleano());
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
