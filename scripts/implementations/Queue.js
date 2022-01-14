class Queue {

    constructor() {

        this.data = [];
        this.rear = 0;
        this.size = 10;
    }

    enqueue(element) {
        this.data[this.rear] = element;
        this.rear = this.rear + 1;
    }

    length() {

        return this.rear;
    }

    isEmpty() {
   
        return this.rear === 0;
    }

    getFront() {
   
        if(this.isEmpty() === false) {
            return this.data[0];
        }
    }
    getLast() {
    
        if(this.isEmpty() === false) {
          
             return this.data[ this.rear - 1 ] ;
        }
   }

}

