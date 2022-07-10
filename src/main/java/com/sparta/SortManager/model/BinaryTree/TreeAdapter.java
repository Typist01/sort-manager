package com.sparta.SortManager.model.BinaryTree;

import com.sparta.SortManager.LoggingMain;
import com.sparta.SortManager.model.Sorter;
import com.sparta.SortManager.view.Viewer;

import java.util.ArrayList;
import java.util.List;

public class TreeAdapter implements Sorter {

    public BinaryTree toTree (int[] myList){
        BinaryTree myTree = new BinaryTree(myList[0]);
            for (int i=1;i<myList.length;i++){
                try {
                    myTree.insert(myList[i]);
                } catch(Exception e){
                    e.printStackTrace();
                    LoggingMain.logger.info("error when inserting to tree");
                    }
        }
        return myTree;
    }
    public List toList(BinaryTree tree){
        ArrayList<Integer> intList = new ArrayList();
        collectNodes(tree, intList);
        return intList;
    }
    private void collectNodes(BinaryNode node, ArrayList intList){
        if (node.hasLeft())
            collectNodes(node.getLeftNode(), intList);
//        System.out.println(node.getValue());
        intList.add(node.getValue());
        if (node.hasRight())
            collectNodes(node.getRightNode(), intList);
    }

    public int[] sortArray(int[] arrayToSort) {
        Viewer viewer = new Viewer();
        BinaryTree tree = toTree(arrayToSort);
        Long startTime = System.nanoTime();
        List result = tree.toList();
        Long endTime = System.nanoTime();
        Long timeInNs = (startTime - endTime);
        viewer.printTimeTaken(timeInNs);
        int[] arr = new int[arrayToSort.length];
        for (int i=0; i<arrayToSort.length; i++){
            arr[i] = (int) result.get(i);
        }
        return arr;
    }
}
