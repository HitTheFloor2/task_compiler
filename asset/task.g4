grammar task;

@lexer::members {
  protected boolean enumIsKeyword = true;
  protected boolean assertIsKeyword = true;
}
compilationUnit 
    : packageDeclaration? importDeclaration* taskDeclaration* EOF
    ;

packageDeclaration 
    : 'package' qualifiedName ';' 
    ;

importDeclaration
    : 'import' qualifiedName ('.' '*')? ';'
    ;

qualifiedName
    : Identifier ('.' Identifier)*
    ;

taskDeclaration 
    : 'task' Identifier taskBody
    ;

taskBody
    : '{' localTaskDeclaration* localVarDeclarations functionDeclaration* '}'
    ;

localTaskDeclaration
    : 'task' Identifier ';'
    ;

localVarDeclarations
    : localVarDeclaration*
    ;

localVarDeclaration
    : (Type | qualifiedName) localVarDeclarationSingle (',' localVarDeclarationSingle)* ';'
    ;

localVarDeclarationSingle
    : Identifier ('[' Int? ']')? ('=' varInitializer)?
    ;

varInitializer
    : expression
    ;

arrayInitializer
    : '{' (varInitializer (',' varInitializer)* )? '}'
    ;


functionDeclaration
    : functionModifier? (Type|qualifiedName)? Identifier functionParameters functionBody
    ; 

functionModifier
    : 'shared' | 'sync'
    ;
functionParameters
    : '(' (Type|qualifiedName) Identifier (',' (Type|qualifiedName) Identifier)* ')'
    | '()'
    ;
functionCallParameters
    : '(' expression (',' expression)* ')'
    | '()'
    ;

functionBody
    : blockCode
    ;
blockCode
    : '{' blockStatement* '}'
    ; 

blockStatement
    : statement
    ;
statement
    : blockCode
    | localVarDeclaration
    | ifStatement
    | forStatement
    | assignStatement
    | whileStatement
    | breakStatement
    | continueStatement
    | returnStatement
    | invokeStatement
    ;
ifStatement
    : 'if' parExpression statement ('else' statement)?
    ;
whileStatement
    : 'while' parExpression statement
    ;
breakStatement
    : 'break' ';'
    ;
continueStatement
    : 'continue' ';'
    ;
forStatement
    : 'for' '(' forControl ')' statement
    ;
forControl
    : forInit? ';' expression? ';' forUpdate?
    ;
forInit
    : expressionList
    ;
forUpdate
    : expressionList
    ;
localVar
    : Identifier ('[' localVar ']')? functionCallParameters? ('.' localVar)*
    ;
assign 
    : localVar '=' expression 
    ;
assignStatement
    : assign ';'
    ;
returnStatement
    : 'return' expression ';'
    ;
invokeStatement
    : expression functionCallParameters';'
    ;
parExpression
    : '(' expression ')'
    ;
expressionList
    : expression (',' expression)*
    ;
expression
    : expression operator2 expression
    | expression operator1
    | operator1 expression
    | expression '[' expression ']'
    | '(' expression ')' 
    | localVar 
    | assign
    | Char
    | Int
    | String
    ;

operator1
    : '++' | '--'
    ;

operator2
    : '+' | '-' | '*' | '/' | '%' | '<' | '>' | '||' | '&&' | '==' | '!='
    ;

Type
    : 'int' 
    | 'char' 
    | 'float'
    | 'string'
    ;

Identifier : Letter (Letter|Int)*;
Letter : [a-zA-Z_];
Int : [0-9]+;
Char : '\'' Letter '\'';
WS: [ \t\r\n]+ -> skip ;
String : '"' (Letter|Int)* '"';

