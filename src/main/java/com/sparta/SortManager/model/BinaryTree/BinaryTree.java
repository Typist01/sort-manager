package com.sparta.SortManager.model.BinaryTree;

import com.sparta.SortManager.LoggingMain;
import java.util.List;

public class BinaryTree extends BinaryNode {
    private BinaryNode currentNode;
    private int nodeCount;


    private TreeAdapter adapter = new TreeAdapter();
    public BinaryTree(int rootVal) {
        super(rootVal);
        nodeCount++;
    }
    public BinaryTree(int[] list){
        super(list[0]);
        nodeCount++;
        for (int i=1; i<list.length; i++){
            try{
                this.insert(list[i]);
            } catch(DuplicateValueException e){
                LoggingMain.logger.info("Duplicate value being inserted to tree");
            } catch( Exception e){
                LoggingMain.logger.info("Exception when inserting value to tree");
            }
        }
    }
    public int getNodeCount(){
        return nodeCount;
    }
    public int insert(int val) throws Exception{
        this.currentNode = this;
        int result = this.add(val);
        if (result == 1)
            this.nodeCount++;
        return result;
    }
    // add a value to the tree, request is passed in from the insert method
    private int add(int val) throws DuplicateValueException {
        if (val==this.currentNode.getValue()){
            throw new DuplicateValueException("Value already in the tree");
        }else if (val < this.currentNode.getValue()) {
            if (!this.currentNode.hasLeft()) {
                this.currentNode.createLeftNode(val);
                return 1;
            } else {
                this.currentNode = this.currentNode.getLeftNode();
                return add(val);
            }
        } else { //val is greater so go right
            if (!this.currentNode.hasRight()) {
                this.currentNode.createRightNode(val);
                return 1;
            } else {
                this.currentNode = this.currentNode.getRightNode();
                return add(val);
            }
        }
    }
    public List toList(){
        return adapter.toList(this);
    }
}
