
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Feb 06 09:40:24 COT 2015
//----------------------------------------------------

package ejemplocup;

import java_cup.runtime.*;
import java.io.FileReader;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Feb 06 09:40:24 COT 2015
  */
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintactico() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\005\005\000\002\005\005" +
    "\000\002\005\005\000\002\005\005\000\002\005\005\000" +
    "\002\005\004\000\002\005\003\000\002\004\003\000\002" +
    "\004\003\000\002\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\026\000\006\012\004\013\012\001\002\000\022\004" +
    "\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6\012\ufff6" +
    "\013\ufff6\001\002\000\022\004\ufff7\005\ufff7\006\ufff7\007" +
    "\ufff7\010\ufff7\011\ufff7\012\ufff7\013\ufff7\001\002\000\010" +
    "\002\uffff\012\uffff\013\uffff\001\002\000\010\002\030\012" +
    "\004\013\012\001\002\000\022\004\016\005\013\006\021" +
    "\007\014\010\017\011\020\012\004\013\012\001\002\000" +
    "\022\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5" +
    "\012\ufff5\013\ufff5\001\002\000\022\004\ufff4\005\ufff4\006" +
    "\ufff4\007\ufff4\010\ufff4\011\ufff4\012\ufff4\013\ufff4\001\002" +
    "\000\006\012\004\013\012\001\002\000\006\012\004\013" +
    "\012\001\002\000\022\004\ufff8\005\ufff8\006\ufff8\007\ufff8" +
    "\010\ufff8\011\ufff8\012\ufff8\013\ufff8\001\002\000\010\002" +
    "\ufffe\012\ufffe\013\ufffe\001\002\000\006\012\004\013\012" +
    "\001\002\000\006\012\004\013\012\001\002\000\006\012" +
    "\004\013\012\001\002\000\022\004\ufffc\005\ufffc\006\ufffc" +
    "\007\ufffc\010\ufffc\011\ufffc\012\ufffc\013\ufffc\001\002\000" +
    "\022\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9" +
    "\012\ufff9\013\ufff9\001\002\000\022\004\ufffa\005\ufffa\006" +
    "\ufffa\007\ufffa\010\ufffa\011\ufffa\012\ufffa\013\ufffa\001\002" +
    "\000\022\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011" +
    "\ufffb\012\ufffb\013\ufffb\001\002\000\022\004\ufffd\005\ufffd" +
    "\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd\001" +
    "\002\000\010\002\001\012\001\013\001\001\002\000\004" +
    "\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\026\000\014\002\006\003\005\004\004\005\007\006" +
    "\010\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\003\026\004\004\005\007\006\010\001" +
    "\001\000\006\004\014\006\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\025\006\010\001\001\000" +
    "\006\004\024\006\010\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\004\023\006\010\001\001\000\006\004" +
    "\022\006\010\001\001\000\006\004\021\006\010\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    /* Reporte de error encontrado. */
    public void report_error(String message, Object info) {
        StringBuilder m = new StringBuilder("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {                
                m.append(" in line "+(s.left+1));
                if (s.right >= 0)
                    m.append(", column "+(s.right+1));
            }
        }
		if("#3".equals(info.toString())){
                message=("Expresión de SUMA repetida o SIN NUMERO O VARIABLE AL INICIO");
            }
        if("#2".equals(info.toString())){
                message=("Expresión SIN NUMERO O VARIABLE AL FINAL");
            }
        if("#8".equals(info.toString())){
                message=("Error en la VARIABLE");
            }
        if("#5".equals(info.toString())){
                message=("Expresión de MULTIPLICACIÓN repetida o SIN NUMERO O VARIABLE AL INICIO");
            }
        if("#4".equals(info.toString())){
                message=("Expresión de RESTA repetida o SIN NUMERO O VARIABLE AL INICIO");
            }
        if("#6".equals(info.toString())){
                message=("Expresión de DIVISIÓN repetida o SIN NUMERO O VARIABLE AL INICIO");
            }
        if("#7".equals(info.toString())){
                message=("Expresión de IGUALDAD repetida o SIN NUMERO O VARIABLE AL INICIO");
            }
        m.append(" : "+message);
        System.err.println(m);
    }

    public void report_fatal_error(String message, Object info) {
        //report_error(message, info);
        //System.exit(1);
    }



}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintactico$actions {
  private final AnalizadorSintactico parser;

  /** Constructor */
  CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // termino ::= INT 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    RESULT = e;
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("termino",4, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // variable ::= termino 
            {
              String RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    RESULT = t;
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("variable",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // variable ::= ID 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    RESULT = i;
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("variable",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= variable 
            {
              String RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    RESULT = n;
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr variable 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    if(e!=null){
				  System.out.print(e);
				  }
				  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr IGUAL variable 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    if(e!=null){
				  System.out.print(e+" ES IGUAL A "+v);
				  }else{
				  System.out.print(" ES IGUAL A "+v);}
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr DIV variable 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    if(e!=null){
				  System.out.print(e+" DIVIDIDO PARA "+v);
				  }else{
				  System.out.print(" DIVIDIDO PARA "+v);}
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr MULT variable 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    if(e!=null){
				  System.out.print(e+" MULTIPLICADO POR "+v);
				  }else{
				  System.out.print(" MULTIPLICADO POR "+v);}
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr RESTA variable 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
                    if(e!=null){
				  System.out.print(e+" MENOS "+v);
				  }else{
				  System.out.print(" MENOS "+v);}
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr SUMA variable 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
				  if(e!=null){
				  System.out.print(e+" MAS "+v);
				  }else{System.out.print(" MAS "+v);}
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr_part ::= expr PYC 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		
				  System.out.println("");
                  
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_part 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintactico$parser.done_parsing();
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_part 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
