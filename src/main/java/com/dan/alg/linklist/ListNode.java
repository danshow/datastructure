package com.dan.alg.linklist;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printList(ListNode list) {
        StringBuffer sb = new StringBuffer();
        ListNode head = list;
        if (head == null) {
            return;
        }
        while (head.next != null) {
            sb.append(head.val + ", ");
            head = head.next;
        }
        sb.append(head.val);
        System.out.println(sb.toString());

    }
}
