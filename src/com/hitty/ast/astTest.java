package com.hitty.ast;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class astTest {
    public static void main(String[] args) {
        try{
            File f = new File("asset\\taskcode.task");
            InputStream is = new FileInputStream(f);

            ANTLRInputStream input = new ANTLRInputStream(is);
            taskLexer lexer = new taskLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            taskParser parser = new taskParser(tokens);
            ParseTree tree = parser.compilationUnit(); // parse

            System.out.println(tree.toStringTree());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void recusivePrintTree(ParseTree tree){

    }
}
