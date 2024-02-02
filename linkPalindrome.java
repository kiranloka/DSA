/**
 * linkPalindrome
 */

class LinkNode {
  int data;
  LinkNode next;

  LinkNode() {

  }

  LinkNode(int data) {
    this.data = data;
  }

  LinkNode(int data, LinkNode next) {
    this.data = data;
    this.next = null;
  }
}

public class linkPalindrome {
  public boolean isPalindrome(LinkNode head) {
    if (head == null || head.next == null) {
      return true;
    }

    LinkNode slow = head;
    LinkNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    LinkNode secondHalf = reverseNode(slow.next);

    LinkNode firstHalf = head;
    while (secondHalf != null) {
      if (firstHalf.data != secondHalf.data) {
        return false;

      }
      firstHalf = firstHalf.next;
      secondHalf = secondHalf.next;
    }

    return true;
  }

  public LinkNode reverseNode(LinkNode head) {
    LinkNode prev = null;
    LinkNode current = head;

    while (current != null) {
      LinkNode tempNext = current.next;
      current.next = prev;
      prev = current;
      current = tempNext;
    }
    return prev;
  }

  public static void main(String[] args) {

    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(2);
    head.next.next.next.next = new LinkNode(1);

    linkPalindrome solution = new linkPalindrome();
    boolean isPalindrome = solution.isPalindrome(head);
    System.out.println("Is the linked list a palindrome? " + isPalindrome);

  }
}
