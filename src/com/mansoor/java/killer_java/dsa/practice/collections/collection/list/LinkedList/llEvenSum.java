package dsa.practice.collections.collection.list.LinkedList;

import java.util.LinkedList;

public class llEvenSum {

    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        ll.push(4);
        ll.push(5);
        ll.push(0);
        ll.push(9);
        ll.push(8);
        ll.push(10);

        System.out.println(ll);
          int sum=0;
        for (int i = 0; i < ll.size(); i++) {
            sum+=ll.get(i);
        }
        System.out.println(sum);

    }
}
