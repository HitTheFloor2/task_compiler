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



            MTree mTree = new MTree();
            recusivePrintTree(tree,mTree);
            System.out.println(tree.toStringTree(parser));

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static String handleClassName(String s){
        return null;
    }
    public static void recusivePrintTree(ParseTree tree,MTree mTree){
        mTree.RuleName = tree.getClass().toString();
        mTree.parseTree = tree;
        if(tree.getChildCount() >= 0){
            for(int i =0;i < tree.getChildCount();i++){
                MTree mTreeChild = new MTree();
                mTree.childNodeList.add(mTreeChild);
                mTreeChild.parentNode = mTree;
                recusivePrintTree(tree.getChild(i),mTreeChild);
            }
        }
        //System.out.println(tree.toString());
        //System.out.println(tree.getClass().toString());
    }
}
