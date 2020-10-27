package com.zjh.leetcode.day01;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-17
 **/
public class Test {
    /**
    * 运行成功: 测试用例:[2,4,3] [5,6,4] 测试结果:[8,0,7] 期望结果:[7,0,8] stdout:
    **/

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String sum1="";
        String sum2="";
        String v1 = recur(l1,sum1);
        String v2 = recur(l2,sum2);

        String total = "";
        if (v1.length()>v2.length()){
            total = addTwosum(v1,v2);
        }else {
            total = addTwosum(v2,v1);
        }
        char[] chars = String.valueOf(total).toCharArray();
        return getListNode(chars);
    }

    public static String recur(ListNode l1, String sum){
        if (l1.next == null){
            return l1.val+sum;
        }else {
            return recur(l1.next,l1.val+sum);
        }
    }

    public static void main(String[] args) {
        int [] arrs1 =  {9};
        int [] arrs2 =  {1,9,9,8,9,9,9};
        ListNode listNode = getListNode(arrs1);
        ListNode listNode1 = getListNode(arrs2);
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

    public static ListNode getListNode(char [] arrs){
        ListNode headNode = null;

        for(int i=arrs.length-1;i>=0;i--){
            if (headNode == null){
                System.out.println(String.valueOf(arrs[i]));
                headNode = new ListNode(Integer.valueOf(String.valueOf(arrs[i])));
            } else {
                ListNode listNode = recur(headNode);
                System.out.println(String.valueOf(arrs[i]));
                listNode.next = new ListNode(Integer.valueOf(String.valueOf(arrs[i])));
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

    public static String addTwosum(String v1,String v2){
        char[] chars1 = v1.toCharArray();
        char[] chars2 = v2.toCharArray();
        int y=0;
        int v1length = v2.length()-1;
        String total = "";
        for(int i=chars1.length-1;i>=0;i--,v1length--){
            if (v1length>=0){
                System.out.println(Integer.valueOf(String.valueOf(chars1[i])));
                System.out.println(Integer.valueOf(String.valueOf(chars2[v1length])));
                int value = Integer.valueOf(String.valueOf(chars1[i])) + Integer.valueOf(String.valueOf(chars2[v1length])) + y;
                if (i == 0){
                    total = value+total;
                }else if(value>10){
                    y = value/10;
                    total = (value%10) +total;
                } else if (value == 10){
                    y = value/10;
                    total = "0" +total;
                } else {
                    y=0;
                    total = value+total;
                }
            }else {
                int value = Integer.valueOf(String.valueOf(chars1[i])) + y;
                if (i == 0){
                    total = value+total;
                }else if(value>10){
                    y = value/10;
                    total = (value%10) +total;
                } else if (value == 10){
                    y = value/10;
                    total = "0" +total;
                } else {
                    y=0;
                    total = value+total;
                }
            }

        }
        return total;
    }

}
