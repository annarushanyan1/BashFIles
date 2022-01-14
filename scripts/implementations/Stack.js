class Stack{
    constructor(){
        this.items = [];
    }

    push(item){
        this.items.push(item)
    }

    pop(){
        this.items.pop()
    }

    peek(){
        return this.items[this.items.length - 1];
    }

    printAll(){
        let str = ""
        for (let i = 0; i < this.items.length; i++) {
            str+=this.items[i]+" "  
        }
        console.log(str);
    }
    
}

let stack = new Stack();
stack.push("11");
stack.push("12");
stack.push("13");
stack.push("14");
stack.push("15");
stack.printAll()
console.log("poping");
stack.pop();
stack.printAll()
