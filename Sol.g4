grammar Sol;

start: block*;


block: (line|function);

function: functionType=(VAR|'void') VARNAME LPARENT (VAR VARNAME (COMMA VAR VARNAME )*)? RPARENT
            line;


line: WHILE expr DO (line)                                                      #CaseWhile
    | FOR VARNAME EQUAL expr TO expr DO (line)                                  #CaseFor
    | IF expr THEN line (ELSE line)?                                            #CaseIf
    | PRINT expr SEMICON                                                        #CasePrint
    | ((VAR)? VARNAME (EQUAL expr)? (COMMA VARNAME (EQUAL expr)?)*) SEMICON     #CaseVariable
    | BREAK SEMICON                                                             #CaseBreak
    | SEMICON                                                                   #CaseEmpty
    | BEGIN (line)+ END                                                         #CaseBlock
    | RETURN (expr)? SEMICON                                                    #CaseReturn
    ;


expr : LPARENT expr RPARENT                                                     #ParenthesesExpression
     | operador=(NOT|MENOS) expr                                                #UnaryExpression
     | expr operador=(MULT|DIVISAO|MOD) expr                                    #MultDivModExpression
     | expr operador=(ADD|MENOS) expr                                           #AddSubExpression
     | expr RELACIONAL expr                                                     #ReelExpression
     | expr IDUALDADE expr                                                      #IdualExpression
     | expr ELOGICO expr                                                        #AndExpression
     | expr OULOGICO expr                                                       #OrExpression
     | STRING                                                                   #String
     | INT                                                                      #Int
     | DOUBLE                                                                   #Double
     | BOOL                                                                     #Boolean
     | VARNAME LPARENT (expr (COMMA expr)*)? RPARENT                            #Func
     | VARNAME                                                                  #Variable

     ;

RETURN: 'return';
VAR: 'int'|'real'|'string'|'bool';
IF: 'if';
ELSE: 'else';
THEN: 'then';
EQUAL: '=';
COMMA: ',';
BREAK: 'break';
WHILE: 'while';
DO: 'do';
FOR: 'for';
TO: 'to';
BEGIN: 'begin';
END: 'end';
MOD:'%';
LPARENT:'(';
RPARENT:')';
PRINT:'print';
SEMICON:';';
MULT    : '*' ;
DIVISAO : '/';
ADD     : '+' ;
MENOS   : '-' ;
INT     : [0-9]+;
DOUBLE  : INT '.' INT* ;
STRING  : '"' (~["\r\n])* '"';
BOOL    : 'true' | 'false';
WS      : [ \t\r\n]+ -> skip ;
RELACIONAL:'<' | '>' | '<=' | '>=';
IDUALDADE: '==' |'!=';
ELOGICO: 'and';
OULOGICO: 'or';
NOT:'not';
VARNAME: [a-zA-Z_]+ ([0-9]|[a-zA-Z_])*;
SL_COMMENT : '//' .*? (EOF|'\n') -> skip;
ML_COMMENT : '/*' .*? '*/' -> skip ;
