class Element:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self, head=None):
        self.head = head

    def append(self, element):
        if self.head:
            current = self.head
            while current.next:
                current = current.next
            current.next = element
        else:
            self.head = element

    def get_position(self, position):
        """Get an element from a particular position.
        Assume the first position is "1".
        Return "None" if position is not in the list."""
        if position < 1:
            return None
        if self.head:
            current = self.head
            current_position = 1
            while current and current_position <= position:
                if current_position == position:
                    return current
                current = current.next
                current_position += 1

        return None

    def insert(self, new_element, position):
        """Insert a new node at the given position.
        Assume the first position is "1".
        Inserting at position 3 means between
        the 2nd and 3rd elements."""
        if position == 1 or self.head is None:
            new_element.next = self.head
            self.head = new_element
        else:  # position > 1
            current = self.head
            current_position = 1
            # we need to insert new element at position - 1
            while current and current_position < position:
                if current_position == position - 1:
                    new_element.next = current.next
                    current.next = new_element
                current = current.next
                current_position += 1

    def delete(self, value):
        """Delete the first node with a given value."""
        if self.head:
            current = self.head
            previous = None
            while current.value != value and current.next:
                previous = current
                current = current.next
            if current.value == value:
                if previous:
                    previous.next = current.next
                else:  # we need to update head and discard the old head
                    self.head = current.next


if __name__ == "__main__":
    # Test cases
    # Set up some Elements
    e1 = Element(1)
    e2 = Element(2)
    e3 = Element(3)
    e4 = Element(4)

    # Start setting up a LinkedList
    ll = LinkedList(e1)
    ll.append(e2)
    ll.append(e3)

    # Test get_position
    # Should print 1
    print(ll.get_position(1).value)
    # Should print 3
    print(ll.head.next.next.value)
    # Should also print 3
    print(ll.get_position(3).value)

    # Test insert
    ll.insert(e4, 3)
    # Should print 4 now
    print(ll.get_position(3).value)

    # Test delete
    ll.delete(1)
    # Should print 2 now
    print(ll.get_position(1).value)
    # Should print 4 now
    print(ll.get_position(2).value)
    # Should print 3 now
    print(ll.get_position(3).value)

    # Should print 2 now as e1 having 1 is deleted
    print(ll.get_position(1).value)
    # Test insert
    ll.insert(e4, 1)
    # Should print 4 now
    print(ll.get_position(1).value)
