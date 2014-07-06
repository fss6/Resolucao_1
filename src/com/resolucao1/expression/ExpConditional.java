package com.resolucao1.expression;

import com.resolucao1.util.Tipo;
import com.resolucao1.util.TipoPrimitivo;

/**
 * Um objeto desta classe representa uma Expressao de Conjuncao logica.
 */
public class ExpConditional extends ExpBinaria{

	/**
	 * Controi uma Expressao de Conjuncao logica  com as sub-expressoes
	 * especificadas. Estas devem ser tais que sua avaliacao retorna
	 * <code>ValorBooleano</code>
	 *
	 * @param esq Expressao da esquerda
	 * @param dir Expressao da direita
	 */
	public ExpConditional(Expressao esq, Expressao dir) {
		super(esq, dir, "->");
	}


	/**
	 * Retorna o valor da Expressao de Conjuncao Logica
	 */
	 public Expressao avaliar(){ 
		
		ExpNot expNot = new ExpNot(getEsq().avaliar());
		ExpBinaria expressao = (ExpBinaria) new ExpOr(expNot, getDir().avaliar());
		
		return expressao;
	}
 
	/**
	 * Realiza a verificacao de tipos desta expressao.
	 *
	 * @return <code>true</code> se os tipos da expressao sao validos;
	 *          <code>false</code> caso contrario.
	 */
	protected boolean checaTipoElementoTerminal() {
		return (getEsq().getTipo().eString() && getDir().getTipo().eString());
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