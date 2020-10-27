package com.zjh.leetcode.day05;

import java.util.List;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-23
 **/
public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode listNode = new ListNode(0);
        ListNode cur=listNode;

        while(l1!=null && l2!=null){
            if (l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
            }else {
                cur.next=l2;

                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next=l1!=null?l1:l2;
        return listNode.next;
    }


 /*   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        if (l1.val<=l2.val){
            ListNode index1 = l1;
            ListNode index2 = l2;

            ListNode listNode = null;
            while (index2 !=null && index1 != null){
                while(index1!=null && index1.next != null){
                    if (index1.val<=index2.val && index2.val<=index1.next.val){
                        listNode = new ListNode(index2.val);
                        listNode.next=index1.next;
                        index1.next=listNode;
                        index1=listNode;
                        break;
                    }
                    index1=index1.next;
                }
                if (index1.next!=null){
                    index2=index2.next;
                }else {
                    break;
                }
            }
            if (index2!=null){
                index1.next=index2;
            }
            return l1;
        }else {
            return mergeTwoLists(l2,l1);
        }
    }*/

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
    /*    ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next=node2;
        node2.next=node3;*/

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next=node5;
        node5.next=node6;
        ListNode listNode = mergeTwoLists(node1,node4);
        System.out.println(listNode);
    }
}
