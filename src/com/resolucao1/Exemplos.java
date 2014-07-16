
package com.resolucao1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.parser.Exp1Parser;
import com.parser.ParseException;

public class Exemplos {

  public static void main(String [] args) throws FileNotFoundException, ParseException{
	  
	Programa prg = null;
	
	File file = new File("/Users/fabiosantos/Documents/workspace/Resolucao_1/run.txt");
	InputStream fis = new FileInputStream(file);
		
	new Exp1Parser(fis);
	prg = Exp1Parser.Input();

	if (prg.checaTipo()) {
		prg.executar();
	} else {
		System.out.println("erro encontrado!");
	}
 }
}
