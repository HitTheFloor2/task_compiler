package com.hitty.ast;

import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MTree {
    public ArrayList<MTree> childNodeList;
    public MTree parentNode;
    public ParseTree parseTree;
    public String RuleName = "";
    public String content = "";
    public ArrayList<String> childContent;
    public boolean isDone = false;
    public MTree(){
        this.childNodeList = new ArrayList<MTree>();
        this.childContent = new ArrayList<String>();
        this.parentNode = null;
        this.parseTree = null;
        this.RuleName = "none";
    }


}
