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
    :   'import' qualifiedName ('.' '*')? ';'
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
    ;

taskDeclaration 
    : 'task' Identifier taskBody
    ;

taskBody
    : '{' localVarDeclarations functionDeclaration* '}'
    ;
localVarDeclarations
    : localVarDeclaration*
    ;

localVarDeclaration
    : Type localVarDeclarationSingle (',' localVarDeclarationSingle)* ';'
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
    : functionModifier? Type? Identifier functionParameters functionBody
    ;

functionModifier
    : 'shared' | 'sync'
    ;
functionParameters
    : '(' Type Identifier (',' Type Identifier)* ')'
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
assign
    : qualifiedName '=' expression
    ;
assignStatement
    : assign ';'
    ;
returnStatement
    : 'return' expression ';'
    ;
parExpression
    : '(' expression ')'
    ;
expressionList
    : expression (',' expression)*
    ;
expression
    : expression operator2 expression
    | expression '[' expression ']'
    | '(' expression ')'
    | qualifiedName functionCallParameters?
    | assign
    | Char
    | Int
    | String
    ;


operator2
    : '+' | '-' | '*' | '/' | '%' | '<' | '>' | '||' | '&&' | '==' | '!='
    ;

Type
    : 'int'
    | 'char'
    | 'float'
    | 'task'
    ;

Identifier : Letter (Letter|Int)*;
Letter : [a-zA-Z_];
Int : [0-9]+;
Char : '\'' Letter '\'';
WS: [ \t\r\n]+ -> skip ;
String : '"' (Letter|Int)* '"';

