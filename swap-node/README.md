# Linked List: Swap Node
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

**Example:**
```
Given 1->2->3->4, you should return the list as 2->1->4->3.
```

Took me a little on this one, I was struggling to understand how to modify the linked list and return the modified head. What I discovered was that you need another node that you can use as a reference node, and you also need a node that traverses through the list.

For example, to set this up, the following code was used to have a reference node and a traversal node:
```java
        // 0 -> null
        ListNode swap = new ListNode(0);

        // Create a node to traverse through the linked list, 0 -> null
        ListNode traverse = swap;

        // Set the next node for the root to be the head of the input list
        // 0 -> 1 -> 2 -> 3 -> 4 -> null
        traverse.next = head;
```

As you can see, `swap` is a new node that is used to return a reference to the new head of the linked list. You will then see a node named `traverse` which will be used to modify the list.

`swap`: reference node to return the modified list
`traverse`: traversal node which will be used in the loop to actually modify the linked list

The rest of the problem was fairly straightforward, one thing to note that I ran into as well was that you should leverage the `next` node to modify the list instead of modifying the traversal node itself otherwise the list could become unlinked.

For example, you can see that both the reference and traversal node set the _next_ node equal to the head of the input list, instead of setting the nodes themselves equal to the head of the list. This allows the reference node to remain consistent since the first node is being changed out during the swapping portion of the algorithm.

The actual swapping was fairly simple. Two nodes, `first` and `second` were used to hold nodes that were switched around in the list.

```java
// Grab the first node, first = 1 -> 2 -> 3 -> 4 -> null
            ListNode first = traverse.next;

            // Grab the second node, second = 2 -> 3 -> 4 -> null
            ListNode second = traverse.next.next;

```

To swap the adjacent nodes, the `first` node must begin by linking to the third node instead of the second node

```java
            first.next = second.next;
```

Then the traversal node switches the `second` node to be the next node in the traversal.

```java
            traverse.next = second;
```

After that the `second` node must change it's link to be the `first` node, completing the swap.

```java
second.next = first;
```

Then, the traversal node proceeds to iterate through the linked list by setting itself to be the next new second node in the pair so that it can manipulate the next pair in the list.


### Complexity
**O(n)**
