grammar Tasm;

start : (intOperators | doubleOperators | stringOperators | booleanOperators | globalOperators | jumpOperators | functionOperators | endOperator)*;

intOperators
    : (intSimpleOperators | intSimpleOperatorsAdd1 | intSimpleOperatorsRemove1 | intCompare);


intCompare
    : LABEL_IDENTIFIER? (operator='ieq' | operator='ineq' | operator='ilt' | operator='ileq');


intSimpleOperators
   : LABEL_IDENTIFIER? operator='iuminus'
   ;

intSimpleOperatorsAdd1
   : LABEL_IDENTIFIER? operator='iconst' number=INT
   ;
intSimpleOperatorsRemove1
   : LABEL_IDENTIFIER? (operator='iadd'
   | operator='isub'
   | operator='imult'
   | operator='idiv'
   | operator='imod'
   | operator='itod'
   | operator='itos'
   | operator='iprint')
   ;


doubleOperators
    : (doubleSimpleOperators | doubleSimpleOperatorsAdd1 | doubleSimpleOperatorsRemove1 | doubleCompare);




doubleSimpleOperators
   : LABEL_IDENTIFIER? operator='duminus'
   ;

doubleSimpleOperatorsAdd1
   : LABEL_IDENTIFIER? operator='dconst' number=(DOUBLE|INT)
   ;

doubleSimpleOperatorsRemove1
   : LABEL_IDENTIFIER? (operator='dadd'
   | operator='dsub'
   | operator='dmult'
   | operator='ddiv'
   | operator='dprint'
   | operator='dtos')
   ;

doubleCompare
    : LABEL_IDENTIFIER? (operator='deq' | operator='dneq' | operator='dlt' | operator='dleq');


stringOperators
    : (stringSimpleOperatorsAdd1 | stringSimpleOperatorsRemove1 | stringCompare);



stringSimpleOperatorsAdd1
    : LABEL_IDENTIFIER? operator='sconst'  WORD
    ;





stringSimpleOperatorsRemove1
   : LABEL_IDENTIFIER? (operator='sadd'
   | operator='sprint')
   ;

stringCompare
    : LABEL_IDENTIFIER? (operator='seq' | operator='sneq');



booleanOperators
    : (booleanSimpleOperators | booleanSimpleOperatorsAdd1 | booleanSimpleOperatorsRemove1);


booleanSimpleOperators
   : LABEL_IDENTIFIER? operator='not'
   ;

booleanSimpleOperatorsAdd1
    : LABEL_IDENTIFIER? (operator='tconst'
    | operator='fconst')
    ;


booleanSimpleOperatorsRemove1
   : LABEL_IDENTIFIER? (operator='bprint'
   | operator='beq'
   | operator='bneq'
   | operator='and'
   | operator='or'
   | operator='btos')
   ;

globalOperators
    : LABEL_IDENTIFIER? (operator='galloc' number=INT
    | operator='gload' number=INT
    | operator='gstore' number=INT)
    ;


jumpOperators
    : LABEL_IDENTIFIER? (operator='jump'
    | operator='jumpt'
    | operator='jumpf' ) (LABEL_TO_JUMP|INT)+
    ;

functionOperators
    : LABEL_IDENTIFIER? (operator='lalloc' number=INT
    | operator='lstore' negative='-'? number=INT
    | operator='lload'  negative='-'? number=INT
    | operator='pop' number=INT
    | operator='ret' number=INT
    | operator='retval' number=INT
    | operator='call' (LABEL_TO_JUMP|INT)+)
    ;


endOperator : LABEL_IDENTIFIER? operator='halt';


LABEL_TO_JUMP: [a-zA-Z_]+ ([0-9]|[a-zA-Z_])*;
LABEL_IDENTIFIER: [a-zA-Z_]+ (([0-9]|[a-zA-Z_]) |  ' ' | ',')* ' '? ':' ;
WS      : [ \t\r\n]+ -> skip ;
WORD  : '"' (~["\r\n])* '"';
INT     : [0-9]+;
DOUBLE : [0-9]+ | [0-9]+ '.' [0-9]* ;
PONTO : '.' ;
LINKEBREAKER: '\r'?'\n';


