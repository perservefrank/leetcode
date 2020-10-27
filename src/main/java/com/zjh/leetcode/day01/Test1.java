package com.zjh.leetcode.day01;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-17
 **/
public class Test1 {
    /**
    * 运行成功: 测试用例:[2,4,3] [5,6,4] 测试结果:[8,0,7] 期望结果:[7,0,8] stdout:
    **/

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);

        ListNode pre = listNode;
        int a = 0;
        while (l1 != null || l2 != null){
            int x = l1 == null? 0: l1.val;
            int y = l2 == null? 0: l2.val;
            int sum = x + y + a;

            a = sum/10;
            sum= sum%10;
            pre = pre.next = new ListNode(sum);
           if (l1 != null){
               l1= l1.next;
           }
           if (l2 != null){
                l2= l2.next;
           }
        }
        if (a==1 ){
            pre.next = new ListNode(a);
        }
        return listNode;
    }

   

    public static void main(String[] args) {
        int [] arrs1 =  {9};
        int [] arrs2 =  {1,9,9,8,9,9,9};
        ListNode listNode = getListNode(arrs1);
        ListNode listNode1 = getListNode(arrs2);

        System.out.println(10/10);
        System.out.println(10%10);
        System.out.println(11/10);
        System.out.println(11%10);
        ListNode listNode2 = addTwoNumbers(listNode, listNode1);
    }

    public static ListNode getListNode(int [] arrs){
        ListNode headNode = null;

        for(int i=0,length=arrs.length;i<length;i++){
            if (headNode == null){
                headNode = new ListNode(arrs[i]);
            } else {
                ListNode listNode = recur(headNode);
                listNode.next = new ListNode(arrs[i]);
            }
        }
        return headNode;
    }
    

    public static ListNode recur(ListNode l1){
        if (l1.next == null){
            return l1;
        }else {
            return recur(l1.next);
        }
    }

}
