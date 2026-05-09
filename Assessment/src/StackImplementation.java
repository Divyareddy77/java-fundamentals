public class StackImplementation {
    static int top=-1;
    static int[] stack=new int[5];
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        peek();
        pop();
        pop();
        display();

    }


    static void push(int a){
        if(top==stack.length-1){
            System.out.println("stack is full");
        }
        else{
            top++;
            stack[top]=a;
            System.out.println("pushed "+a);
        }

    }
    static void peek(){
        System.out.println(stack[top]);

    }
    static void pop(){
        System.out.println("popped : "+stack[top]);
        top--;



    }
    static void display(){
        System.out.println("current stack :");
        for(int i=top;i>=0;i--){

            System.out.println(stack[i]);
        }
    }
}
