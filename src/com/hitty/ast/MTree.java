package com.hitty.ast;

import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MTree {
    public ArrayList<MTree> childNodeList;
    public MTree parentNode;
    public ParseTree parseTree;
    public String RuleName;
    public String string_content;
    public int int_content;
    public char char_content;
    public MTree(){
        this.childNodeList = new ArrayList<MTree>();
        this.parentNode = null;
        this.parseTree = null;
        this.RuleName = "none";
    }


}
