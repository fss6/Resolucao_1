package com.resolucao1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.swing.JTextArea;

import com.resolucao1.parser.Exp1Parser;
import com.resolucao1.parser.ParseException;


public class MultiInterpretador {

	private static final int EXP1 = 0;

	private JTextArea messageBoard;

	private Exp1Parser exp1Parser = null;

	public MultiInterpretador(JTextArea textAreaMensagens) {
		super();
		messageBoard = textAreaMensagens;
	}

	public void interpretarCodigo(String sourceCode, String listaEntrada,
			int selectedIndex) {
		try {
			ByteArrayInputStream fis = new ByteArrayInputStream(sourceCode
					.getBytes());

			switch (selectedIndex) {
			case EXP1:
				interpretarExp1(fis);
				break;
			}
		} catch (Exception e1) {
			messageBoard.setText(e1.getMessage());
			e1.printStackTrace();
		} catch (Throwable t) {
			messageBoard.setText(t.getMessage());
			t.printStackTrace();
		}

	}

	private void interpretarExp1(InputStream fis) throws ParseException {
		com.resolucao1.Programa prog;
		if (exp1Parser == null) {
			exp1Parser = new Exp1Parser(fis);
		} else {
			Exp1Parser.ReInit(fis);
		}
		prog = Exp1Parser.Input();
		messageBoard.setText("sintaxe verificada com sucesso!\n");
		if (prog.checaTipo()) {
			messageBoard.append("resultado = " + prog.executar().toString());
		} else {
			messageBoard.append("erro de tipos!");
		}
	}

	
}