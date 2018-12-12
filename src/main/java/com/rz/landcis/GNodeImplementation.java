package com.rz.landcis;

public class GNodeImplementation implements GNode {
    private String name;
    GNode[] children = new GNode[0];

    public GNodeImplementation() {
    }

    public GNodeImplementation(String name, GNode[] children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public GNode[] getChildren() {
        return children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChildren(GNode[] children) {
        this.children = children;
    }
}
