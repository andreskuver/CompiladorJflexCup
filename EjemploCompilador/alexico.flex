
/* --------------------------Codigo de Usuario----------------------- */
package ejemplocup;

import java_cup.runtime.*;
import java.io.Reader;
      
%% //inicio de opciones
   
/* ------ Seccion de opciones y declaraciones de JFlex -------------- */  
   
/* 
    Cambiamos el nombre de la clase del analizador a Lexer
*/
%class AnalizadorLexico

/*
    Activar el contador de lineas, variable yyline
    Activar el contador de columna, variable yycolumn
*/
%line
%column
    
/* 
   Activamos la compatibilidad con Java CUP para analizadores
   sintacticos(parser)
*/
%cup
   
/*
    Declaraciones

    El codigo entre %{  y %} sera copiado integramente en el 
    analizador generado.
*/
%{
    /*  Generamos un java_cup.Symbol para guardar el tipo de token 
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Generamos un Symbol para el tipo de token encontrado 
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
   

Salto = \r|\n|\r\n

Espacio     = {Salto} | [ \t\f]
L = [a-zA-Z_]
D = 0 | [1-9][0-9]*


%% //fin de opciones
/* -------------------- Seccion de reglas lexicas ------------------ */
   

   
<YYINITIAL> {
   
";" {return symbol(sym.PYC);}
"=" {return symbol(sym.IGUAL);}
"+" {return symbol(sym.SUMA);}
"*" {return symbol(sym.MULT);}
"-" {return symbol(sym.RESTA);}
"/" {return symbol(sym.DIV);}
{D} {return symbol(sym.INT, new String(yytext()));}
{L}({L}|{D})* {return symbol(sym.ID, new String(yytext()));}
{Espacio} { /* ignora el espacio */ }
}
[^]                    { throw new Error("Caracter ilegal <"+yytext()+">"); }
