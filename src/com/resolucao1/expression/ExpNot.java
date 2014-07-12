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
	public ExpNot(Expressao exp) {
		super(exp, "~");
	}

	/**
	 * Retorna o valor da Expressao de negacao logica.
	 */
	public Expressao avaliar(Expressao externa) {
		
		
		// ExpNot(Exp)
		if( getExp() instanceof ExpBiconditional
							|| getExp() instanceof ExpConditional
							|| getExp() instanceof ExpAnd
							|| getExp() instanceof ExpOr)
			return getExp().avaliar(this);
		
		// ExpNot(Literal)
		if( getExp() instanceof Literal)
			return new ExpNot(getExp().avaliar(this));
		
		// ExpNot(ExpNot(Expressao))
		if( getExp() instanceof ExpNot){
			Expressao aux = getExp();
			return ((ExpUnaria) aux).getExp();
		}
		
		
			return null;
		
	}

	/**
	 * Realiza a verificacao de tipos desta expressao.
	 *
	 * @return <code>true</code> se os tipos da expressao sao validos;
	 *          <code>false</code> caso contrario.
	 */
	protected boolean checaTipoElementoTerminal() {
		return (getExp().getTipo().eString());
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 *
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo() {
		return TipoPrimitivo.STRING;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(getExp() instanceof Literal && obj instanceof Literal){
			return ((Literal) getExp()).valor().equals(((Literal) obj).valor());
		}else{
			return false;
		}
		
	}

	@Override
	public String expressionToString() {
		
		
		StringBuffer sb = new StringBuffer();
		sb.append('~');
		sb.append(getExp().expressionToString());
		return sb.toString();
	}

}
