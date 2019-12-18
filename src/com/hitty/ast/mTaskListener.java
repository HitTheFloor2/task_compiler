package com.hitty.ast;

import org.antlr.v4.runtime.tree.ParseTreeListener;

public class mTaskListener extends taskBaseListener {
    @Override
    public void enterTaskDeclaration(taskParser.TaskDeclarationContext ctx) {
        System.out.println(ctx.toString());
    }
}
