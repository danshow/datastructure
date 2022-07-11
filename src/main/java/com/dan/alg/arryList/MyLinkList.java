package com.dan.alg.arryList;

public class MyLinkList {

    private MyLinkNode head;
    int size = 0;

    public MyLinkList() {
        head = new MyLinkNode(null, null);
    }

    public boolean add(Object e) {
        MyLinkNode newNode = new MyLinkNode(e, null);
        if (head.next == null) {
            head.next = newNode;
        } else {
            MyLinkNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        size++;
        return true;
    }

    public Object get(int idx) {
        if (idx > size) {
            throw new IndexOutOfBoundsException();
        }
        MyLinkNode newNode = head.next;
        for (int i = 0; i < idx; i++) {
            newNode = newNode.next;
        }
        return newNode.val;
    }

    public boolean remove(int idx){
        if (idx > size) {
            throw new IndexOutOfBoundsException();
        }
        MyLinkNode curr=head;
        for(int i=0;i<idx;i++){
            curr=curr.next;
        }
        MyLinkNode temp=curr.next;
        curr.next=temp.next;
        temp=null;
        size--;
        return true;
    }
    public void display() {
        MyLinkNode curr = head.next;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private static class MyLinkNode {
        Object val;
        MyLinkNode next;

        public MyLinkNode(Object val, MyLinkNode next) {
            this.val = val;
            this.next = next;
        }

        public void setNext(MyLinkNode node) {
            this.next = node;
        }

    }

    public static void main(String[] args) {
        MyLinkList linkList = new MyLinkList();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        linkList.display();

        System.out.println("get 1:" +linkList.get(1));
        linkList.remove(4);
        linkList.display();

    }


}
