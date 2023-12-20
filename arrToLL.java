import java.util.Scanner;

class ListNodee {
    int data;
    ListNode next;

    public ListNodee(int data) {
        this.data = data;
        this.next = null;
    }
}

public class arrToLL {

    // Method to convert an array to a linked list
    public static ListNode arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            current.next = newNode;
            current = newNode;
        }

        return head;
    }

    // Method to print the linked list with arrow marks
    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        ListNode head = arrayToLinkedList(arr);

        System.out.println("Linked List created from the array:");
        printLinkedList(head);
    }
}
