import java.util.HashMap;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; head!=null||i>10000; i++) {
            if (map.containsKey("a")) {
                map.put("a"+i, i);
            }
            if (head==null) {
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
*/
/*
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; head!=null||i<10000; i++) {
            if (head.val==null) {
                return false;
            }
            head.val=null;
            head=head.next;
        }
        return true;
    }
}
 */
//aparentemente no podemos verificar que el numero de repeticiones sea mayor que la reestriccion limitante del tamaño de los nodos
//el tamaño maximo de la lista ligada es de 0 a 10^4
//tampoco podemos asignar un valor mayor a 10^5 o menor a -10^5 a pesar de que el valor de un int puede ir mas alla

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; head!=null||i<10000; i++) {
            if (head.val==Integer.MAX_VALUE) {
                return true;
            }
            head.val=Integer.MAX_VALUE;
            head=head.next;
        }
        return false;
    }
}

//xd
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        while(head!=null ) {
            if (head.val==Integer.MAX_VALUE) {
                return true;
            }
            head.val=Integer.MAX_VALUE;
            head=head.next;
        }
        return false;
    }
}