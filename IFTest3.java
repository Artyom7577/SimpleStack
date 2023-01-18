public class IFTest3  {
    public static void main(String[] args) {
        IntStack myStack; // create an interface reference variable
        DynStack ds = new DynStack();
        FixedStack fs = new FixedStack(10);

        myStack = ds; // load dynamic stack
        for(int i = 0; i < 20; i++)
            myStack.push(i);

        myStack = fs;
        for(int i = 0; i < 10; i++)
            myStack.push(i);

        System.out.println("my DynStack");
        myStack = ds;
        for(int i = 0; i < 20; i++)
            System.out.print(myStack.pop() + " ");

        System.out.println();

        System.out.println("my FixedStack");
        myStack = fs;
        for(int i = 0; i < 10; i++)
            System.out.print(myStack.pop() + " ");
    }
}
