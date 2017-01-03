grammar ExpertRule;

goal : input var? output ifStatement* ;

input : INPUT '(' varDeclare+ ')' ;
var : VAR '(' STRING+ ')' ;
output : OUTPUT '(' STRING+ ')' ;
ifStatement: IF exp THEN assignExp+ ;

number : NUMBER ;

varDeclare: id=STRING IS 'number' (FROM left=number)? (TO right=number)? #numDeclare
    | id=STRING IS 'string' OF '(' STRING+ ')' #strDeclare
;

val: num=number | str=STRING ;

assignOp : IS | '=' ;
assignExp : STRING assignOp val ;

op : assignOp | '<' | '<=' | '>' | '>=' ;

exp : STRING op val
    | exp OR exp
    | exp AND exp
;

INPUT : 'INPUT' | 'input' ;
OUTPUT : 'OUTPUT' | 'output' ;
IF : 'IF' | 'if' ;
IS : 'IS' | 'is' ;
OF : 'OF' | 'of' ;
FROM : 'FROM' | 'from' ;
TO : 'TO' | 'to' ;
THEN : 'THEN' | 'then' ;
AND : 'AND' | 'and';
OR : 'OR' | 'or' ;
VAR : 'VAR' | 'var' ;

COMMENT : '//'~[\r\n]* -> skip;
//RULEID : 'Rule' ':' [0-9]+ -> skip;

NUMBER : [+-]?[0-9]+([.][0-9]*)? ;
STRING : '"'(.)*?'"' | '\''(.)*?'\'' ;

WS : [ \t\r\n]+ -> skip;