/* Generated By:JavaCC: Do not edit this line. Exp1ParserConstants.java */
package com.resolucao1.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface Exp1ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 7;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 8;
  /** RegularExpression Id. */
  int TRUE = 9;
  /** RegularExpression Id. */
  int FALSE = 10;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 11;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 12;
  /** RegularExpression Id. */
  int HEX_LITERAL = 13;
  /** RegularExpression Id. */
  int OCTAL_LITERAL = 14;
  /** RegularExpression Id. */
  int STRING_LITERAL = 15;
  /** RegularExpression Id. */
  int IDENTIFIER = 16;
  /** RegularExpression Id. */
  int LETTER = 17;
  /** RegularExpression Id. */
  int DIGIT = 18;
  /** RegularExpression Id. */
  int LPAREN = 19;
  /** RegularExpression Id. */
  int RPAREN = 20;
  /** RegularExpression Id. */
  int NOT = 21;
  /** RegularExpression Id. */
  int OR = 22;
  /** RegularExpression Id. */
  int AND = 23;
  /** RegularExpression Id. */
  int CONDITIONAL = 24;
  /** RegularExpression Id. */
  int BICONDITIONAL = 25;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "<FORMAL_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "\"true\"",
    "\"false\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<STRING_LITERAL>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "\"(\"",
    "\")\"",
    "\"~\"",
    "\"|\"",
    "\"^\"",
    "\"->\"",
    "\"<->\"",
  };

}
