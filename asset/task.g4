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
    : '(' (Type|qualifiedName) Identifier (',' (Type|qualifiedName) Identifier)* ')'    # functionParameters2exist
    | '()'      # functionParameters2NotExist
    ;
functionCallParameters
    : '(' expression (',' expression)* ')'  # functionCallParameters2exist
    | '()'  # functionCallParameters2NotExist
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
    : blockCode             # statement2blockCode
    | localVarDeclaration   # statement2localTaskDeclaration
    | ifStatement           # statement2ifStatement
    | forStatement          # statement2forStatement
    | assignStatement       # statement2assignStatement
    | whileStatement        # statement2whileStatement
    | breakStatement        # statement2breakStatement
    | continueStatement     # statement2continueStatement
    | returnStatement       # statement2returnStatement
    | invokeStatement       # statement2invokeStatement
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
    : expression operator2 expression       # expOp2exp
    | expression operator1                  # expOp1
    | operator1 expression                  # Op1exp
    | expression '[' expression ']'         # expressions
    | '(' expression ')'                    # expressionWithParentheses
    | localVar                              # expression2localVar
    | assign                                # expression2assign
    | Char                                  # expression2Char
    | Int                                   # expression2Int
    | String                                # expression2String
    ;

operator1
    : '++' | '--'
    ;

operator2
    : '+' | '-' | '*' | '/' | '%' | '<' | '>' | '||' | '&&' | '==' | '!='
    ;

Type
    : 'Int'
    | 'Char'
    | 'float'
    | 'String'
    ;

Identifier : Letter (Letter|Int)*;
Letter : [a-zA-Z_];
Int : [0-9]+;
Char : '\'' Letter '\'';
WS: [ \t\r\n]+ -> skip ;
String : '"' (Letter|Int)* '"';

