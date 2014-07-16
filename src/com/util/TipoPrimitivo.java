package com.util;

/**
 * Enum que representa os possiveis tipos primitivo de uma expressao.
 * Objetos desta classe sao imutaveis, portanto as vezes as instancias sao
 * compartilhadas.
 * 
 * Modificado em 11/07/2005 por Leonardo Lucena para usar tipos enumerados
 */
public enum TipoPrimitivo implements Tipo {

	INTEIRO("INTEIRO"),
	BOOLEANO("BOOLEANO"),
	STRING("STRING");

	protected String nome;

	/**
	 * Construtor da classe que representa um tipo qualquer.
	 */
	private TipoPrimitivo(String nome) {
		this.nome = nome;
	}

	/* (non-Javadoc)
	 * @see com.util.Tipo#getNome()
	 */
	public String getNome() {
		return nome;
	}

	/* (non-Javadoc)
	 * @see com.util.Tipo#eInteiro()
	 */
	public boolean eInteiro() {
		return this.eIgual(INTEIRO);
	}

	/* (non-Javadoc)
	 * @see com.util.Tipo#eBooleano()
	 */
	public boolean eBooleano() {
		return this.eIgual(BOOLEANO);
	}

	/* (non-Javadoc)
	 * @see com.util.Tipo#eString()
	 */
	public boolean eString() {
		return this.eIgual(STRING);
	}

	/* (non-Javadoc)
	 * @see com.util.Tipo#eIgual(com.util.Tipo)
	 */
	public boolean eIgual(Tipo tipo) {
		boolean ret = false;
		if (eValido()) {
			if (tipo.eValido()) {
				ret = this.nome.equals(tipo.getNome());
			} else {
				ret = tipo.eIgual(this);
			}
		}
		return ret;
	}

	/* (non-Javadoc)
	 * @see com.util.Tipo#eValido()
	 */
	public boolean eValido() {
		return this.nome != null && nome.length() > 0;
	}

	/* (non-Javadoc)
	 * @see com.util.Tipo#intersecao(com.util.Tipo)
	 */
	public TipoPrimitivo intersecao(Tipo outroTipo) {
		if (outroTipo.eIgual(this)) {
			return this;
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return this.nome;
	}

}