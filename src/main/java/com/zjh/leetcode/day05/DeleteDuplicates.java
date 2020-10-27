package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-21
 **/
public class DeleteDuplicates {

    public static  ListNode deleteDuplicates(ListNode head) {

        ListNode result = null;
        ListNode temp = null;
        ListNode cur=head;
        while (cur !=null){
            if(cur.next !=null && cur.val == cur.next.val){
                while(cur.next !=null && cur.val == cur.next.val){
                    cur=cur.next;
                }
                cur = cur.next;
            } else {
                ListNode listNode = new ListNode(cur.val);
                if (result== null){
                    result = listNode ;
                    temp=result;
                }else {
                    temp.next = listNode;
                    temp =listNode;
                }
                cur=cur.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        ListNode listNode = deleteDuplicates(node1);
        System.out.println(listNode);

    }

}


class ListNode {
    int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
