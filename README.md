# Compiladores
School project, sol/tasm compiler

Sol  
Sol.g4 grammar  
Peculiaridades de sol.  
Tipos de variáveis  
Int, real, bool e string.  
Declaração de variáveis  
Int x = 2;  
Formatação de if  
If {condinção} then  
{bloco}  
Else then  
{bloco}  
Formatação while  
While {condição} do  
{bloco}  
Formatação for  
For {variável} = {expressão} to {expressão} do  
{bloco}  
Declaração de funções  
{tipo} {nome da função}  ( {tipo de variável} , {nome da variável} )  
{bloco}  


Para fazer esta gramática dividiu-se o trabalho em 2 partes. A primeira que guarda todas as expressões lógicas (expr) e outra onde estão as declarações de programação (while, for, if, print, variáveis, breaks, returns e blocos). Para além também é utilizado o sistema de tokens que irão a ajudar a fazer as regras gramaticais.  


Código  
solCompiler  
Responsável por compilar um ficheiro .sol para .tasm e .tbc.  
.tasm – serve para compilar no compilador tAssembler (que o transforma em .tbc).  
.tbc – pronto para ser corrido pela tVM (virtual machine).  
 Este compilador é feito com a ajuda go antlr, utilizando o método visitor.  
Ao executar este código é necessário dar um argumento (nome do ficheiro a ser compilador) e poderá ser dado um segundo argumento -tasm para pedir que seja compilado também o ficheiro .tasm.   
Exemplo de compilação:  
In1.sol			Retorna - in1.tbc  
In2.sol	 - tasm		Retorna – in2.tbc e in2.tasm  
Para fazer esta compilação ele percorre o ficheiro SolCompilerMyVisitor, que retornará uma ArrayList de bytecodes, uma ArrayList constantPool. Após receber estas variáveis ele entre nas duas funções “writeTasm” e “writeTbc”.  
“WriteTasm”   
Cria um ficheiro com o mesmo nome do ficheiro, a diferença é que a extensão passa a ser .tasm (na mesma pasta). Vai percorrer todos os bytecodes e vai guardá-los de modo a que se transforme num ficheiro .tasm. Para isso fazemos com que cada linha tenha uma label, neste caso damos o nome de “L” + número da linha. Ter em atenção que existem OpCodes que levam mais de um argumento, no caso são os seguintes: iconst, dconst, sconst, jump, jumpf, jumpt, call, gload, galloc, gstore, lalloc, laload, lstore. Uma vez que isto acontece é preciso haver uma verificação, enquanto estamos a correr os bytecodes, para caso apanhemos um destes lermos um bytecode a mais, que irá pertencer à mesma linha.  







“WriteTbc”  
Para este ficheiro já não é preciso ter o mesmo cuidado, uma vez que vamos guardar em bytecodes, no entanto temos que guardar a constant pool (é onde será guardado as variáveis double e string). Exemplo  
dconst 2.23;  
Na realidade é   
Constant pool  
0: 2.23;  
dconst 0;
Para fazermos isso, iremos verificar inicialmente se existem doubles, ou string no nosso código sol, caso hajam iremos acrescentar um identificador no inicio do ficheiro .tbc, que será o OpCode da constantPool e a partir daí iremos começar a guardar a constantPool, para cada variável guardada, iremos inicialmente guardar se é double, ou String e para o caso das string ainda iremos guardar inicialmente um inteiro, que irá determinar o tamanho da string guardada. Após termos lido todas as variáveis da constantPool, volta-se a guarda o identificador da constantPool. Por fim é só ler os bytecodes normalmente, não precisando ter cuidado com as variáveis abordadas no “writeTasm”.
