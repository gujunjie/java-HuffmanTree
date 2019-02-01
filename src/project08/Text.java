package project08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Text {
   public static void main(String[] args) {
	   int[] arr={54,32,6,42,9,23,5,13};
	   
	   Node node=createHuffmanTree(arr);
	   System.out.println(node);
	   frontShow(node);
   }
   
   //创建赫夫曼树
   public static Node createHuffmanTree(int[] arr)
   {   
	   //对于给定的数组创建若干个只有根节点的二叉树集合
	   List<Node> list=new ArrayList<>();
	   for(int value:arr)
	   {
		   list.add(new Node(value));
	   }
	   
	   while(list.size()>1)
	   {
		 //根据二叉树集合的权值排序
	   Collections.sort(list);
	   System.out.println(list);
	   //取出二叉树集合中最小的两个权值二叉树组成一个新的二叉树
	   Node leftNode=list.get(0);
	   Node rightNode=list.get(1);
	   Node parent=new Node(leftNode.getValue()+rightNode.getValue());
	   parent.setLeftTree(leftNode);
	   parent.setRightTree(rightNode);
	   list.add(parent);
	   //二叉树集合中移除最小的两个二叉树
	   list.remove(leftNode);
	   list.remove(rightNode);
	   }
	   
	   return list.get(0);
	   
   }
   
   //前序遍历
   public static void frontShow(Node root)
   {
	   System.out.print(root.getValue()+" ");
	   if(root.getLeftTree()!=null)
	   {
		   frontShow(root.getLeftTree());
	   }
	   if(root.getRightTree()!=null)
	   {
		   frontShow(root.getRightTree());
	   }
   }
   
   
}
