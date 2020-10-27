package com.zjh.leetcode.day05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jinheng.zhao
 * @create: 2020-09-29
 **/
public class MergeKLists {
/*
   分治算法
public static ListNode mergeKLists(ListNode[] lists) {
        if (lists==null){
            return null;
        }
        ListNode result= lists[0];
        for(int i=1;i<lists.length;i++){
            result=mergeKLists(result,lists[i]);
        }
        return result;
    }*/
/*
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0){
            return null;
        }
        int start=0;
        int end=lists.length-1;
        ListNode result = lists[0];
        ListNode result1 = lists[lists.length-1];
        while(start<end){
            if ((start+1)<(end-1)){
                result = mergeKLists(result,lists[start+1]);
                result1 = mergeKLists(lists[end-1],result1);
            }else if ((start+1) == (end-1)){
                result = mergeKLists(result,lists[start+1]);
            }
            start++;
            end--;
        }
        return mergeKLists(result,result1);
    }*/


    public static ListNode mergeKLists(ListNode[] lists) {
        return merge(lists,0,lists.length-1);
    }

    private static ListNode merge(ListNode[] lists, int start, int end) {
        if (start==end){
            return lists[start];
        }
        if (start>end){
            return null;
        }
        int mid = (start+end)>>1;
        return mergeKLists(merge(lists,start,mid),merge(lists,mid+1,end));
    }

    public static ListNode mergeKLists(ListNode node1,ListNode node2){
        ListNode result = new ListNode(0);
        ListNode cur = result;
        while (node1!=null && node2!=null){
            if (node1.val<node2.val){
                 cur.next=node1;
                 node1=node1.next;
                 cur=cur.next;
            }else {
                cur.next=node2;
                node2=node2.next;
                cur=cur.next;
            }
        }

        cur.next = node1!=null?node1:node2;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next=node5;
        node5.next=node6;

        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(6);
        node7.next=node8;

        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);
        node9.next=node10;

        ListNode[] objects = {node1,node4,node7,node9};
        ListNode listNode = mergeKLists(objects);
        System.out.println(listNode);
    }
}
