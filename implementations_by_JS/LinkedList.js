class Node {
    constructor(element) {
        this.element = element;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.size = null;
    }
    //add(element)
    add(element) {
        let node = new Node(element);

        if (this.head == null) {
            this.head = node;
            this.size++;
            return
        }
        let current = this.head;
        while (current.next) {
            current = current.next;
        }
        current.next = node;
        this.size++;
    }
    insertAt(element, index) {

        if (index < 0 && index >= this.size) {
            return console.log("insert valid index");
        }
        let node = new Node(element);

        let c = 0;
        let current = this.head;

        let prev = null;
        while (c !== index) {

            prev = current;
            current = current.next;
            c++;
        }
        node.next = current.next;
        prev.next = node;
        this.size++;
    }

    indexOf(element) {
        let found = false;
        let c = 0;
        let current = this.head;
        while (!found) {
            c++;
            if (current.element == element) {
                found = true;
                return c
            }
            current = current.next;

        }

        return console.log("No element found");
    }


    removeAt(index) {

        if (index < 0 && index >= this.size) {
            return console.log("insert valid index");
        }

       
        let current = this.head;

        if(index === 0){
            current = current.next;
            return
        }

        let prev = null;
        let c = 0;
        while (c !== index) {
            prev = current;

            current = current.next;
            c++;
        }
        prev.next = current.next;

    }

    removeElement(element) {
        let index = this.indexOf(element);
        this.removeAt(index)
    }

    isEmpty() {
        return console.log(this.size == 0);
    }
    listSize() {
        return console.log(this.size)
    }
    printList() {
        let i = 0;
        let current = this.head;
        while (i !== this.size) {
            console.log(current.element);
            current = current.next;
            i++;
        }
    }

}

let list = new LinkedList();
list.add("11");
list.add("22");
list.add("33");
list.add("44");
list.add("55");
list.add("66");
list.add("77");

list.printList();

console.log("Inserting 88");
list.insertAt("88", 3);


