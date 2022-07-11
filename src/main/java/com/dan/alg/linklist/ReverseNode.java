package com.dan.alg.linklist;

public class ReverseNode {
    public static ListNode reverseList(ListNode head) {
        ListNode newNode = null;
        if (head == null) {
            return null;
        }
        while(head!=null){
            ListNode temp=newNode;
            newNode=new ListNode(head.val);
            newNode.next=temp;

            head=head.next;
        }
        return newNode;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        ListNode.printList(reverseList(list1));

    }
}
