public class IFTest {
    public static void main(String[] args) {
        FixedStack myStack = new FixedStack(10);
        for(int i = 0; i < 10; i++)
            myStack.push(i);

        System.out.println("myStack");

        for(int i = 0; i < 10; i++)
            System.out.print(myStack.pop() + " ");
    }
}
