package com.zjh.leetcode.day05;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-28
 **/
public class SwapPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode result = new ListNode(0);
        ListNode resultIndex= result;
        ListNode index = head;
        while(index!=null && index.next != null){
            ListNode next = index.next;
            index.next=next.next;
            next.next=index;
            resultIndex.next=next;
            resultIndex=resultIndex.next.next;
            index = index.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(3);
        //ListNode node7 = new ListNode(4);
        node4.next=node5;
        node5.next=node6;
        //node6.next=node7;
        System.out.println(swapPairs(node4));
    }
}
