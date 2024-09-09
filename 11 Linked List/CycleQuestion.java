public class CycleQuestion {
    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head == null){
            return head;
        }
        ListNode temp = head;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == temp.val){
                head = head.next;
            }
        }

        return temp;
    }

    // https://leetcode.com/problems/linked-list-cycle
    // Amazon and Microsoft
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        // Find the start node.
        ListNode f = head;
        ListNode s = head;

        while(length > 0){
            s = s.next;
            length--;
        }

        // Keep moving both forward and they will meet at cycle start;
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }

        return ans;
    }

    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        //skip the first left - 1 node;
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            previous = current;
            current = current.next;
        }

        ListNode last = previous;
        ListNode newEnd = current;

        //Reverse between left & right;
        ListNode next = current.next;
        for (int i = 0; current != null && i < right -left + 1; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if(last != null){
            last.next = previous;
        }else {
            head = previous;
        }
        newEnd.next = current;
        return head;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        // Compare both the halves
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;

        //rearrange
        while(headFirst != null && headSecond != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        if(headFirst != null){
            headFirst.next = null;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if(k == 1 || head == null){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        int remaininglength = listLength(head);

        while(remaininglength >= k){

            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;

            for(int i = 0; (current != null) && i < k; i++){
                current.next = prev;
                prev = current;
                current = next;
                next = (next != null) ? next.next : next;
            }

            if(last == null){
                head = prev;
            } else{
                last.next = prev;
            }

            newEnd.next = current;
            prev = newEnd;

            remaininglength = remaininglength - k;
        }
        return head;
    }

    //finding the length of the List
    public int listLength(ListNode head){
        if(head == null){
            return 0;
        }

        ListNode temp = head;
        int length = 0;

        while(temp != null){
            length += 1;
            temp = temp.next;
        }
        return length;
    }

    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    // FaceBook, Twitter, Google: https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

//    public void main(String[] args) {
//        ListNode head = new ListNode();
//        head.
//    }
}
