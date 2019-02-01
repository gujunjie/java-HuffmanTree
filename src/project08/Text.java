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
   
   //�����շ�����
   public static Node createHuffmanTree(int[] arr)
   {   
	   //���ڸ��������鴴�����ɸ�ֻ�и��ڵ�Ķ���������
	   List<Node> list=new ArrayList<>();
	   for(int value:arr)
	   {
		   list.add(new Node(value));
	   }
	   
	   while(list.size()>1)
	   {
		 //���ݶ��������ϵ�Ȩֵ����
	   Collections.sort(list);
	   System.out.println(list);
	   //ȡ����������������С������Ȩֵ���������һ���µĶ�����
	   Node leftNode=list.get(0);
	   Node rightNode=list.get(1);
	   Node parent=new Node(leftNode.getValue()+rightNode.getValue());
	   parent.setLeftTree(leftNode);
	   parent.setRightTree(rightNode);
	   list.add(parent);
	   //�������������Ƴ���С������������
	   list.remove(leftNode);
	   list.remove(rightNode);
	   }
	   
	   return list.get(0);
	   
   }
   
   //ǰ�����
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
