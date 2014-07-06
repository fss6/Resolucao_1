/* 
   Execucao de alguns programas-testes.

   Autor: Vander Alves
   Data da ultima alteracao:  12/04/99
*/

package com.resolucao1;

import com.resolucao1.expression.ExpAnd;
import com.resolucao1.expression.ExpConditional;
import com.resolucao1.expression.ExpOr;
import com.resolucao1.expression.ValorString;

public class Exemplos {

  public static void main(String [] args){

    // Avalia    not ( (T and F) or (T and T) )
	Programa prg = null;//new Programa(
                //new ExpNot( new ExpOr(new ExpAnd( new ValorBooleano(true),new ValorBooleano(false)), 
                  //                    new ExpAnd( new ValorBooleano(true), new  ValorBooleano(true)))));
	
	//(P ^ Q) -> (P v R) -> R
	ExpAnd esq0 =  new ExpAnd(new ValorString("P"), new ValorString("Q"));
	ExpOr esq1 = new ExpOr(new ValorString("P"), new ValorString("R"));
	ExpConditional esq = new ExpConditional(esq0, esq1);
	ValorString dir = new ValorString("R");
	prg = new Programa(new ExpConditional(esq, dir));
	
	if (!prg.checaTipo()) {
		System.out.println("Erro de tipo");
	} else {
		System.out.println(prg.getExpressao());
		prg.executar();
	}
	
	/* 
 
   // Avalia   not T ==  F and 1
  prg = new Programa(new ExpEquals(new ExpNot(new ValorBooleano(true)), 
                                   new ExpAnd(new ValorBooleano(false),new ValorInteiro(1))));
	if (!prg.checaTipo()) {
		System.out.println("Erro de tipo");
	} else {
		System.out.println(prg.executar());
	}*/
 }
}
