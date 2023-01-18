public class IFTest2 {
    public static void main(String[] args) {
        DynStack myStack = new DynStack();

        for(int i = 0; i < 50; i++)
            myStack.push(i);

        System.out.println("myDynStack");

        for(int i = 0; i < 50; i++)
            System.out.print(myStack.pop() + " ");
    }
}
