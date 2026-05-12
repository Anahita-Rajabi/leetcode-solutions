/**
 * @author Anahita Rajabi
 * @date May12, 2026
 *
 * This program merges two sorted linked lists into one sorted list.
 * A recursive method is used to compare nodes from both listsss.
 *
 * If one list is empty, the other list returned.
 * The smaller node is chosen first,
 * then the method calls itself again for the next nodes.
 */

class listSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        //if one list is empty
        if (list1== null) {
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        //choose smaller value
        if (list1.val<list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}