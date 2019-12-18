package com.hitty.ast;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class astTest {
    String filepath;
    public astTest(String s){
        this.filepath = s;
    }
    public void run(){
        try{

            File f = new File("asset\\taskcode.task");
            InputStream is = new FileInputStream(f);
            ANTLRInputStream input = new ANTLRInputStream(is);
            taskLexer lexer = new taskLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            taskParser parser = new taskParser(tokens);
            ParseTree tree = parser.compilationUnit(); // parse
            //ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            //parseTreeWalker.walk(new mTaskListener(),tree);
            MTree mTree = new MTree();
            //recusivePrintTree(tree,mTree);
            System.out.println(tree.toStringTree(parser));
            //System.out.println("Done");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /**
     * 将节点类名转换为文法中的语法非终结符名
     * */
    public static String handleClassName(String s){
        int index = s.indexOf("$");
        if(index == -1){
            // 是终结符
            return "TerminalNode";
        }
        else{
            return s.substring(index+1,s.length()-7);
        }

    }
    /**
     * 前序遍历生成的语法树，完成中间代码生成
     * */
    public static void recusivePrintTree(ParseTree tree,MTree mTree){
        //mTree.RuleName = handleClassName(tree.getClass().toString());
        mTree.RuleName = tree.getClass().toString();
        System.out.println(mTree.RuleName);
        mTree.parseTree = tree;
        if(tree.getChildCount() > 0){
            // DLR
            for(int i =0;i < tree.getChildCount();i++){
                MTree mTreeChild = new MTree();
                mTree.childNodeList.add(mTreeChild);
                mTreeChild.parentNode = mTree;
                recusivePrintTree(tree.getChild(i),mTreeChild);
            }
            genMidCode(mTree);
        }
        else{
            //Terminal symbol, add content to parentNode
            mTree.parentNode.childContent.add(mTree.content);
        }

    }

    private static void genMidCode(MTree mt) {


    }

}
