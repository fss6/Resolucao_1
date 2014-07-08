
package com.resolucao1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.resolucao1.expression.ExpAnd;
import com.resolucao1.expression.ExpConditional;
import com.resolucao1.expression.ExpNot;
import com.resolucao1.expression.ExpOr;
import com.resolucao1.expression.ValorString;
import com.resolucao1.parser.Exp1Parser;
import com.resolucao1.parser.ParseException;

public class Exemplos {

  public static void main(String [] args) throws FileNotFoundException, ParseException{
	  
	Programa prg = null;
	//~(P -> R)
	
	/*ExpConditional exp = new ExpConditional(new ValorString("P"), new ValorString("R"));
	ExpNot esq = new ExpNot(exp);
	
	prg = new Programa(esq);
	
	if (!prg.checaTipo()) {
		System.out.println("Erro de tipo");
	} else {
		System.out.println(prg.getExpressao());
		prg.executar();
	}*/
	
	File file = new File("/Users/fabiosantos/Documents/workspace/Resolucao_1/run.txt");
	InputStream fis = new FileInputStream(file);
		
	Exp1Parser exp1Parser = new Exp1Parser(fis);
	prg = exp1Parser.Input();

	if (prg.checaTipo()) {
		System.out.println(prg.getExpressao());
		prg.executar();
	} else {
		System.out.println("erro de tipos!");
	}
 }
}
